import java.util.*;

//return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

public class ProductOfArrayExceptSelf{

    public static int[] brut(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            int product = 1;
            for(int j=0;j<n;j++){
                if(i != j) product *= arr[j];
            }
            ans[i] = product;
        }
        return ans;
    }

    public static int[] better(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = 1;
        for(int i=1;i<n;i++){
            left[i] = left[i-1] * arr[i-1];
        }

        right[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            right[i] = arr[i+1] * right[i+1];
        }

        for(int i=0;i<n;i++){
            ans[i] = right[i] * left[i];
        }

        return ans;
    }
    //TC = O(n) | SC = O(2n);

    public static int[] optimal(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];

        ans[0] = 1;
        for(int i=1;i<n;i++){
            ans[i] = ans[i-1] * arr[i-1];
        }

        int right = 1;
        for(int i=n-1;i>=0;i--){
            ans[i] = ans[i] * right;
            right *= arr[i];
        }
        return ans;
    }
    //TC = O(n) | SC = O(1)

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.print(Arrays.toString(optimal(arr)));
    }
}