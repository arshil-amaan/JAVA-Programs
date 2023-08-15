import java.util.Stack;

public class ReverseStack {
  public static void bottomPush(Stack<Integer> s, int tem) {
    if (s.empty()) {
      s.push(tem);
      return;
    }
    int num = s.pop();
    bottomPush(s, tem);
    s.push(num);
  }

  public static void revStack(Stack<Integer> s) {
    if (s.empty()) {
      return;
    }
    int tem = s.pop();
    revStack(s);
    bottomPush(s, tem);
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
    s.push(8);
    // System.out.println(s);
    print(s);
    revStack(s);
    print(s);
  }
}
