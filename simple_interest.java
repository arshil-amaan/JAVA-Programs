// code for simple interest (instance variable)
class simple_interest {
  float si,p=250,r=15;
  int t=3;
  public static void main(String[] args){
    simple_interest myobj = new simple_interest();
    myobj.si=((myobj.p*myobj.r*myobj.t)/100);
    System.out.println("Simple Interest is :\n"+myobj.si);
  }
}
