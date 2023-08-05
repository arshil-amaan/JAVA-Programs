import java.util.*;

public class PairSum1 {
  static boolean pairSumBrute(ArrayList<Integer> list, int target) {
    for (int i = 0; i < list.size(); i++) {
      for (int j = i+1; j < list.size(); j++) {
        if(list.get(i)+list.get(j)==target){
          return true;
        }
      }
    }
    return false;
  }

  static boolean pairSumOptim(ArrayList<Integer> list, int target){
    int lp = 0;
    int rp = list.size()-1;
    while(lp!=rp){
      if(list.get(lp)+list.get(rp)==target){
        return true;
      } else if(list.get(lp)+list.get(rp)>target){
        rp--;
      }else if(list.get(lp)+list.get(rp)<target){
        lp++;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(3);
    list.add(4);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);
    int target = 2;
    // if(pairSumBrute(list,target)){
    //   System.out.println("Found");
    // } else {
    //   System.out.println("Not Found");
    // }
    if(pairSumOptim(list,target)){
      System.out.println("Found");
    } else {
      System.out.println("Not Found");
    }
  }
}
