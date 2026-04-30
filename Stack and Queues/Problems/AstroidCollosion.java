import java.util.*;
public class AstroidCollosion{

    public static int[] ans(int[] arr){
        int n = arr.length;
        Stack<Integer>st = new Stack<>();

        for(int i=0;i<n;i++){
            if(arr[i] > 0) st.push(arr[i]);
            else{
                while(!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(arr[i])){
                    st.pop();
                }

                //destroy both if size is equal
                if(!st.isEmpty() && st.peek() == Math.abs(arr[i])){
                    st.pop();
                }

                //if top of stack is a left-moving or no asteroid, add this one
                if(st.isEmpty() || st.peek() < 0) st.push(arr[i]);
            }
        }

        int[] result = new int[st.size()];
        for(int i=result.length-1; i>=0; i--){
            result[i] = st.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,3,1,-3,17,13,-16};
        int[] result = ans(arr);
        System.out.println(Arrays.toString(result));
    }
}