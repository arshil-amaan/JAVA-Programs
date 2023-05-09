//code for average (local variable)
class average2 {
  public static void main(String[] args){
    // local variables
    int arr[]={2,4,6,8};
    float avg=0;
    //looping for average
    for(int i=0; i<arr.length; i++){
      avg+=arr[i];
    }
    System.out.println("Average is :\n"+avg/arr.length);
  }
}
