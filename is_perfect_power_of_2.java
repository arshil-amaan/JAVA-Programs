public class is_perfect_power_of_2 {
  static void isPerfectPowerOf2(int n){
    if((n & n-1)==0){
      System.out.println(n+" is perfect power of 2");
    } else {
      System.out.println(n+" is not a perfect power of 2");
    }
  }
  public static void main(String[] args) {
    int n = 0;
    isPerfectPowerOf2(n);
  }
}
