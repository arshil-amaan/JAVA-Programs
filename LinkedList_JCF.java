import java.util.LinkedList;

public class LinkedList_JCF {
  public static void main(String[] args) {
    LinkedList<Integer> lList = new LinkedList<>();

    lList.addLast(3);
    lList.addLast(4);
    lList.addFirst(2);
    lList.addLast(5);
    lList.addFirst(1);

    System.out.println(lList);
    lList.removeLast();
    lList.removeFirst();
    System.out.println(lList);
    System.out.println(lList);
  }
}
