// optimised
public class GridWaysOptimised {
  static int fact(int n){
    if(n<2){
      return 1;
    }
    return n*fact(n-1);
  }
  static int gridWays(int row, int col){
    return fact(row+col-2)/(fact(row-1)*fact(col-1));
  }
  public static void main(String[] args) {
    int row = 8;
    int col =8;
    System.out.println(gridWays(row,col));
  }
}
