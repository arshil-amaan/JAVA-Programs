public class CircularQueueBasics_Array {

  public static class CircularQueue {
    static int[] arr;
    static int qSize;
    static int front;
    static int rear;

    CircularQueue(int size) {
      arr = new int[size];
      qSize = size;
      front = -1;
      rear = -1;
    }

    public boolean isEmpty() {
      return rear == -1 && front == -1;
    }

    public boolean isFull() {
      return (rear + 1) % qSize == front;
    }

    public void add(int val) {
      if (isFull()) {
        System.out.println("Circular queue is full");
        return;
      }
      // in case of first element insertion
      if (isEmpty()) {
        front++;
      }
      rear = (rear + 1) % qSize;
      arr[rear] = val;
    }

    public int remove() {
      if (isEmpty()) {
        System.out.println("Circular queue is empty");
        return -1;
      }
      int res = arr[front];
      if (front == rear) {
        front = rear = -1;
      } else {
        front = (front + 1) % qSize;
      }
      return res;
    }

    public int peek(){
      if(isEmpty()){
        System.out.println("Circular queue is empty");
        return -1;
      }
      return arr[front];
    }
  }

  public static void main(String[] args) {
    CircularQueue q = new CircularQueue(3);
    System.out.println(q.peek());
    q.add(5);
    System.out.println(q.remove());
    q.add(8);
    System.out.println(q.peek());
    q.add(54);
    q.add(87);
    q.add(87);
    q.add(84);
    System.out.println(q.peek());
    System.out.println(q.remove());
    System.out.println(q.peek());
  }
}
