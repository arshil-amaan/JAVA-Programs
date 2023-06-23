import java.util.*;

class A {
  int fun(int m) {
    System.out.println("defined in A class");
    //this function returns double of m
    return 2*m;
  }
}
// driver class
class function_overriding{
  int fun(int n){
    System.out.print("defined inside driver class ");
    // this function returns triple of n
    return 3*n;
  }
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    A ob = new A();
    function_overriding obj = new function_overriding();
    ob.fun(7);
    System.out.println("using\nA ob = new A();\nob.fun(7)");
    System.out.println("****************************************");
    obj.fun(9);
    System.out.println("using\nfunction_overriding obj = new function_overriding();\nobj.fun(9);");
    sc.close();
  }
}
