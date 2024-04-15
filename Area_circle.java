//code for area of circle (instance Variable)
class Area_circle {
	// instance variable
	double r=10.5;
	public static void main(String []args){
		// creating object to access instance variable
		Area_circle myobj = new Area_circle();
		// printing area of Circle
		System.out.println("Area of Circle is :\n"+Math.pow(myobj.r,2)*22/7);
	}
}
