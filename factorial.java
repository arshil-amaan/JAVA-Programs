import java.util.*;
public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. : ");
		int g=sc.nextInt();
		int fact = 1;
		System.out.println();
		// for(int i = g; i>0; i++) { // better
		for(int i = 1; i<=g; i++) {
			fact*=i;
		}
		System.out.println(fact);
		sc.close();
	}
}
