import java.util.*;
public class AreaOfLargestRectangle{

    public static int brut(int[] arr){
        int n = arr.length;
        int maxArea = 0;

        for(int i=0;i<n;i++){
            int minHeight = Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                minHeight = Math.min(minHeight, arr[j]);
                int area = minHeight * (j-i+1);

                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

    public static int better(int[] arr){
        int n = arr.length;

        Stack<Integer>st = new Stack<>();
        int[] leftSmall = new int[n];
        int[] rightSmall = new int[n];

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            leftSmall[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        st.clear();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            rightSmall[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        int maxArea = 0;
        for(int i=0;i<n;i++){
            int width = rightSmall[i] - leftSmall[i] - 1;
            maxArea = Math.max(maxArea, arr[i] * width);
        }
        return maxArea;
    }

    public static int optimal(int[] arr){
        int n = arr.length;
        Stack<Integer>st = new Stack<>();
        int maxArea = 0;

        for(int i=0;i<n;i++){
            int currHeight = (i == n) ? 0 : arr[i];
            while(!st.isEmpty() && currHeight < arr[st.peek()]){
                int h = arr[st.pop()];

                int right = i;
                int left = (st.isEmpty()) ? -1 : st.peek();

                int width = right - left - 1;
                maxArea = Math.max(maxArea, h * width);
            }
            st.push(i);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3};
        System.out.println(optimal(arr));
    }
}