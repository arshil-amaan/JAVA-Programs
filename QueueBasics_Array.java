public class QueueBasics_Array {

  public static class Queue {
    static int[] arr;
    static int size = 0;
    static int rearIdx = -1;

    Queue(int qSize) {
      arr = new int[qSize];
      size = qSize;
    }

    public static boolean isEmpty() {
      return rearIdx == -1;
    }

    public void add(int val) {
      if (rearIdx == size - 1) {
        System.out.println("Queue Overflow");
        return;
      }
      arr[++rearIdx] = val;
    }

    public int remove() {
      if (isEmpty()) {
        System.out.println("Queue is Empty");
        return -1;
      }
      int front = arr[0];

      for (int i = 0; i < rearIdx; i++) {
        arr[i] = arr[i + 1];
      }
      rearIdx--;

      return front;
    }

    public int peek() {
      if(isEmpty()){
        System.out.println("Queue is Empty");
        return -1;
      }
      return arr[0];
    }

  }

  public static void main(String[] args) {
    Queue q =new Queue(10);
    System.out.println(q.peek());
    q.add(42);
    System.out.println(q.peek());
    q.add(17);
    q.remove();
    System.out.println(q.peek());
  }
}
