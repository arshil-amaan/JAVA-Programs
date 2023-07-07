public interface sorting {
  static void bubbleSort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      // int swap=0; // to count swaps
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          // swap++;
        }
      }
      // System.out.print(swap+" ");
      // System.out.println();
    }
  }

  static void selectionSort(int arr[]) {
    // int swap = 0; // to count swaps
    for (int i = 0; i < arr.length - 1; i++) {
      int minValIdx = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[minValIdx] > arr[j]) {
          minValIdx = j;
        }
      }
      int temp = arr[minValIdx];
      arr[minValIdx] = arr[i];
      arr[i] = temp;
      // swap++;
    }
    // System.out.println(swap); // in selection sort swap count always be (n-1)
  }

  static void insertionSort(int arr[]){
    for (int i = 1; i < arr.length; i++) {
      // grab and store first unsorted element
      int temp=arr[i];
      // initialise j with last sorted to compare
      int j=i-1;
      // untill you reach first sorted or found smaller than first unsorted
      while(j>=0 && arr[j]>temp){
        // copy the previous element to current position
        arr[j+1]=arr[j];
        // keep going backward
        j--;
      }
      // arr[j] is greater than first unsorted
      arr[j+1]=temp;
    }
  }

  static void countingSort(int arr[]){
    // find largest element in array
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      max=max>arr[i]?max:arr[i];
    }

    // make new array count of size of lagest element in array
    int count[] = new int[max+1];

    // count which element came how many times in original array
    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }

    // replace elements of original
    // with counted elements
    int idx=0;
    for (int i = 0; i < count.length; i++) {
      while(count[i]>0){
        arr[idx]=i;
        idx++;
        count[i]--;
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 5,5,4,4,4,4,7,8,4,4,8,9,6,5,7,7,5,2};

    // compare, pick larger, take it to last
    // bubbleSort(arr);

    // find smallest swap with sorted+1
    // selectionSort(arr);

    // first unsorted to correct order on left
    // insertionSort(arr);

    // best for small numbers, counts how many which
    // countingSort(arr);


    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
