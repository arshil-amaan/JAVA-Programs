import java.util.Arrays;

public class MinAbsDiff {
  public static int findMinAbsDiff(int[] a, int[] b){
    int minDiff = 0;
    Arrays.sort(a);
    Arrays.sort(b);
    for (int i = 0; i < b.length; i++) {
      minDiff+=Math.abs(a[i]-b[i]);
    }
    return minDiff;
  }
  public static void main(String[] args) {
    int[] a = {4,1,8,7};
    int[] b = {2,3,6,5};
    System.out.println(findMinAbsDiff(a,b));
  }
}
