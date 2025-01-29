package day4;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}


class SinglyLinkedList{
    Node head=null;

    //////1.Diplay
    void display() {
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        System.out.print("\nList elements:");
        while(temp.next!=null) {
            System.out.print("|"+temp.data+"|&|"+"--->");
            temp=temp.next;
        }
        System.out.println("||"+temp.data+"|null|");
        System.out.println();
    }

    ////// 2.Size
    int size(){
        Node temp=head;
        int count=0;
        while(temp!=null) {
            count++;
            temp=temp.next;
        }
        System.out.println("No of elements in the list:"+count);
        System.out.println();
        return count;
    }

    ///3.Insert at begin
    void insertBegin(int data) {
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
        System.out.println(data+" inserted at 1st position");
    }

    /// 4.Insert At Last
    void insertEnd(int data) {
        Node newnode=new Node(data);
        if(head==null) {
            head=newnode;
            System.out.println(data+" inserted at 1st position");
            return;
        }
        Node temp=head;
        while(temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=null;
        System.out.println(data+" Inserted at last");
    }

    //////5.Insert At index
    void insertAtPositon(int data, int loc) {
        Node newnode=new Node(data);
        if (loc < 1) {
            System.out.println("Invalid position. Position should be >= 1.");
            return;
        }
        if(loc==1) {
            head=newnode;
            System.out.println(data+" inserted at 1st position");
            return;
        }
        Node temp=head;
        int i=1;
        while(i<loc-1) {
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        System.out.println(data+" inserted at location "+loc);
    }

    /// 6.Insert After Given Value
    void insertAfterValue(int data,int target) {
        Node newnode=new Node(data);
        if(head==null) {

            System.out.println("Element not Found");
            return;
        }
        Node temp=head;
        while(temp.next!=null && temp.data!=target) {
            temp=temp.next;
        }
        if(temp.data==target) {
            newnode.next=temp.next;
            temp.next=newnode;
            System.out.println(data +" inserted after "+target);
            return;
        }

        System.out.println("The given target not found!");
    }

    /// 7.Insert Before Value
    void insertBeforeValue(int data,int target) {
        Node newnode=new Node(data);
        if(head==null) {
            System.out.println("Element not Found");
            return;
        }
        Node temp=head;
        Node ptr=temp;
        while(temp.data!=target&&temp.next!=null) {
            ptr=temp;
            temp=temp.next;
        }
        if(temp.data==target) {
            newnode.next=temp;
            ptr.next=newnode;
            System.out.println(data +" inserted before "+target);
            return;
        }

        System.out.println("The given target not found!");
    }


    //////8.Delete At index
    void deleteAtPositon(int loc) {
        if(head==null) {
            System.out.println("List is Empty");
            return;
        }
        if(size()<loc&&loc>0){
            System.out.println("GIven index is not proper");
            return;
        }
        Node temp=head;
        Node ptr=temp;
        int i=1;
        while(i<loc) {
            ptr=temp;
            temp=temp.next;
            i++;
        }
        if(head.next==temp.next){
            head=temp.next;
            System.out.println("Node at "+loc+" position deleted");
            return;

        }
        ptr.next=temp.next;
        System.out.println("Node at "+loc+" position deleted");
    }

    //////9.Delete the Value
    void deleteValue(int d) {
        if(head==null) {
            System.out.println("List is Empty");
            return;
        }
        if(head.data==d){
            head=head.next;
            System.out.println("The only head node deleted");
            return;
        }
        Node temp=head;
        Node ptr=temp;
        //int i=1;
        while(temp.next!=null&&temp.data!=d) {
            ptr=temp;
            temp=temp.next;
            //i++;
        }
        if(temp.data==d){
            ptr.next=temp.next;
            System.out.println("Node with value "+d+" deleted");
            return;
        }
        System.out.println("Value Not Found");
    }

    /// 10.Delete headNode
    void deleteHead(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        System.out.println("Head node deleted");
    }

    /// 11.Delete tailNode
    void deleteTail(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        Node ptr=temp;
        while(temp.next!=null){
            ptr=temp;
            temp=temp.next;
        }
        ptr.next=null;
        System.out.println("Tail Node Deleted");
    }

    /// 12.Delete Entire list
    void deleteEntireList(){
        head=null;
        System.out.println("List deleted");

    }

    /// 13.Search Element
    void searchElement(int d){
        if(head==null) {
            System.out.println("List is Empty");
            return;
        }
        Node temp=head;
        int i=1;
        while(temp.next!=null && temp.data!=d){
            temp=temp.next;
            i++;
        }
        if(temp.data==d){
            System.out.printf("%d is found at %d",d,i);
            return;
        }
        System.out.println(d+" is not found in the list");

    }

    /// 14.Sorting
    void sort(){
        for(Node i=head;i!=null;i=i.next){
            for(Node j=head;j.next!=null;j=j.next ){
                if(j.data>=j.next.data){
                    int temp=j.data;
                    j.data=j.next.data;
                    j.next.data=temp;
                }
            }
        }
    }

}

public class LinkedListFUnctions {

    public static void main(String[] args) {
        SinglyLinkedList ll=new SinglyLinkedList();
        ll.insertBegin(2);
        ll.insertBegin(5);
        ll.insertEnd(10);
        ll.insertAtPositon(9, 3);
        ll.insertAfterValue(6, 5);
        ll.insertBeforeValue(7,9);
        ll.insertEnd(4);
        ll.insertBegin(17);
        //ll.display();
        //ll.size();
        ll.deleteAtPositon(1);
        //ll.deleteValue(10);
        //ll.display();
        //ll.size();
        //ll.deleteHead();
        //ll.deleteTail();
        //ll.display();
        //ll.size();
        ll.searchElement(8);
        //ll.deleteEntireList();
        ll.size();
        ll.display();
        ll.sort();
        ll.display();

    }
}

