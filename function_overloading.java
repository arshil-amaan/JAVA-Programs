import java.util.*;

class par{
  int fun(int m){
    System.out.println("defined in par");
    return 2*m;
  }
}

class function_overloading{
  int fun(int n){
    System.out.print("defined inside main ");
    return 3*n;
  }
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    par ob = new par();
    function_overloading obj = new function_overloading();
    ob.fun(7);
    System.out.println("using\npar ob = new par();\nob.fun(7)");
    System.out.println("****************************************");
    obj.fun(9);
    System.out.println("using\nfunction_overloading obj = new function_overloading();\nobj.fun(9);");
    sc.close();
  }
}