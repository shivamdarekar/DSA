
import java.util.*;

//cnt the subarrays whos sum divisible by k

public class CntSubarraySumDivisibleByK{

    public static int brut(int[] arr, int k){
        int n = arr.length;
        int cnt = 0;

        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum = sum + arr[j];
                if(sum % k == 0) cnt++;
            }
        }
        return cnt;
    }//O(n^2)

    //prefix sum approach
    public static int optimal(int[] arr, int k){
        int n = arr.length;
        int sum = 0;
        int cnt = 0;

        Map<Integer,Integer>mpp = new HashMap<>();
        mpp.put(0,1);

        for(int i=0;i<n;i++){
            sum = sum + arr[i];
            int rem = sum % k;

            if(mpp.containsKey(rem)){
                cnt = cnt + mpp.get(rem);
            }
            mpp.put(rem, mpp.getOrDefault(rem, 0)+1);
        } 
        return cnt;
    }//TC = O(n) | SC = O(k)

    public static void main(String[] args) {
        int[] arr = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.print(optimal(arr, k));
    }
}