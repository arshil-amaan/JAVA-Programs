import java.util.ArrayList;

public class LargestContainer {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    int maxIs = 0;
    list.add(1);
    list.add(8);
    list.add(6);
    list.add(2);
    list.add(5);
    list.add(4);
    list.add(8);
    list.add(3);
    list.add(7);
    for (int i = 0; i < list.size(); i++) {
      for (int j = i+1; j < list.size(); j++) {
        maxIs=Math.max(maxIs, (j-i)*Math.min(list.get(i), list.get(j)));
      }
    }

    System.out.println(maxIs);
  }
}
