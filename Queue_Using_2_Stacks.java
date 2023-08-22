import java.util.Stack;

public class Queue_Using_2_Stacks {
  public static class Queue{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public boolean isEmpty(){
      return s1.size()==0;
    }

    public void add(int val){
      if(isEmpty()){
        s1.push(val);
        return;
      }
      while(s1.size()!=0){
        s2.push(s1.pop());
      }
      s1.push(val);
      while(s2.size()!=0){
        s1.push(s2.pop());
      }
    }

    public int remove(){
      if(isEmpty()){
        return -1;
      }
      return s1.pop();
    }

    public int peek(){
      if(isEmpty()){
        return -1;
      }
      return s1.peek();
    }
  }
  public static void main(String[] args) {
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    System.out.println("Peek: "+q.peek());
    System.out.println(q.remove());
    System.out.println(q.remove());
    System.out.println(q.remove());
    System.out.println(q.remove());
    System.out.println(q.remove());
  }
}
