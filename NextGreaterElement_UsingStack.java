import java.util.Stack;

public class NextGreaterElement_UsingStack {
  public static int[] nextGreater2(int[] arr) {

    Stack<Integer> s = new Stack<>();

    int[] nextGreater = new int[arr.length];

    for (int i = 0; i < arr.length ; i++) { // next left
    // for (int i = arr.length; i > -1; i--) { // next right
      // while (!s.empty() && arr[i] > s.peek()) {
      while (!s.empty() && arr[i] < arr[s.peek()]) { // next lower
      // while (!s.empty() && arr[i] > arr[s.peek()]) { // next greater
        s.pop();
      }

      if (s.empty()) {
        nextGreater[i] = -1;
      } else {
        // nextGreater[i] = s.peek();
        nextGreater[i] = arr[s.peek()];
      }

      // s.push(arr[i]);
      s.push(i);
    }
    return nextGreater;
  }

  public static void main(String[] args) {
    int[] arr = { 7, 5, 6, 8, 9, 1, 2, 8, 4, 9, 2, 7 };
    int[] nextGreaterArr = nextGreater2(arr);
    for (int i = 0; i < nextGreaterArr.length; i++) {
      System.out.print(nextGreaterArr[i] + " ");
    }
  }
}
