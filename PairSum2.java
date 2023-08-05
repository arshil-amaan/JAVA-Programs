import java.util.*;

public class PairSum2 {
  static boolean pairSumRotatedOptim(ArrayList<Integer> list, int target) {
    int lp = 0;
    int rp = list.size() - 1;
    int n = list.size();
    for (int i = 0; i < list.size() - 1; i++) {
      if (list.get(i) > list.get(i + 1)) {
        rp = i;
        lp = i + 1;
        break;
      }
    }
    while (lp != rp) {
      if (list.get(rp) + list.get(lp) == target) {
        System.out.println("Found at index : "+lp+" and "+rp);
        return true;
      } else if (list.get(rp) + list.get(lp) > target) {
        rp = (n + rp - 1) % n;
      } else if (list.get(rp) + list.get(lp) < target) {
        lp = (n + lp + 1) % n;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(12);
    list.add(16);
    list.add(19);
    list.add(1);
    list.add(3);
    list.add(4);
    list.add(8);
    int target = 25;
    if (!pairSumRotatedOptim(list, target)) {
      System.out.println("Not Found");
    }
  }
}
