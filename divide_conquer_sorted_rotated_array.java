public class divide_conquer_sorted_rotated_array {
  static int search(int[] arr, int target, int si, int ei) {
    if (si > ei) {
      return -1;
    }

    int mid = si + (ei - si) / 2;
    if (target == arr[mid]) {
      return mid;
    }

    if (arr[si] <= arr[mid]) {
      if (target >= arr[si] && target <= arr[mid]) {
        return search(arr, target, si, mid - 1);
      } else {
        return search(arr, target, mid + 1, ei);
      }
    } else {
      if (target <= arr[ei] && target >= arr[mid]) {
        return search(arr, target, mid + 1, ei);
      } else {
        return search(arr, target, si, mid - 1);
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
    int target = 6;
    int idx = search(arr, target, 0, arr.length - 1);
    System.out.println(idx);
  }
}
