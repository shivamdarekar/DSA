import java.util.*;
public class distinctDifferenceArray{

    public static int[] brut(int[] nums){
        Set<Integer>st1 = new HashSet<>();
        int n = nums.length;
        int[] result = new int[n];

        for(int i=0;i<n;i++){
            st1.add(nums[i]);
            Set<Integer>st2 = new HashSet<>();

            for(int j=i+1;j<n;j++){
                st2.add(nums[j]);
            }

            result[i] = st1.size() - st2.size();
        }
        return result;
    }//O(n^2)

    public static int[] optimal(int[] nums){
        Map<Integer,Integer>mpp1 = new HashMap<>();
        Map<Integer,Integer>mpp2 = new HashMap<>();
        int[] result = new int[nums.length];

        for(int x:nums){
            mpp1.put(x, mpp1.getOrDefault(x,0)+1);
        }

        for(int i=0;i<nums.length;i++){
            mpp2.put(nums[i], mpp2.getOrDefault(nums[i], 0)+1);
            mpp1.put(nums[i], mpp1.get(nums[i])-1);

            if(mpp1.get(nums[i]) == 0) mpp1.remove(nums[i]);

            result[i] = mpp2.size() - mpp1.size();
        }

        return result;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] ans = optimal(arr);
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
}