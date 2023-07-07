public class diagonal_sum{
  static void diagonalSum(int arr[][]){
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum+=arr[i][i];
      sum+=arr[i][arr.length-1-i];
    }
    
    if(arr.length%2!=0){
      sum-=arr[arr.length/2][arr.length/2];
    }
    System.out.println(sum);
  }
  public static void main(String[] args) {
    int arr[][] = {{  5,  7,  9},
                   {  6,  5,  3},
                   {  1,  3,  4}};
    diagonalSum(arr);
  }
}