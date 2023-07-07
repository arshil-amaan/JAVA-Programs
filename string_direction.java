public class string_direction {
  static void shortestDistance(String str){
    int x = 0, y = 0;
    for (int k = 0; k < str.length(); k++) {
      if(str.charAt(k)=='E'){
        x++;
      } else if(str.charAt(k)=='W'){
        x--;
      } else if(str.charAt(k)=='N'){
        y++;
      } else if(str.charAt(k)=='S'){
        y--;
      }
    }
    System.out.println(Math.sqrt(x*x+y*y));
  }
  public static void main(String[] args) {
    String str = "WNEENESENNN";
    shortestDistance(str);
  }
}
