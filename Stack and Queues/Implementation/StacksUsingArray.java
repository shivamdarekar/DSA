//Implementation of stacks using array
public class StacksUsingArray{
    private int[] arr;
    private int top;
    private int capacity;

    //constructor 
    public StacksUsingArray(int size){
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    public void push(int x){
        if(top >= capacity - 1){
            System.out.println("stack overflow");
            return;
        }
        top = top+1;
        arr[top] = x;
        System.out.println(x + " pushed into stack");
    }

    public int pop(){
        if(top == -1){
            System.out.println("stack underflow");
            return -1;
        }
        int popped = arr[top];
        top--;
        System.out.println(popped+" popped from stack");
        return popped;
    }

    public int peek(){
        if(top == -1){
            System.out.println("stack is empty");
            return -1;
        }
        return arr[top];
    }

    public boolean  isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity - 1;
    }

    /*
    The main drawback of array-based stack is fixed size, which can cause 
    overflow or memory wastage. Resizing is costly, so it lacks flexibility 
    compared to linked list implementation.”
    */

    public static void main(String args[]){
        StacksUsingArray stack = new StacksUsingArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("top: "+ stack.peek());

        stack.pop();
        stack.pop();

        System.out.println(stack.isEmpty());

        stack.pop();
        stack.pop();
    }
}

/*
We use a constructor to initialize the stack's internal 
state correctly at the time of object creation.

A constructor:
runs automatically
runs exactly once
runs before the object is used
 */