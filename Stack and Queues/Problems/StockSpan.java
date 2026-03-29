import java.util.*;
public class StockSpan{

    public static int[] brut(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            int currSpan = 0;

            for(int j=i;j>=0;j--){
                if(arr[j] <= arr[i]) currSpan++;
                else break;
            }
            ans[i] = currSpan;
        }
        return ans;
    }//O(n^2)

    public static int[] optimal(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer>st = new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i] ){
                st.pop();
            };

            if(st.isEmpty()) ans[i] = i+1;
            else ans[i] = i - st.peek();

            st.push(i);
        }
        return ans;
    }//O(n);

    public static void main(String[] args) {
        int[] arr = {120, 100, 60, 80, 90, 110, 115};
        int[] ans = optimal(arr);
        for(int x:ans)  System.out.print(x+" ");
    }
}