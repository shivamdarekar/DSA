import java.util.*;
public class DailyTemprature{

    public int[] better(int[] arr){
        int n = arr.length;
        Stack<Integer>st = new Stack<>();
        int[] ans = new int[n];

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i] >= arr[st.peek()]){
                st.pop();
            }
            
            if(st.isEmpty()) ans[i] = 0;
            else{
                ans[i] = st.peek() - i;
            }

            st.push(i);
        }

        return ans;
    }

    public int[] optimal(int[] arr){
        int n = arr.length;
        Stack<Integer>st = new Stack<>();
        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                ans[st.peek()] = i - st.peek();
                st.pop();
            }

            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {73,74,75,71,69,72,76,73};
    }
}