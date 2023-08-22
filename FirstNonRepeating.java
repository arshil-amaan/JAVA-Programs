import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeating {
  public static void nonRepeating(String str) {
    int strLen = str.length();
    int[] freq = new int[26];
    Queue<Character> q = new LinkedList<>();
    for (int i = 0; i < strLen; i++) {
      char curr = str.charAt(i);
      freq[curr - 'a']++;
      q.add(curr);

      // while (!q.isEmpty()) {
      //   if (freq[q.peek() - 'a'] != 1) {
      //     q.remove();
      //   } else {
      //     break;
      //   }
      // }

      while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
        q.remove();
      }
      
      if (q.isEmpty()) {
        System.out.print("-1 ");
      } else {
        System.out.print(q.peek() + " ");
      }
    }

  }

  public static void main(String[] args) {
    nonRepeating("zzzxxywwyvu");
    System.out.println();
    nonRepeating("aabccxb");
  }
}
