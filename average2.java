//code for average (local variable)
class average2 {
  public static void main(String[] args){
    int arr[]={2,4,6,8};
    float avg=0;
    for(int i=0; i<arr.length; i++){
      avg+=arr[i];
    }
    System.out.println(avg/arr.length);


  }
}
