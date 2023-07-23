public class tiling_problem {
  static int tiling(int n){
    if(n==0 || n==1){
      return 1;
    }

    int verticalTiling = tiling(n-1);
    int horizontalTiling = tiling(n-2);
    int totWays = verticalTiling+horizontalTiling;
    return totWays;
  }
  public static void main(String[] args) {
    int n = 4;
    System.out.println(tiling(n));
  }
}
