import java.util.Scanner;

public class ArrayCRUD {
  static void reverse(int[] myArray) {
    for(int i = 0; i < myArray.length/2 ; i++) {
      int temp = myArray[i];
      myArray[i] = myArray[myArray.length-1-i];
      myArray[myArray.length-1-i] = temp;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = {1, 7, 8, 5, 6};
    System.out.println("\nPreviously :");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    reverse(arr);

    System.out.println("\nNow :");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }
}
