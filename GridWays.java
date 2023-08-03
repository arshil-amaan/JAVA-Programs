// bad optimised but easier to understand
public class GridWays {
  static int gridWays(int i, int j, int row, int col){
    if(i==row-1 && j==col-1){
      return 1;
    } else if(i==row || j==col) {
      return 0;
    }
    int rightWays = 0;
    int downWays = 0;
    rightWays = gridWays(i+1, j, row, col);
    downWays = gridWays(i, j+1, row, col);
    int totWays = rightWays + downWays;
    return totWays;
  }
  public static void main(String[] args) {
    int row = 8;
    int col = 8;
    System.out.println(gridWays(0,0,row,col));
  }
}