public class NQueensBool {
	static boolean nQueens(char[][] arr, int i) {
		if (i == arr.length) {
			System.out.println("It's Possible");
			printArr(arr);
			return true;
		}
		for (int j = 0; j < arr.length; j++) {
			if (isSafe(arr, i, j)) {
				arr[i][j] = 'Q';
				if (nQueens(arr, i + 1)) {
					return true;
				} else {
					arr[i][j] = '.';
				}
			}
		}
		return false;
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

  static void printArr(char[][] arr) {
    System.out.println("----------Chess Board----------");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int n = 10;
    char[][] arr = new char[n][n];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        arr[i][j] = '.';
      }
    }
    if (!nQueens(arr, 0)) {
      System.out.println("No Solution Found!");
    }
  }
}
