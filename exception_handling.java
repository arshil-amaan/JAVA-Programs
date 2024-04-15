import java.util.*;
class exception_handling {
	int division(int a, int b) {
		int c=852;
		// suspected erroneous instructions are kept in try block
		try {
			c=a/b;
		}
		// if exception occur by try block then catch block gets executed
		catch(Exception e) {
			System.out.println("!!!Can't divide by zero!!!");
			System.out.println("Exception Name : "+e);
		}
		// // finally block gets executed no matter error occured or not
		// finally{
		// 	System.out.println("Finally Done");
		// }
		return c;
	}
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		exception_handling obj = new exception_handling();

		int p,q;
		System.out.println("Enter First Num");
		p=sc.nextInt();
		System.out.println("Enter Second Num");
		q=sc.nextInt();
		obj.division(p,q);

		System.out.println("********************");

		int arr[]={2,4,6,8,3};

		System.out.println(arr[3]);

		try {
			System.out.println(arr[7]);
		} catch(Exception ex) {
			System.out.println("Out of Bound hai bhai");
			System.out.println("Exception Name : "+ex);
			}
    
		System.out.println(arr[1]);

		System.out.println("********************");

		// String str1 = null;
		String str2 = "";
		String str3 = "Arshil";
		String str4 = "Amaan";
		System.out.println(str3.length());
		try {
			// uncomment for exception
			// System.out.println(str1.length());
			System.out.println(str4.length());
		} catch(Exception exc) {
			System.out.println("string me null hai");
			System.out.println("Exception Name : "+exc);
		}
		System.out.println(str2.length());
		sc.close();
	}
}

// exception methods
// e.getMessage() 	prints only message of error
// e.tostring()   	prints full error as string which can be stored as String
