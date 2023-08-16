import java.util.*;

public class DuplicateParanthesis {
  public static boolean hasDuplicatePar(String str) {
    Stack<Character> s = new Stack<>();
    for (int i = 0; i < str.length(); i++) {

      char ch = str.charAt(i);
      
      if (ch != ')') {
      
        s.push(ch);
        // System.out.println(s);
      } else {
      
        int count = 0;
      
        while (s.pop() != '(') {
          count++;
          // System.out.println(s);
        }
      
        if (count == 0) {
          return true;
        }
      
      }
    }
    return false;
  }

  public static void main(String[] args) {
    String str = "((a+(b)))+((c)+d)";
    // String str = "(((a+(b))))+((c)+d)";
    // String str = "((a+b)+(c+(d)))";
    // String str = "((b)+c)";

    System.out.println(hasDuplicatePar(str));
  }
}
