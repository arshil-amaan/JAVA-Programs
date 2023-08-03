public class NQueensCount {

  static void nQueens(char[][] arr, int i) {
    if (i == arr.length) {
      count++;
      return;
    }
    for (int j = 0; j < arr.length; j++) {
      if (isSafe(arr, i, j)) {
        arr[i][j] = 'Q';
        nQueens(arr, i + 1);
        arr[i][j] = '.';
      }
    }
  }

  static boolean isSafe(char[][] arr, int i, int j) {
    int temi = i;
    int temj = j;

    // check up
    while (temi > -1) {
      if (arr[temi][j] == 'Q') {
        return false;
      }
      temi--;
    }
    temi = i;
    temj = j;

    // check up left
    while (temj > -1 && temi > -1) {
      if (arr[temi][temj] == 'Q') {
        return false;
      }
      temi--;
      temj--;
    }
    temi = i;
    temj = j;

    // check up right
    while (temj < arr[0].length && temi > -1) {
      if (arr[temi][temj] == 'Q') {
        return false;
      }
      temi--;
      temj++;
    }
    return true;
  }

  static int count = 0;

  public static void main(String[] args) {
    int n = 5;
    char[][] arr = new char[n][n];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        arr[i][j] = '.';
      }
    }
    nQueens(arr, 0);
    System.out.println("No. of possible solutions : "+count);
  }
}