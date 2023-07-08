public class bit_manipulation {
  static void getIthbit(int n, int i) {
    // print ith bit
    System.out.println((n & (1 << i)) > 0 ? 1 : 0);
  }

  static void setIthbit(int n, int i) {
    // if ith position is 0 then change it to 1 else do nothing
    int bitMask = (1 << i); // 0000 1000
    System.out.println(n | bitMask);
  }

  static void clearIthbit(int n, int i) {
    // if ith position is 1 then change it to 0 else do nothing
    int bitMask = ~(1 << i); // 1111 0111
    System.out.println(n & bitMask);
  }

  static void updateIthbit(int n, int i, int myBit) {
    // make ith bit as myBit
    if (myBit == 0) {
      clearIthbit(n, i);
    } else {
      setIthbit(n, i);
    }
  }

  static void clearIbits(int n, int i) {
    // make last i bits 0
    int bitMask = (~0 << i); // 1111 1000
    System.out.println(n & bitMask);
  }

  static void clearBitRange(int n, int i, int j) {
    // make i to j bits 0
    int bitMask = (~0 << j) | (1 << i) - 1; // 1100 0111
    System.out.println(n & (~0 << j) | ~(~0 << i));
    System.out.println(n & (~0 << j) | (1 << i) - 1);
    System.out.println(n & bitMask);
  }

  public static void main(String[] args) {
    // int n = 10; // 1010
    int n = 2515; // 100111010011
    int i = 3;
    int j = 5;
    getIthbit(n, i);
    setIthbit(n, i);
    clearIthbit(n, i);
    updateIthbit(n, i, 1);
    clearIbits(n, i);
    clearBitRange(n, i, j);
  }
}
