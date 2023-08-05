import java.util.*;
public class ArrayListPractice {
  static void revArrayList(ArrayList<Integer> list){
    for (int i = list.size()-1; i >-1 ; i--) {
      System.out.print(list.get(i)+" ");
    }
  }
  static int findMax(ArrayList<Integer> list){
    int maxIs = list.get(0);
    for (int i = 1; i < list.size(); i++) {
      maxIs=maxIs>list.get(i)?maxIs:list.get(i);
    }
    return maxIs;
  }

  static void swapIndex(ArrayList<Integer> list, int idx1, int idx2){
    int temp = list.get(idx2);
    list.set(idx2, list.get(idx1));
    list.set(idx1, temp);
  }
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(8);
    list.add(4);
    list.add(5);
    // revArrayList(list);

    // System.out.println(findMax(list));
    
    // swapIndex(list, 1, 4);
    
    // Collections.sort(list); // Ascending sorting
    
    // Collections.sort(list, Collections.reverseOrder());    // Use of comparator - function logic

    // Collections.reverse(list);  //reverses the ArrayList

    System.out.println(list);
    System.out.println(list);

  }
}
