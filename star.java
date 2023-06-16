import java.util.*;
class star {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of lines : ");
		int g=sc.nextInt();
		System.out.println();
		for(int i = 0; i<g; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
        sc.close();
	}
}
