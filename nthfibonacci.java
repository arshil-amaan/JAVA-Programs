public class nthfibonacci {
	static int nthfibo(int n){
		if(n==1) {
			return 0;
		} else if(n==2){
			return 1;
		} else { 
			return nthfibo(n-1)+nthfibo(n-2);
		}
	}
	public static void main(String[] args) {
		int n = 10;
		System.out.println(nthfibo(n));
	}
}
