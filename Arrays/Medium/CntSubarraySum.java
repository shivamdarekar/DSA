//count subarray sum equal to k

import java.util.*;
public class CntSubarraySum{

    public static int Better(int[] arr, int k){
        int n = arr.length;
        int cnt = 0;

        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
               sum = sum + arr[j];
               if(sum == k) cnt++;
            }
        }
        return cnt;
    }//O(n^2)

    public static int Optimal(int[] arr, int k){
        int n = arr.length;

        Map<Integer,Integer>mpp = new HashMap<>();
        
        int prefixSum = 0;
        int cnt = 0;
        mpp.put(0,1);

        for(int i=0;i<n;i++){
            prefixSum = prefixSum + arr[i];

            int remove = prefixSum - k;

            if(mpp.containsKey(remove)){
                cnt = cnt + mpp.get(remove);
            }

            mpp.put(prefixSum, mpp.getOrDefault(prefixSum, 0)+1);
        }
        return cnt;
    }//TC = O(n) | SC = O(n)

    //another optimal approach in sliding window binary subarray which take TC(2n) SC(1)

    public static void main(String args[]){
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        System.out.print(Optimal(arr, k));
    }
}