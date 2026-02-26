import java.util.*;

public class QueueUsingStack{

    Stack<Integer>s1 = new Stack<>();
    Stack<Integer>s2 = new Stack<>();

    public void enqueue(int x){
        s1.push(x);
        System.out.println(x+ " enqueued");
    }

    public int dequeue(){
        if(s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }

        int r = s2.pop();
        System.out.println(r + " removed");
        return r;
    }

    public int peek(){
        if(s1.isEmpty() && s2.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }

        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }

        return s2.peek();
    }

    public boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String args[]){
        QueueUsingStack st = new QueueUsingStack();
        st.enqueue(1);
        st.enqueue(2);
        st.enqueue(3);
        st.dequeue();
        System.out.println(st.peek()); //2
    }
}