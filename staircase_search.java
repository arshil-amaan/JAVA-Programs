public class staircase_search {

  // starting from upper right
  static void staircaseSearch(int arr[][], int target){
    int col = arr[0].length-1;
    int row = 0;
    while (row<arr.length && col>=0) {
      if(arr[row][col]==target){
        System.out.println("Found at : "+row+","+col);
        return;
      } else if (arr[row][col]>target){
        col--;
      } else if(arr[row][col]<target){
        row++;
      }
    }
    System.out.println("Not Found");
  }
  
  // starting from lower left
  // static void staircaseSearch(int arr[][], int target){
  //   int row = arr.length-1;
  //   int col = 0;
  //   while (row>=0 && col<arr[0].length) {
  //     if(arr[row][col]==target){
  //       System.out.println("Found at : "+row+","+col);
  //       return;
  //     } else if (arr[row][col]>target){
  //       row--;
  //     } else if(arr[row][col]<target){
  //       col++;
  //     }
  //   }
  //   System.out.println("Not Found");
  // }

  public static void main(String[] args) {
    int arr[][] = {{ 10, 20, 30, 40 },
                    {15, 25, 36, 45 },
                    {27, 35, 37, 48 },
                    {32, 36, 39, 50 }};
    int target = 40;
    staircaseSearch(arr,target);
  }
}
