import java.util.*;
//code for area of circle (local Variable)
class Area_circle2 {
	public static void main(String[] args){
		try (Scanner scs = new Scanner(System.in)) {
			// local variable
			System.out.println("Enter radius of the Circle.");
			double r=scs.nextInt();
			// printing area of Circle
			System.out.println("Area of Circle is :\n"+Math.pow(r,2)*22/7);
		}
	} 
}
