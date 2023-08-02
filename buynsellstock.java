import java.util.*;

public class buynsellstock {
	static int maxprof(int arr[]) {
		int profit = 0;
		int rightmax[] = new int[arr.length];
		rightmax[arr.length - 1] = arr[arr.length - 1];
		for (int i = rightmax.length - 2; i > -1; i--) {
			rightmax[i] = Math.max(arr[i], rightmax[i + 1]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (rightmax[i] - arr[i] > profit) {
				profit = rightmax[i] - arr[i];
			}
		}
		
		return profit;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of elements : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter elements :");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(maxprof(arr));
	}
}
