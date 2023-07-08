public class string_compression {
  static void compressString(String str){
    StringBuilder newStr = new StringBuilder("");
    for (int i = 0; i < str.length()-1; i++) {
      int count=1;
      newStr.append(str.charAt(i));
      while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
        count++;
        i++;
      }
      if(count>1){
        newStr.append(count);
      }
    }
    System.out.println("Compressed: "+newStr+" length:"+newStr.length());
  }
  public static void main(String[] args) {
    String str = "aaaaccdeeeaaa";
    System.out.println("Uncompressed: "+str+" length:"+str.length());
    compressString(str);
  }
}