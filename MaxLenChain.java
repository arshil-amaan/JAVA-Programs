import java.util.Arrays;
import java.util.Comparator;

public class MaxLenChain {
  public static int findMaxLenChain(int[][] pairs){
    int chainLen = 1;
    int chainEnd=pairs[0][1];
    Arrays.sort(pairs,Comparator.comparingInt(o->o[1]));
    for (int i = 1; i < pairs.length; i++) {
      if(pairs[i][0]>chainEnd){
        chainLen++;
        chainEnd=pairs[i][1];
      }
    }
    return chainLen;
  }
  public static void main(String[] args) {
    int[][] pairs = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
    System.out.println(findMaxLenChain(pairs));
  }
}
