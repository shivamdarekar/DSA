
import java.util.*;


public class duplicateNums {

    public static boolean numbers(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean opt(int[] arr){
        Set<Integer>st = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(st.contains(arr[i])){
                return true;
            }
            st.add(arr[i]);
        }
        return false;
    }

    public static boolean opt2(int[] arr){
        Arrays.sort(arr);

        for(int i=1;i<arr.length;i++){
            if(arr[i] == arr[i-1]) return true;
        }
        return false;
    }

    public static void main(String args[]) {
        int nums[] = {1,1,1,3,3,4,3,2,4,2,5,6};
        
        System.out.println(numbers(nums));
    }
}
