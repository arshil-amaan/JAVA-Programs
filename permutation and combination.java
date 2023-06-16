import java.util.*;
public class Solution {
	static int fact (int num){
		int fact = 1;
		for(int i = 1; i<=num; i++) {
			fact*=i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n=sc.nextInt();
		System.out.print("Enter r : ");
		int r=sc.nextInt();
		System.out.print("Press 1 for nCr\nPress 2 for nPr\n");
		int ch =sc.nextInt();
		System.out.println();
		int factn = fact(n);
		int factr = fact(r);
		int factnr = fact((n-r));
		if(ch==1){
			System.out.println("nCr ("+n+"C"+r+") is : "+factn/(factr*factnr));
		} else if(ch==2){
			System.out.println("nPr ("+n+"P"+r+") is : "+factn/factnr);
		}
		sc.close();
	}
}
