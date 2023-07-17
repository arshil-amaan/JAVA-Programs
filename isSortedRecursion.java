public class isSortedRecursion {
  static boolean isSortedArray(int arr[], int i) {
    if (i == arr.length) {
      return true;
    }
    if (arr[i - 1] > arr[i]) {
      return false;
    } else {
      return isSortedArray(arr,i+1);
    }

  }

  public static void main(String[] args) {
    int arr[] = new int[] { 0, 5, 7, 17, 18, 30 };
    if(isSortedArray(arr,1)){
      System.out.println("Array is sorted");
    } else {
      System.out.println("Array is not sorted ");
    }
  }
}