
import java.util.*;

//return true if nums has a good subarray or false otherwise
//good subarray is a subarray where: its length is at least two, and
//the sum of the elements of the subarray is a multiple of k.

public class ContiniousSubarraySum{

    public static boolean brut(int[] arr, int k){
        int n = arr.length;

        for(int i=0;i<n;i++){
            int sum = arr[i];
            for(int j=i+1;j<n;j++){
                sum += arr[j];
                if(sum % k == 0) return true;
            }
        }

        return false;
    }//O(n^2)

    public static boolean optimal(int[] arr, int k){
        int n = arr.length;
        int sum = 0;
        Map<Integer,Integer>mpp = new HashMap<>();

        for(int i=0;i<n;i++){
            sum = sum + arr[i];
            int rem = sum % k;
            if(mpp.containsKey(rem)){
                if(i - mpp.get(rem) > 1) return true;
            }else{
                mpp.put(rem, i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {23,2,4,6,7};
        int k = 6;
        System.out.print(optimal(arr, k));
    }
}