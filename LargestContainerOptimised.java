import java.util.ArrayList;

public class LargestContainerOptimised {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    int maxIs = 0;
    // list.add(1);
    // list.add(8);
    // list.add(6);
    // list.add(2);
    // list.add(5);
    // list.add(4);
    // list.add(8);
    // list.add(3);
    // list.add(7);
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(8);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);
    int fp = 0;
    int lp = list.size()-1;
    while (fp<lp) {
      maxIs=Math.max(maxIs, (lp-fp)*Math.min(list.get(fp), list.get(lp)));
      if(list.get(fp)>list.get(lp)){
        lp--;
      } else {
        fp++;
      }
    }
    System.out.println(maxIs);
  }
}
