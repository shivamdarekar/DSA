
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement_2{

    public static int[] Brut(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans,-1);

        for(int i=0;i<n;i++){
            for(int j=i+1;j<i+n-1;j++){
                int idx = j % n;
                if(arr[idx] > arr[i]) {
                    ans[i] = arr[idx];
                    break;
                }   
            }
        }
        return ans;
    }//TC = O(n^2) | SC = O(n)

    public static int[] Optimal(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer>st = new Stack<>();

        for(int i=2*n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= arr[i%n]){
                st.pop();
            }

            if(i < n){
                if(st.isEmpty()) ans[i] = -1;
                else ans[i] = st.peek();
            }

            st.push(arr[i % n]);
        }
        return ans;
    }//TC = (4n) | SC = O(2n)

    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 7, 6, 0};
        int[] ans = Optimal(arr);
        for(int x:ans) System.out.print(x+" ");
    }
}