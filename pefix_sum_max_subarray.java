import java.util.*;
 public class pefix_sum_max_subarray {
  static int maxsubarrayprefix(int arr[]){
    int prefixarr[] = new int[arr.length];
    prefixarr[0]=arr[0];
    for(int i = 1 ; i<arr.length ; i++){
      prefixarr[i]=prefixarr[i-1]+arr[i];
    }
    System.out.println();
    System.out.print("Prefix Array is: ");
    for(int i = 0 ; i<arr.length ; i++){
      System.out.print(prefixarr[i]+" ");
    }

    int maxis=arr[0];
    // System.out.println("\ni\tj\tmaxis");
    for (int i = 0; i < prefixarr.length; i++) {
      for (int j = i; j < prefixarr.length; j++) {
        int temp, start = i , end = j;
        if(i==0){
          temp = prefixarr[end];
        } else{
          temp = prefixarr[end]-prefixarr[start];
        }
        if(maxis<temp){
          maxis=temp;
        }
        // steps
        // System.out.println(i+"\t"+j+"\n"+prefixarr[i]+"\t"+prefixarr[j]+"\t"+temp);
      }
      // System.out.println("******************************");
    }
    System.out.println("\nMax sub array is "+maxis);
    return maxis;
  }
  public static void main( String[] args){
    try (Scanner sc = new Scanner(System.in)) {
      int size = 0;
      System.out.print("Enter Size: ");
      size = sc.nextInt();
      
      int arr[] = new int[size];
      
      System.out.print("Enter Elements: ");
      for(int i = 0 ; i<size ; i++){
        arr[i] = sc.nextInt();
      }
      
      System.out.print("Array is: ");
      for(int i = 0 ; i<size ; i++){
        System.out.print(arr[i]+" ");
      }
      
      maxsubarrayprefix(arr);
    }
  }
 }
