public class NextGreaterElement {
  public static int[] nextGreater(int[] arr) {
    int[] nextGreater = new int[arr.length];
    nextGreater[arr.length - 1] = -1;
    for (int i = 0; i < arr.length; i++) {
      int curr = arr[i];
      for (int j = i + 1; j <= arr.length; j++) {
        if (j == arr.length) {
          nextGreater[i] = -1;
          break;
        }
        if (arr[j] > curr) {
          nextGreater[i] = arr[j];
          break;
        }
      }
    }
    return nextGreater;
  }

  public static void main(String[] args) {
    int[] arr = { 6, 8, 0, 1, 3 };
    int[] nextGreaterArr = nextGreater(arr);
    for (int i = 0; i < nextGreaterArr.length; i++) {
      System.out.print(nextGreaterArr[i] + " ");
    }
  }
}
