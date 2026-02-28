
import java.util.*;

public class NearestSmallerElement{

public static int[] Brut(int[] arr){
    int n = arr.length;
    int ans[] = new int[n];
    Arrays.fill(ans,-1);

    for(int i=0;i<n;i++){
        for(int j=i-1; j>=0; j--){
            if(arr[j] < arr[i]){
                ans[i] = arr[j];
                break;
            }
        }
    }
    return ans;
}

public static int[] Optimal(int[] arr){
    int n = arr.length;
    int ans[] = new int[n];
    Stack<Integer> st = new Stack<>();

    for(int i=0;i<n;i++){
        while(!st.isEmpty() && st.peek() >= arr[i]){
            st.pop();
        }
        if(st.isEmpty()) ans[i] = -1;
        else ans[i] = st.peek();

        st.push(arr[i]);
    }
    return ans;
}

    public static void main(String[] args) {
        int[] arr = {4,5,2,10,8};

        int[] ans = Brut(arr);
        for(int x:ans) System.out.print(x+" ");
    }
}