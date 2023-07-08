public class get_set_clear_ith_bit {
  static void getIthbit(int n, int i) {
    System.out.println((n & (1 << i)) > 0 ? 1 : 0);
  }


  static void setIthbit(int n, int i) {
    // if ith position is 0 then change it to 1 else do nothing
    System.out.println(n | (1 << i));
  }

  static void clearIthbit(int n, int i) {
    // if ith position is 1 then change it to 0 else do nothing
  System.out.println(n &  ~(1 << i));
  }

  public static void main(String[] args) {
    int n = 10;
    int i = 3;
    // getIthbit(n,i);
    // setIthbit(n, i);
    // clearIthbit(n, i);

  }
}
