// import java.util.*;

// public class rainwater_trap {
//   public static void main(String []args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter n: ");
//     // int n = 6;
//     int n = sc.nextInt();
//     // int arr[] = {4,6,3,5,8,2};
//     int arr[] = new int[n];
//     int maxl[] = new int[n];
//     int maxr[] = new int[n];
    
//     //input elements
//     System.out.print("Enter "+n+" elements: ");
//     for (int i = 0; i < arr.length; i++) {
//       arr[i] = sc.nextInt();
//     }


//     // initialising helping arrays
//     maxl[0]=arr[0];
//     maxr[arr.length-1]=arr[arr.length-1];

//     // printing arrays
//     System.out.println("Array: ");
//     for (int i = 0; i < arr.length; i++) {
//       System.out.print(arr[i]+" ");
//     }
//     System.out.println();

//     // filling helping array from left
//     for (int i = 1; i < arr.length; i++) {
//       if(arr[i]>maxl[i-1]){
//         maxl[i]=arr[i];
//       } else {
//         maxl[i]=maxl[i-1];
//       }
//     }
    
//         // printing arrays
//         System.out.println("Highst in left array: ");
//         for (int i = 0; i < arr.length; i++) {
//           System.out.print(maxl[i]+" ");
//         }
//         System.out.println();
    
//     // filling helping array from right
//     for (int i = arr.length-2; i > -1; i--) {
//       if(arr[i]>maxr[i+1]){
//         maxr[i]=arr[i];
//       } else {
//         maxr[i]=maxr[i+1];
//       }
//     }

//     // printing arrays
//     System.out.println("Highest in right array: ");
//     for (int i = 0; i < arr.length; i++) {
//       System.out.print(maxr[i]+" ");
//     }
//     System.out.println();

//     int water=0;
//     for (int i = 0; i < maxr.length; i++) {
//       water+=Math.min(maxl[i],maxr[i])-arr[i];
//     }

//     System.out.println("Trapepd water is: "+water);
//   }
// }
import java.util.*;

public class rainwater_trap {
  static int trapped_water(int arr[]){
    int n = arr.length;
    int maxl[] = new int[n];
    int maxr[] = new int[n];
    
    // initialising helping arrays
    maxl[0]=arr[0];
    maxr[arr.length-1]=arr[arr.length-1];
    
    // printing arrays
    System.out.println("Array: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    
    // filling helping array from left
    for (int i = 1; i < arr.length; i++) {
      if(arr[i]>maxl[i-1]){
        maxl[i]=arr[i];
      } else {
        maxl[i]=maxl[i-1];
      }
    }
    
        // printing arrays
        System.out.println("Highst in left array: ");
        for (int i = 0; i < arr.length; i++) {
          System.out.print(maxl[i]+" ");
        }
        System.out.println();
    
    // filling helping array from right
    for (int i = arr.length-2; i > -1; i--) {
      if(arr[i]>maxr[i+1]){
        maxr[i]=arr[i];
      } else {
        maxr[i]=maxr[i+1];
      }
    }
    
    // printing arrays
    System.out.println("Highest in right array: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(maxr[i]+" ");
    }
    System.out.println();
    
    int water=0;
    for (int i = 0; i < maxr.length; i++) {
      water+=Math.min(maxl[i],maxr[i])-arr[i];
    }
    
    System.out.println("Trapepd water is: ");
    return water;
  }
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter n: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    
    //input elements
    System.out.print("Enter "+n+" elements: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(trapped_water(arr));
  }
}
