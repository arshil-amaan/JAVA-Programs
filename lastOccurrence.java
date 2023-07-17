public class lastOccurrence{
  static int findLastIndexOf(int[] arr,int key, int i){
    
    if(i<0){
      return -1;
    }

    if(arr[i]==key){
      return i;
    } else {
      return findLastIndexOf(arr, key, i-1);
    }
  }
  public static void main(String[] args) {
    int[] arr = new int[]{5,4,7,8,4,2,6,1,2,4,2,6,1,4,8,4,3};
    int key = 3;
    System.out.println(findLastIndexOf(arr,key,arr.length-1));
  }
}