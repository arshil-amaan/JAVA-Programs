import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection_Unsorted {
  public static int selectActivity(int[] s, int[] e) {
    int[][] activities = new int[s.length][3];
    for (int i = 0; i < activities.length; i++) {
      activities[i][0] = i;
      activities[i][1] = s[i];
      activities[i][2] = e[i];
    }
    // Lambda function
    Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

    for (int i = 0; i < activities.length; i++) {
      System.out.println(activities[i][0] + " " + activities[i][1] + " " + activities[i][2]);
    }

    int count = 1;
    int prevEnd = activities[0][1];
    StringBuilder acts = new StringBuilder("A0");
    for (int i = 1; i < activities.length; i++) {
      if (prevEnd <= activities[i][1]) {
        count++;
        prevEnd = activities[i][2];
        acts.append(", A" + i);
      }
    }
    System.out.println("Activities: " + acts);
    return count;
  }

  public static void main(String[] args) {
    int[] start = { 0, 1, 3, 5, 5, 8 };
    int[] end = { 6, 2, 4, 7, 9, 9 };
    System.out.println("Number of Activities: " + selectActivity(start, end));
  }
}
