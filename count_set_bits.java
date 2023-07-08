public class count_set_bits {
  static void setBitsof(int n){
    int count=0;
    while (n!=0){
      if ((n&1)==1){
        count++;
      }
      n>>=1;
    }
    System.out.println(count);
  }
  public static void main(String[] args){
    int n = 25;
    setBitsof(n);
  }
}
