public class remove_continuous {
  static String remContinuous(String str){
    String newstr = "";
    for(int i=1; i<str.length(); i++){
      if(str.charAt(i)!=str.charAt(i-1)){
        newstr+=str.charAt(i-1);
      }
      if(i==str.length()-1){
        newstr+=str.charAt(i);
      }
    }
    return newstr;
  }
  public static void main(String[] args) {
    String str = "aaabbccccdaaeeeefggg";
    System.out.println(remContinuous(str));
  }
}
