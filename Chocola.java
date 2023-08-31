import java.util.Arrays;
import java.util.Comparator;

public class Chocola {
  public static void main(String[] args) {
      //  ___ ___ ___ ___ ___ ___
      // |___|___|___|___|___|___|4
      // |___|___|___|___|___|___|1
      // |___|___|___|___|___|___|2
      // |___|___|___|___|___|___|
      //     2   1   3   1   4
    // int n = 4, m = 6;
    Integer[] costVer = { 2, 1, 3, 1, 4 }; // m-1
    Integer[] costHor = { 4, 1, 2 }; // n-1

    Arrays.sort(costHor, Comparator.reverseOrder()); // 4,3,2,1,1
    Arrays.sort(costVer, Comparator.reverseOrder()); // 4,2,1

    int h = 0, v = 0; // no. of horizontal & vertical cuts
    int hp = 1, vp = 1; // no. of horizontal & vertical pieces
    int finalCost = 0;
    while (h < costHor.length && v < costVer.length) {
      // vertical cost < horizontal cost
      if (costVer[v] <= costHor[h]) { // horizontal cut
        finalCost += costHor[h] * vp;
        hp++;
        h++;
      } else { // vertical cut
        finalCost += costVer[v] * hp;
        vp++;
        v++;
      }
    }

    while (v < costVer.length) { // remaining Vertical cuts
      finalCost += costVer[v] * hp;
      v++;
      vp++;
    }

    while (h < costHor.length) { // remaining Horizontal cuts
      finalCost += costHor[h] * vp;
      h++;
      hp++;
    }
    System.out.println(finalCost);
  }
}
