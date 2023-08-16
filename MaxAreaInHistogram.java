import java.util.Stack;

public class MaxAreaInHistogram {

  public static int findMaxArea(int[] heights) {
    int[] rMin = new int[heights.length];
    int[] lMin = new int[heights.length];
    lMin = findLMin(heights);
    rMin = findRMin(heights);

    int maxArea = 0;
    for (int i = 0; i < heights.length; i++) {
      int rmin = rMin[i];
      int lmin = lMin[i];
      maxArea = Math.max(maxArea, heights[i] * (rmin - lmin - 1));
    }

    return maxArea;
  }

  public static int[] findRMin(int[] heights) {
    int[] rMin = new int[heights.length];
    Stack<Integer> s = new Stack<>();
    for (int i = heights.length - 1; i > -1; i--) {
      int currNum = heights[i];
      while (!s.empty() && heights[s.peek()] >= currNum) {
        s.pop();
      }
      if (s.empty()) {
        rMin[i] = heights.length;
      } else {
        rMin[i] = s.peek();
      }
      s.push(i);
    }
    return rMin;
  }

  public static int[] findLMin(int[] heights) {
    int[] lMin = new int[heights.length];

    Stack<Integer> s = new Stack<>();
    for (int i = 0; i < heights.length; i++) {
      int currNum = heights[i];
      while (!s.isEmpty() && currNum <= heights[s.peek()]) {
        s.pop();
      }
      if (s.empty()) {
        lMin[i] = -1;
      } else {
        lMin[i] = s.peek();
      }
      s.push(i);
    }
    return lMin;
  }

  public static void main(String[] args) {
    int[] heights = { 2, 1, 5, 6, 2, 3 };
    for (int i = 0; i < heights.length; i++) {
      System.out.print(heights[i] + " ");
    }
    System.out.println();
    System.out.println(findMaxArea(heights));

  }
}
