public class sorting_divide_conquer {
  static void printArr(int[] arr) {
    // Prints Array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static void mergeSort(int[] arr, int si, int ei) {

    // Base case
    if (si >= ei) {
      return;
    }

    // finding mid
    int mid = si + (ei - si) / 2;
    // Recalling left
    mergeSort(arr, si, mid);
    // Recalling right
    mergeSort(arr, mid + 1, ei);
    // merging together
    merge(arr, si, mid, ei);
  }

  static void merge(int[] arr, int si, int mid, int ei) {
    int[] temp = new int[ei - si + 1];
    int i = si;
    int j = mid + 1;
    int k = 0;

    // Merging left and right and storing in temp
    while (i <= mid && j <= ei) {
      if (arr[i] < arr[j]) {
        temp[k] = arr[i];
        i++;
      } else {
        temp[k] = arr[j];
        j++;
      }
      k++;
    }

    // Inserting remaining left
    while (i <= mid) {
      temp[k++] = arr[i++];

      // Inserting remaining right
      while (j <= ei) {
        temp[k++] = arr[j++];
      }

      // inserting in actual array
      for (k = 0, i = si; k < temp.length; k++, i++) {
        arr[i] = temp[k];
      }
    }
  }

  // ******************************

  static void quickSort(int[] arr, int si, int ei){

    if(si>=ei){
      return;
    }

    int pivot_idx = partition(arr, si, ei);
    quickSort(arr, si, pivot_idx-1);
    quickSort(arr, pivot_idx+1, ei);
  }

  static int partition(int[] arr, int si, int ei){
    int pivot = arr[ei];
    int i=si-1;
    for (int j = si; j < ei; j++) {
      if(arr[j]<=pivot){
        i++;
        int temp = arr[i]; arr[i]=arr[j]; arr[j]= temp; 
      }
    }
    i++;
    int temp = pivot; arr[ei]=arr[i]; arr[i]= temp;
    return i;
  }

  public static void main(String[] args) {
    int[] arr = { 6, 3, 4, 9, 8, 2, 5 };

    // mergeSort(arr, 0, arr.length - 1);

    // quickSort(arr, 0, arr.length-1);
    
    printArr(arr);


  }
}