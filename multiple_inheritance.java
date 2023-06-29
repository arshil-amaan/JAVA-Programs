import java.util.*;

// interfaces are the way to achieve multiple inheritance in java
// interfaces are similar to class but static and abstract in nature
interface a {
	int num1=9;
	void show_a_var();
}

interface b {
	int num2=18;
	void show_b_var();
}

public class multiple_inheritance implements a,b {
	int num3=27;
  
	// because interfaces are abstract hence we require to define functions in driver class 
	public void show_a_var(){
		System.out.println(num1);
	}

	public void show_b_var(){
	    System.out.println(num2);
  }

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		multiple_inheritance obj = new multiple_inheritance();
		
		System.out.println("normally print "+num1);
		System.out.println("normally print "+num2);
		System.out.println("instance variable "+obj.num3);
		
		obj.num3=sc.nextInt();
		
		System.out.println("normally print "+num1);
		System.out.println("normally print "+num2);
		System.out.println("instance variable "+obj.num3);
		
		System.out.print("print using fun call ");
		obj.show_a_var();
		System.out.print("print using fun call ");
		obj.show_b_var();
		sc.close();
	}
}
