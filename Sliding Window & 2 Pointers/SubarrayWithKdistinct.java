//cnt subarray with exactly k distinct integers
//Just a small trick if you asked longest then u need 
//to apply sliding window directly and if you were asked to 
//find no. of subarrays with exactly k elements then u need to firstly find at most k - at most k-1;

import java.util.*;
public class SubarrayWithKdistinct{

    public static int Brut(int[] arr, int k){
        int n = arr.length;
        int cnt = 0;

        for(int i=0;i<n;i++){
            Set<Integer>st = new HashSet<>();
            for(int j=i;j<n;j++){
                st.add(arr[j]);
                if(st.size() == k) cnt++;
                else if(st.size() > k) break;
            }
        }
        return cnt;
    }

    public static int cntSubarray(int[] arr, int k){
        return atMost(arr, k) - atMost(arr, k-1);
    }

    public static int atMost(int[] arr, int k){
        int n = arr.length;
        int cnt = 0;
        int left = 0;

        Map<Integer,Integer>mpp = new HashMap<>();

        for(int right = 0; right < n; right++){
            mpp.put(arr[right], mpp.getOrDefault(arr[right],0)+1);

            while(mpp.size() > k){
                mpp.put(arr[left],mpp.get(arr[left])-1);

                if(mpp.get(arr[left]) == 0){
                    mpp.remove(arr[left]);
                }
                left++;
            }

            cnt = cnt + (right - left + 1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3};
        int k = 2;
        System.out.println(Brut(arr, k));
    }
}