public class firstOccurrence {
  static int findFirstIndexOf(int[] arr, int key, int i) {
    if (i == arr.length) {
      return -1;
    }

    if (key == arr[i]) {
      return i;
    }

    return findFirstIndexOf(arr, key, i + 1);

  }

  public static void main(String[] args) {
    int[] arr = new int[] { 5, 8, 4, 2, 3, 6, 7, 2, 1 };
    int key = 1;
    System.out.println(findFirstIndexOf(arr, key, 0));
  }
}
