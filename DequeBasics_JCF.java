import java.util.Deque;
import java.util.LinkedList;

public class DequeBasics_JCF {
  public static void main(String[] args) {
    Deque<Integer> dq = new LinkedList<>();
    dq.addFirst(3);
    dq.addFirst(2);
    dq.addFirst(1);
    dq.addLast(4);
    dq.addLast(5);
    dq.addLast(6);
    System.out.println(dq.removeFirst());
    System.out.println(dq.removeLast());
    System.out.println(dq.getFirst());
    System.out.println(dq.getLast());
  }
}
