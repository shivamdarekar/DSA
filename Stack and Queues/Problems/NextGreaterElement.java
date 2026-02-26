import java.util.*;

public class NextGreaterElement{

    public static int[] Brut(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j] > arr[i]) {
                    ans[i] = arr[j];
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

        for(int i=n-1;i>=0;i--){

            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }

            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();

            st.push(arr[i]);
        }
        return ans;
    }
    //Tc = O(2n) | Sc = O(n) + O(n)

    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};

        int[] ans = Brut(arr);
        for(int x:ans) System.out.print(x+" ");
    }
}