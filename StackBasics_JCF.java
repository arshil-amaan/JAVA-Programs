import java.util.*;

public class StackBasics_JCF {
  public static void main(String[] args) {
    Stack<Integer> stk = new Stack<>();
    stk.push(5);
    stk.push(8);
    stk.push(6);
    System.out.println(stk);
    System.out.println(stk.pop());
    System.out.println(stk);
    System.out.println(stk.size());
  }
}
