import java.util.*;
public class IntersectionOfArrays_2{

    public static int[] intersection(int[] nums1, int[] nums2){
        Map<Integer,Integer>mpp = new HashMap<>();
        List<Integer>lt = new ArrayList<>();
        
        for(int i=0;i<nums1.length;i++){
            mpp.put(nums1[i],mpp.getOrDefault(nums1[i],0)+1);
        }

        for(int i=0;i<nums2.length;i++){
            if(mpp.containsKey(nums2[i]) && mpp.get(nums2[i]) > 0){
                lt.add(nums2[i]);
                mpp.put(nums2[i],mpp.get(nums2[i]) - 1);
            }
        }

        int[] ans = new int[lt.size()];
        for(int i=0;i<lt.size();i++){
            ans[i] = lt.get(i);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] ans = intersection(nums1, nums2);
        for(int x:ans) System.out.print(x+" ");
    }
}