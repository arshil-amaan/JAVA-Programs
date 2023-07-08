public class fast_expo {
  static void fastExpo(int n, int exp) {
    int ans = 1;
    while (exp != 0) {
      if ((exp & 1) != 0) {
        ans *= n;
      }
      n*=n;
      exp>>=1;
    }
    System.out.println(ans);
  }

  public static void main(String[] args) {
    int n = 3;
    int exp = 2;
    fastExpo(n, exp);
  }
}
