public class spiral_array {
  public static void printSpiralArray(int[][] arr) {
    int top=0,left=0,right=arr[0].length-1,bottom=arr.length-1;
    
    while(top<=bottom && left<=right){
      // top
      for (int i = left; i <= right; i++) {
        System.out.print(arr[top][i]+" ");
      }
      top++;
      
      // right
      for (int i = top; i <= bottom; i++) {
        System.out.print(arr[i][right]+" ");
      }
      right--;
      
      // bottom
      for (int i = right; i >= left; i--) {
        System.out.print(arr[bottom][i]+" ");
      }
      bottom--;
      
      // left
      for (int i = bottom; i >= top; i--) {
        System.out.print(arr[i][left]+" ");
      }
      left++;
    }
  }

  public static void main(String[] args) {
    int[][] arr = { { 1,   2,   3,  16 },
                    { 4,   5,   6,  17 },
                    { 7,   8,   9,  18 },
                    { 10, 11,  12,  19 },
                    { 13, 14,  15,  20 }};
      printSpiralArray(arr);
  }
}
