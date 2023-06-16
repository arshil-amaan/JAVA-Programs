import java.util.*;
public class half_pyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of lines : ");
		int g=sc.nextInt();
		System.out.println();
		for(int i = 0; i<g; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
        sc.close();
	}
}
