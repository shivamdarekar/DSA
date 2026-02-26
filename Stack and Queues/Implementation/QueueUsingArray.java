public class QueueUsingArray{
    
    private int[] arr;
    private int rear;
    private int front;
    private int capacity;

    public QueueUsingArray(int size){
        capacity = size;
        arr = new int[capacity];
        front = 0;
        rear = -1;
    }
    
    //enqueue(insert)
    public void enqueue(int x){
        if(rear >= capacity - 1){
            System.out.println("queue overflow");
            return;
        }
        rear++;
        arr[rear] = x;
        System.out.println(x + " enqueued to queue");
    }

    //dequeue(remove)
    public int dequeue(){
        if(front > rear){
            System.out.println("queue underflow");
            return -1;
        }
        int popped = arr[front];
        front++;
        System.out.println(popped+" dequeued from queue");
        return popped;
    }

    public int peek(){
        if(front > rear){
            System.out.println("queue is empty");
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty(){
        return front > rear;
    }

    public boolean isFull(){
        return rear == capacity - 1;
    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.dequeue();
        queue.dequeue();

        System.out.println("Front element is: " + queue.peek());
    }
}