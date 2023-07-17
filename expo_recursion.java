public class expo_recursion {
  static int exponant(int n, int ex){
    
    // base case
    if(ex==0){
      return 1;
    }
    
    // to handle with negative power
    if(ex<1){
      return -1;
    }

    return n*exponant(n, ex-1);
  }
  public static void main(String[] args) {
    int n = 3;
    int ex = -6;

    System.out.println(exponant(n,ex));
  }
}
