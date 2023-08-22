import java.util.LinkedList;
import java.util.Queue;

public class Interleave2HalvesOfQueue {
  public static Queue<Integer> interleave(Queue<Integer> q){
    Queue<Integer> left = new LinkedList<>();
    int size = q.size();
    int mid;
    if(size%2==0){
      mid = size/2;
    } else {
      mid = (size/2)+1;
    }
    for (int i = 0; i < mid; i++) {
      left.add(q.remove());
    }
    for(int i = 0 ; i<size ; i++) {
      if(i%2==0){
        q.add(left.remove());
      } else {
        q.add(q.remove());
      } 
    }
    return q ;
  }
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();

    for (int i = 1; i <= 11; i++) {
      q.add(i);
    }

    q=interleave(q);
    while(!q.isEmpty()){
      System.out.print(q.poll()+" ");
    }
  }
}