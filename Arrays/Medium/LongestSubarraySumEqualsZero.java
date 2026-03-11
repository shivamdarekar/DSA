
import java.util.*;

//find the length of longest subarray whos sum equals to zero

public class LongestSubarraySumEqualsZero{

    public static int maxLength(int[] arr){
        int n = arr.length;
        int sum = 0;
        int maxlen = 0;

        Map<Integer, Integer>mpp = new HashMap<>();

        for(int i = 0; i < n; i++){
            sum = sum + arr[i];

            if(sum == 0){
                maxlen = i+1;
            }

            if(mpp.containsKey(sum)){
                int len = i - mpp.get(sum);
                maxlen = Math.max(maxlen, len);
            }else{
                mpp.put(sum, i);
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int[] arr = {9, -3, 3, -1, 6, -5};
        System.out.print(maxLength(arr));
    }
}