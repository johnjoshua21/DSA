package Stack;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}

class StackImp{
    int capacity =3;
    int top =-1;
    Node head;

    /// 1.isEmpty
    boolean isEmpty(){
        return head == null;
    }

    /// 2.Size
    int length(){
        if(isEmpty()){
            //System.out.println("Stack is Empty");
            return -1;
        }
        //System.out.println("Size of the stack is "+ (top+1));
        return top+1;
    }

    /// 3.Push
    void push(int data){
        if(capacity <=length()){
            System.out.println("Stack is Overflow!!");
            return;
        }
        if(head==null){
            head= new Node(data);
            System.out.println("Item Pushed");
            top++;
            return;
        }
        Node newnode=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        top++;
        System.out.println("Item Pushed");

    }

    /// 4.Pop
    void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        System.out.println("Top value "+temp.next.data+" popped");
        temp.next=null;
        top--;
        return;
    }

    /// 5.Peek
    void peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        System.out.println("\nTop value is "+temp.data);
        System.out.println();
    }

    /// 6.Display
    void displayStack(Node temp){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        if(temp!=null){
            displayStack(temp.next);
            System.out.println(temp.data);
        }
    }

    /// 7.Reverse
    void reverse(){
        if(isEmpty()){
            System.out.println("Empty List");
            return;
        }
        Node p=null;
        Node n=null;
        Node temp=head;
        while(temp!=null){
            n=temp.next;
            temp.next=p;
            p=temp;
            temp=n;
        }
        head=p;
    }

    /// 8.getHead
    Node getHead(){
        return head;
    }
}

public class Stack {
    public static void main(String[] args) {
    StackImp s=new StackImp();
        s.push(1);
        s.push(2);
        s.push(3);
        s.displayStack(s.getHead());
        System.out.println(s.length());
//        s.push(4);
//        s.displayStack(s.getHead());
//        s.peek();
//        s.push(5);
//        s.displayStack(s.getHead());
//        s.length();
        s.pop();
        s.displayStack(s.getHead());
        System.out.println("Length is "+s.length());
    }
}
