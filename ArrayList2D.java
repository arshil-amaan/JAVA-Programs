import java.util.*;
public class ArrayList2D {
  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    ArrayList<Integer> list3 = new ArrayList<>();

    // ****************************************

    // list.add(1);
    // list.add(2);
    // list.add(3);
    // list.add(4);
    // list.add(5);
    // mainList.add(list);
    // // list.clear();
    // list2.add(2);
    // list2.add(4);
    // list2.add(6);
    // list2.add(8);
    // list2.add(10);
    // list2.add(12);
    // mainList.add(list2);
    // // list.clear();
    // list3.add(3);
    // list3.add(6);
    // list3.add(9);
    // list3.add(12);
    // list3.add(15);
    // mainList.add(list3);

    // ****************************************

    for (int i = 1; i < 6; i++) {
      list.add(i*1);
      list2.add(i*2);
      list3.add(i*3);
    }

    mainList.add(list);
    mainList.add(list2);
    mainList.add(list3);

    // ****************************************

    // traversal
    System.out.println(mainList.size());
    for (int i = 0; i < mainList.size(); i++) {
      for (int j = 0; j < mainList.get(i).size(); j++) {
        System.out.print(mainList.get(i).get(j)+" ");
      }
      System.out.println();
    }
  }
}
