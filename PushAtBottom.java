import java.util.*;

public class PushAtBottom {
  public static void bottomPush(Stack<Integer> s, int val) {
    if (s.empty()) {
      s.push(val);
      return;
    }
    int tem = s.pop();
    bottomPush(s, val);
    s.push(tem);
  }

  public static void print(Stack<Integer> s) {
    if (!s.empty()) {
      int t = s.pop();
      System.out.println(t);
      print(s);
      s.push(t);
    }
  }

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    bottomPush(s, 9);
    s.push(6);
    bottomPush(s, 54);
    print(s);
  }
}
