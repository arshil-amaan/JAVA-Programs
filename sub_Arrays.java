import java.util.Scanner;

public class Sub_Arrays {
  static void sub_arrays(int[] myArray) {
    int maxis = myArray[0];
    int minis = myArray[0];
    int sum = 0;
    int totSA = 0;
    for(int i = 0; i < myArray.length ; i++){
      for(int j = i; j < myArray.length ; j++){
        for(int k = i ; k<=j ; k++){
          System.out.print(myArray[k]+" ");
          sum+=myArray[k];
        }
        System.out.println();
        totSA++;
        if(sum>maxis){
          maxis=sum;
        }
        if(sum<minis){
          minis=sum;
        }
        sum=0;
      }System.out.println();
    }
    System.out.println("Total no. of sub arrays : "+totSA);
    System.out.println("maximum of sub arrays : "+maxis);
    System.out.println("minimum of sub arrays : "+minis);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = {4, -7, 8, -3, 6};
    sub_arrays(arr);
    sc.close();
  }
}
