import java.util.*;
public class SlidingWindowMaximum{
    
    public static List<Integer> brut(int[] arr, int k){
        int n = arr.length;
        List<Integer>lt = new ArrayList<>();

        for(int i=0;i<=n-k;i++){
            int max = arr[i];
            for(int j=i;j<i+k;j++){
                max = Math.max(max,arr[j]);
            }
            lt.add(max);
        } 
        return lt;
    }

    public static void main(String[] args){
        int[] arr = {1, 3, -1, -3, 7, 5, 3, 6, 7};
        int k = 3;  
        List<Integer> result = brut(arr, k);
        System.out.println(result);  
    }
}