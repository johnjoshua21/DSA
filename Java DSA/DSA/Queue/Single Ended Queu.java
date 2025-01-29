package Queue;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class Queue {
    int capacity = 10;
    Node head;
    Node tail;

    /// 1.Get head()
    Node getHead() {
        return head;
    }

    /// 2.Get Tail()
    Node getTail() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    /// 3.Enqueue()
    void enQueue(int data) {

        if (head == null) {
            tail = head = new Node(data);
            return;
        }

        Node newnode = new Node(data);
        Node temp = getTail();
        temp.next = newnode;
        tail = newnode;
    }

    /// 4.deQueue()
    void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    /// 5.isEmpty()
    boolean isEmpty () {
        return (head == null && tail == null);
    }

    /// 6.print()
    void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = head;
            System.out.print("Elements ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(); // Print a newline at the end
    }
    }



public class Driver {
    public static void main(String[] args) {
    Queue q=new Queue();
    //q.print();
    q.enQueue(1);
    q.enQueue(2);
    q.enQueue(3);
    q.print();
    q.deQueue();
    q.print();
    }
}
