public class friends_pairing {
  static int pairing(int n){

    if(n==1 || n==2){
      return n;
    }
    // alone
    int alone = pairing(n-1);

    // paired
    int paired = (n-1)*pairing(n-2);

    // total
    int total = alone + paired;
    return total;
  }
  public static void main(String[] args) {
    int n = 5;
    System.out.println(pairing(n));
  }
}
