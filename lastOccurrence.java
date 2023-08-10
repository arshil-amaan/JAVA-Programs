public class lastOccurrence {
	static int findLastIndexOf(int[] arr,int key, int i) {
	if(i==arr.length){
	return -1;
	}
	
	int foundAt = findLastIndexOf(arr, key, i+1);
	if(foundAt==-1 && arr[i]==key){
	return i;
	}
	
	return foundAt;
	
	}
	public static void main(String[] args) {
	int[] arr = new int[]{5,4,7,8,4,2,6,1,2,4,2,6,1,4,8,4,3};
	int key = 6;
	System.out.println(findLastIndexOf(arr,key,0));
	}
}
