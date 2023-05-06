//code for area of circle (instance Variable)
class area_circle {
  // instance variable
  double r=10.5;
  public static void main(String []args){
    // creating object to access instance variable
    area_circle myobj = new area_circle();
    // printing area of Circle
    System.out.println("Area of Circle is :\n"+Math.pow(myobj.r,2)*22/7);
  }
}
