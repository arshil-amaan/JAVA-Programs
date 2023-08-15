import java.util.*;

public class StackBasics_ArrayList {
  static class Stack {
    static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isEmpty() {
      return (list.size() == 0);
    }

    public void push(int val) {
      list.add(val);
    }

    public int pop() {
      if (isEmpty()){
        System.out.println("Stack is empty");
        return -1;
      }
      int val = list.get(list.size() - 1);
      list.remove(list.size() - 1);
      return val;
    }

    public int peek() {
      if (isEmpty()){
        System.out.println("Stack is empty");
        return -1;
      }
      return list.get(list.size()-1);
    }
  }

  // Stack stk;
  // int top = -1;

  public static void main(String[] args) {
    Stack stk = new Stack();
    stk.push(4);
    stk.push(2);
    stk.push(7);
    stk.push(6);
    System.out.println(stk.pop());
    System.out.println(stk.peek());
    stk.push(5);
    System.out.println(stk.peek());
    System.out.println(stk.pop());
    System.out.println(stk.pop());
    System.out.println(stk.pop());
    System.out.println(stk.pop());
    System.out.println(stk.peek());
  }
}
