import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics_JCF {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(5);
    System.out.println(q.peek());
    System.out.println(q.remove());
    System.out.println(q.peek());
    q.add(8);
  }
}
