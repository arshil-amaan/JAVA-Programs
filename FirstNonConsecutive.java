import java.util.LinkedList;
import java.util.Queue;

public class FirstNonConsecutive {
  public static char nonConsecutive(String str) {
    int count = 1;
    int idx = 1;
    Queue<Character> q = new LinkedList<>();
    q.add(str.charAt(0));
    while (idx != str.length()) {
      char currFront = q.remove();
      char newChar = str.charAt(idx);
      if (currFront == newChar) {
        ++count;
        q.add(newChar);
      } else {
        if (count == 1) {
          return currFront;
        }
        count = 1;
        q.add(newChar);
      }
      idx++;
    }
    if (count == 1) {
      return q.remove();
    }
    return '*';
  }

  public static void main(String[] args) {
    System.out.println(nonConsecutive("aabbbccdrrrffgghyy")); // repeat nonCons      d
    System.out.println(nonConsecutive("abbbccdrrrffgghyy")); // first nonCons        a
    System.out.println(nonConsecutive("aabbbccddrrrffgghhhy")); // last nonCons      y
    System.out.println(nonConsecutive("aabbbccdddrffgghyy")); // only 1 nonCons      r
    System.out.println(nonConsecutive("aabbbccdddrrrffgghhyy")); // no nonCons       *
    System.out.println(nonConsecutive("abcdrfghy")); // all nonCons                  a
    System.out.println(nonConsecutive("f")); // only 1 char                          f
  }
}
