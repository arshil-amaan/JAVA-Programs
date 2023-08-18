public class QueueBasics_LinkedList {

  public static class Node {
    int data;
    Node next;

    Node() {
    }

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static class Queue {
    Node front;
    Node rear;
    int qSize=0;

    public boolean isEmpty() {
      if (qSize == 0) {
        return true;
      }
      return false;
    }

    public void add(int val) {
      Node newNode = new Node(val);
      if (isEmpty()) {
        rear = front = newNode;
        qSize = 1;
        return;
      }
      // alternative to below 2 lines
      // rear = rear.next = newNode;
      rear.next = newNode;
      rear = newNode;
      qSize++;
    }

    public int remove(){
      if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
      }
      int tem = front.data;
      if(rear==front){
        rear=front=null;
        qSize=0;
        return tem;
      }
      front=front.next;
      qSize--;
      return tem;
    }

    public int peek(){
      if(isEmpty()){
        System.out.println("Queue is Empty");
        return -1;
      }
      return front.data;
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue();
    System.out.println(q.peek());
    q.add(25);
    System.out.println(q.peek());
    System.out.println(q.remove());
    q.add(36);
    q.add(31);
    System.out.println(q.remove());
    q.add(32);
    q.add(37);
    q.add(30);
    System.out.println(q.peek());
  }
}
