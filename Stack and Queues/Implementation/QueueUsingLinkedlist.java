class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class QueueUsingLinkedlist{

    private Node front, rear;

    //constructor
    public QueueUsingLinkedlist(){
        front = null;
        rear = null;
    }

    //constructor
    public void enqueue(int x){
        Node element = new Node(x);
        if(rear == null){
            rear = front = element;
        }else{
           rear.next = element;
            rear = element; 
        }
        System.out.println(x + " enqueued to queue");
    }

    public int dequeue(){
        if(front == null){
            System.out.println("queue underflow");
            return -1;
        }
        int val = front.data;
        Node temp = front;
        front = front.next;
        temp.next = null;

        if(front == null) rear = null;
        System.out.println(val + " dequeued from queue");
        return val;
    }

    public int peek(){
        if(front == null){
            System.out.println("queue is empty");
            return -1;
        }
        return front.data;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public static void main(String[] args) {
        QueueUsingLinkedlist queue = new QueueUsingLinkedlist();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front: " + queue.peek());

        queue.dequeue();
        queue.dequeue();
    }
}