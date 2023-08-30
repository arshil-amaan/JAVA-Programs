import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
  public static int knapsack(int[] weight, int[] value, int sackCapacity) {
    int maxVal = 0;
    double[][] ratio = new double[weight.length][2];
    for (int i = 0; i < ratio.length; ++i) {
      ratio[i][0] = i;
      ratio[i][1] = (double) value[i] / weight[i];
    }

    Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

    for (int i = ratio.length - 1; i >= 0; i--) {
      int idx = (int) ratio[i][0];
      if (sackCapacity >= weight[idx]) {
        sackCapacity -= weight[idx];
        maxVal += value[idx];
      } else {
        maxVal += ratio[i][1] * sackCapacity;
        sackCapacity = 0;
        break;
      }
    }
    return maxVal;
  }

  public static void main(String[] args) {
    int sackCapacity = 50;
    int[] weight = { 10, 20, 30 };
    int[] value = { 60, 100, 120 };
    System.out.println(knapsack(weight, value, sackCapacity));

  }
}
