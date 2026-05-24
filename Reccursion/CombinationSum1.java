//when que ask abt printing combinations or subsequence use recursion approach

import java.util.*;
public class CombinationSum1{

    public static List<List<Integer>> combinationSum(int[] arr, int t){
        List<List<Integer>> ans = new ArrayList<>(); //to store result
        List<Integer>ds = new ArrayList<>(); //to store current combinationCo
        findCombination(0,t,arr,ans,ds);
        return ans;
    }

    public static void findCombination(int idx, int t, int[] arr, List<List<Integer>>ans, List<Integer>ds){
        if(idx == arr.length){
            if(t == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(arr[idx] <= t){
            ds.add(arr[idx]); //add current element;
            findCombination(idx, t-arr[idx], arr, ans, ds); //continue with same element to allow repated element
            ds.remove(ds.size()-1); //backtrack and remove last added number
        }

        findCombination(idx+1, t, arr, ans, ds);
    }

    public static void main(String[] args){
        int[] arr = {2,3,6,7};
        int target = 7;
    }
}