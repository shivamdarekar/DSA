
import java.util.Stack;

public class ImplementMinStack{

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public ImplementMinStack(){
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x){
        stack.push(x);

        if(minStack.isEmpty() || x <= minStack.peek()){
            minStack.push(x);
        }
    }

    public void pop(){
        if(stack.isEmpty()) return;

        int removed = stack.pop();
        if(removed == minStack.peek()) minStack.pop();
    }

    public int top(){
        if(stack.isEmpty()) return -1;
        return stack.peek();
    }

    public int getMin(){
        if(minStack.isEmpty()) return -1;
        return minStack.peek();
    }

    public static void main(String[] args) {
        ImplementMinStack st = new ImplementMinStack();
        st.push(10);
        st.push(3);
        st.push(8);
        System.out.println(st.getMin());
        st.push(2);
        st.pop();
        System.out.println(st.getMin());
        System.out.println(st.top());
    }
}