public class firstOccurrence {
  static int findFirstIndexOf(int[] arr, int key, int i) {
    if (key == arr[i]) {
      return i;
    }

    if (i == arr.length - 1) {
      return -1;
    }

    return findFirstIndexOf(arr, key, i + 1);

  }

  public static void main(String[] args) {
    int[] arr = new int[] { 5, 8, 4, 2, 3, 6, 7, 9, 1 };
    int key = 2;
    System.out.println(findFirstIndexOf(arr, key, 0));
  }
}