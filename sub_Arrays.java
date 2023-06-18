import java.util.Scanner;

public class sub_Arrays {
  static void sub_arrays(int[] myArray) {
    int totSA = 0;
    for(int i = 0; i < myArray.length ; i++){
      for(int j = i; j < myArray.length ; j++){
        for(int k = i ; k<=j ; k++){
          System.out.print(myArray[k]+" ");
        }
        System.out.println();
        totSA++;
      }
	  System.out.println("\n");
    }
    System.out.println("Total no. of sub arrays : "+totSA);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = {1, 7, 8, 5, 6};
    sub_arrays(arr);
    sc.close();
  }
}
