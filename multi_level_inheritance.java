import java.util.*;
import java.lang.Math;

// parent of a parent class
class parent0 {
	int p,t;
	float r,si;
}

// parent class
class parent1 extends parent0 {
	double ci;
}

// driver class
class multi_level_inheritance extends parent1 {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		multi_level_inheritance obj = new multi_level_inheritance();
		System.out.println("by Arshil with ♡.");
		
		System.out.println("Enter Principle Amt. : ");
		obj.p = sc.nextInt();
		
		System.out.println("Enter Rate of Interest : ");
		obj.r = sc.nextFloat();
		
		System.out.println("Enter Time(in Years) : ");
		obj.t = sc.nextInt();
		
		System.out.println("Principle Amt. is : "+obj.p);
		System.out.println("Rate of Interest is : "+obj.r);
		System.out.println("Time(in Years) is : "+obj.t);
		
		System.out.println("**************************************************");
		
		obj.si = (obj.p*obj.r*obj.t)/100;
		System.out.println("Simple Interest is : "+obj.si);
		System.out.println("Simple Interest + Principle Amt. is : "+(obj.si)+obj.p);
		
		System.out.println("**************************************************");
		
		obj.ci = obj.p*Math.pow((1 + obj.r/100),obj.t);
		System.out.println("Compound Interest is : "+(obj.ci-obj.p));
		System.out.printf("Compound Interest + Principle Amt. is : %.2f\n",obj.ci);
		
		sc.close();
	}
}
