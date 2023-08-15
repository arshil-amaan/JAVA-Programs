import java.util.Stack;

public class RevStr_UsingStack {

  public static StringBuilder revStr(String str){
    Stack<Character> s = new Stack<>();
    StringBuilder ans =new StringBuilder("");
    int idx = 0;
    while(idx<str.length()){
      s.push(str.charAt(idx++));

    }

    while(!s.empty()){
      ans.append(s.pop());
    }

    return ans;
  }
  public static void main(String[] args) {
    String str = "arshil amaan ansari";
    String revStr = revStr(str).toString();
    System.out.println(revStr);
  }
}
