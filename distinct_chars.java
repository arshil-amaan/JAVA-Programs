public class distinct_chars {
  static StringBuilder distChars(String str){
      StringBuilder newstr = new StringBuilder("");
      boolean map[] = new boolean[26];
      for (int i = 0; i < str.length(); i++) {
        if(map[str.charAt(i)-97]==false){
          map[str.charAt(i)-97]=true;
          newstr.append(str.charAt(i));
      }
    }

    return newstr;
  }
  
  
  static void distChars(String str,int idx,StringBuilder newstr, boolean[] map){
    if(idx==str.length()){
      System.out.println(newstr);
      return;
    }
    if(map[str.charAt(idx)-97]==false){
      map[str.charAt(idx)-97]=true;
      newstr.append(str.charAt(idx));
    }
    distChars(str,idx+1,newstr,map);
  }
  public static void main(String[] args) {
    String str = "aabbccddddaaabtbagcch";
    System.out.println(distChars(str));
    distChars(str,0,new StringBuilder(""),new boolean[26]);
  }
}
