public class string_subset {
  static void stringSubset(String str, String ans, int i){
    if (i == str.length()){
      System.out.print(ans+"   ");
      return;
    }
    stringSubset(str, ans+str.charAt(i), i+1);
    stringSubset(str, ans, i+1);
  }
  public static void main(String[] args) {
    String str = "abc";
    stringSubset(str, "" ,0);
  }
}
