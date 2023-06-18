import java.util.Scanner;

public class Sub_Arrays {
  static void sub_arrays(int[] myArray) {
    for(int i = 0; i < myArray.length ; i++){
      for(int j = i; j < myArray.length ; j++){
        for(int k = i ; k<=j ; k++){
          System.out.print(myArray[k]+" ");
        }System.out.print("\t");
      }System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = {1, 7, 8, 5, 6};
    sub_arrays(arr);
    sc.close();
  }
}
