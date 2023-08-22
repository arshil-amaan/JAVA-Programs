import java.util.LinkedList;
import java.util.Queue;

public class Stack_Using_2_Queue {
  public static class Stack{
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public boolean isEmpty(){
      return q1.isEmpty() &&  q2.isEmpty();
    }

    public void add(int val){
      if(q1.isEmpty()){
        q1.add(val);
        while (q2.size()!=0) {
          q1.add(q2.remove());
        }
        return;
      }
      if(q2.isEmpty()){
        q2.add(val);
        while (q1.size()!=0) {
          q2.add(q1.remove());
        }
        return;
      }
    }

    public int remove(){
      if(q1.isEmpty()){
        return q2.remove();
      }
      return q1.remove();
    }

    public int peek(){
      if(q1.isEmpty()){
        return q2.peek();
      }
      return q1.peek();
    }
  }
  public static void main(String[] args) {
    Stack s = new Stack();
    s.add(1);
    s.add(2);
    s.add(3);
    s.add(4);
    s.add(5);
    System.out.println("Peek: "+s.peek());
    System.out.println(s.remove());
    System.out.println(s.remove());
    System.out.println(s.remove());
    System.out.println(s.remove());
    System.out.println(s.remove());
  }
}
