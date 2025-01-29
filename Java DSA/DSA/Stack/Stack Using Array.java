public class Main {
    static int capacity=10;
    static int top=-1;
    static int[]  stack=new int[capacity];


    public static void main(String[] args) {
    push(1);
    push(2);
    push(3);
    print();
    System.out.println(length());
    pop();
    pop();
    pop();
    pop();
    }

    /// 1.Peek
    static void peek(){
        System.out.println("Top value "+stack[top]);
    }

    /// 2.Length
    static int length(){
        return top+1;
    }
    /// 3.Push
    static void push(int data){
        if(top>capacity){
            System.out.println("Overflow");
            return;
        }
        stack[++top]=data;
        System.out.println(data+" pushed");
    }

    /// 4.Pop
    static void pop(){
        if(isEmpty()||top<=-1){
            System.out.println("Stack Underflow");
            return;
        }
        top--;
        System.out.println("Item poped: "+stack[top+1]);
    }

    /// 5.isEmpty
    static boolean isEmpty() {
        return stack.length<1;
    }

    /// 6.Print
    static void print(){
        if(top==-1){
            System.out.println("EMpty stack");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.println("Value |"+stack[i]+"|");
        }
    }
}