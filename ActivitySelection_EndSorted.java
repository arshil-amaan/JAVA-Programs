public class ActivitySelection_EndSorted {
  public static int selectActivity(int[] s, int[] e) {
    int count = 1;
    int prevEnd = e[0];
    String ans = "A0 ";

    for (int i = 1; i < e.length; i++) {
      if (prevEnd <= s[i]) {
        prevEnd = e[i];
        ans += "A" + (i) + " ";
        count++;
      }
    }
    System.out.println(ans);

    return count;
  }

  public static void main(String[] args) {

    // sorted according to end times

    int[] start = { 1, 3, 0, 5, 8, 5 };
    int[] end = { 2, 4, 6, 7, 9, 9 };
    System.out.println(selectActivity(start, end));
  }
}
