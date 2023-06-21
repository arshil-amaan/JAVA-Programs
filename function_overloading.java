public class function_overloading {
	// calc function taking 2 int arguments 
	public int calc(int a, int b){
		// this function returns product of a & b
		return (a*b);
  }
  // calc function taking 3 int arguments 
  public int calc(int a, int b,int c){
    // this function returns sun of a,b & c
    return (a+b+c);
  }
  // calc function taking 2 double arguments 
  public double calc(double a,double b){
    // this function returns division of a by b
    return (a/b);
  }

  public static void main(String[] args) {
    // object created of driver class
    function_overloading obj = new function_overloading();
    //multiplied because 2 arguments passed
    System.out.println(obj.calc(3,6));
    // added because 3 arguments passed
    System.out.println(obj.calc(2,5,8));
    // divided because 2 double arguments passed
    System.out.println(obj.calc(18.0,6.0));
  }
}
