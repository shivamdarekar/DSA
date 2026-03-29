
import java.util.*;

public class IntersectionOfTwoArrays{

    public static int[] intersection(int[] a1, int[] a2){
        Set<Integer>st = new HashSet<>();
        Set<Integer>result = new HashSet<>();

        for(int x:a1) st.add(x);

        for(int i=0;i<a2.length;i++){
            if(st.contains(a2[i])){
                result.add(a2[i]);
            }
        }

        int[] ans = new int[result.size()];
        int i=0;
        for(int x:result) ans[i++] = x;
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1,3};
        int[] nums2 = {2, 2, 3};

        int[] ans = intersection(nums1, nums2);
        for(int x:ans) System.out.print(x+" ");
    }
}