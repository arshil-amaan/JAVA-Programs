//code for average (instance variable)
class average {
  int arr[]={2,4,6,8};
  float avg=0;
  public static void main(String []args){
    average myobj = new average();
    for(int i=0;i<myobj.arr.length;i++){
      myobj.avg+=myobj.arr[i];
    }
    System.out.println("Average is :\n"+myobj.avg/myobj.arr.length);
  }
}
