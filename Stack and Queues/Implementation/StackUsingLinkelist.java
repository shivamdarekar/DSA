class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class StackUsingLinkelist{

    private Node head; //top of stack
    private int size;

    //constructor
    public StackUsingLinkelist(){
        head = null;
        size = 0;
    }

    public void push(int x){
        Node element = new Node(x);
        element.next = head;
        head = element;
        size++;
        System.out.println(x + " pushed into stack");
    }

    public int pop(){
        if(head == null){
            System.out.println("stack underflow");
            return -1;
        }
        int val = head.data;
        Node temp = head;
        head = head.next;
        temp.next = null;
        size--;
        System.out.println(val + " popped from stack");
        return val;
    }

    public int top(){
        if(head == null){
            System.out.println("stack is empty");
            return -1;
        }
        return head.data;
    }

    public boolean isEmpty(){
        return size == 0;
    }

public static void main(String[] args) {
    StackUsingLinkelist stack = new  StackUsingLinkelist();

    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.pop();
    System.out.println("Top element is: " + stack.top());
    stack.pop();
    System.out.println(stack.top());
    stack.pop();
    stack.pop();
  }
}