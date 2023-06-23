import java.util.*;
public class kadanes_maxsum_subarray {
	static int kadanes_maxsum(int arr[]) {
		int temp=0;
		int maxis = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			temp+=arr[i];
			if(temp>0) {
				maxis=Math.max(maxis, temp);
			} else {
				temp=0;
			}
			// to test
			// System.out.print("\n"+temp+"\t"+maxis);
		}
		System.out.println("\nMaximum sub array is: "+maxis);
		return maxis;
	}
	public static void main( String[] args){
		Scanner sc = new Scanner(System.in);
		int size = 0;
		System.out.print("Enter Size: ");
		size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.print("Enter Elements: ");
		for(int i = 0 ; i<size ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Array is: ");
		for(int i = 0 ; i<size ; i++) {
			System.out.print(arr[i]+" ");
		}
		
		kadanes_maxsum(arr);
	}
}
