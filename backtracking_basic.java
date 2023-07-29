public class backtracking_basic{
  static void minus2(int[] arr , int i, int val){
    if(i==arr.length){
      for (int j : arr) {
        System.out.print(j+" ");
      }
        System.out.println();
      return ;
    }
    arr[i]=val;
    minus2(arr, i+1, val+1);
    arr[i]-=2;
  }
  public static void main(String[] args) {
    int[] arr = new int[5];
    minus2(arr , 0, 1);
    for (int j : arr) {
      System.out.print(j+" ");
    }
  }
}