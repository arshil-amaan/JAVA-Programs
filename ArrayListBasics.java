import java.util.*;
public class ArrayListBasics {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // creation
    ArrayList<Integer> arrList = new ArrayList<>();

    // T.C. O(1)
    // appends at the end
    arrList.add(5);
    arrList.add(7);
    arrList.add(3);
    
    // no. of elements
    System.out.println(arrList.size());
    
    // insert at specific index
    arrList.add(1, 9);
    
    // prints ArrayList
    System.out.println(arrList);
    
    // accepts appending using user's input
    arrList.add(sc.nextInt());
    
    // T.C. O(1)
    // returns element at specified index
    System.out.println(arrList.get(2));
    
    // T.C. O(n)
    // delete at index
    arrList.remove(2);
    
    // T.C. O(n)
    // replace element at index
    arrList.set(1, 10);
    
    // T.C. O(n)
    // returns true if element exists in ArrayList
    System.out.println(arrList.contains(2));
    System.out.println(arrList.contains(3));

    // traversal
    for (int i = 0; i < arrList.size(); i++) {
      System.out.print(arrList.get(i)+" ");
    }
    sc.close();
  }
}
