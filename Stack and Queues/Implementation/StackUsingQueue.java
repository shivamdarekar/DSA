import java.util.*;

public class StackUsingQueue {

    Queue<Integer> q = new LinkedList<>();

    public void push(int x){
        int s = q.size();
        q.add(x); //add at rare

        //rotate so new element get at start(front)
        for(int i=0;i<s;i++){
            q.add(q.poll());  //poll(remove from front) = returns null if queue is empty
        }
    }

    public int pop(){
        if(q.isEmpty()){
            System.out.println("underflow");
            return -1;
        }
        return q.poll();
    }

    public int top(){
        if(q.isEmpty()){
            System.out.println("underflow");
            return -1;
        }
        return q.peek(); //peek() = returns null if queue is empty
    }

    public boolean isEmpty(){
        return q.isEmpty();
    }

    //push = O(n)
    //pop = O(1)
    //top = O(1)
    //isEmpty = O(1)
    //SC = O(k) -> storing k elements

    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        System.out.println(s.top()); //3
    }
}