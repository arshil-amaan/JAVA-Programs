//code for average (instance variable)
class average {
  int len,arr[]={2,4,7,8};
  float sum=0;
  public static void main(String []args){
    average myobj = new average();
    myobj.len=myobj.arr.length;
    for(int i=0;i<myobj.arr.length;i++){
      myobj.sum+=myobj.arr[i];
    }
    System.out.println("Average is :\n"+myobj.sum/myobj.len);
  }
}
