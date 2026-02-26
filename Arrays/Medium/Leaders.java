//all element in right side are smaller 
import java.util.*;

public class Leaders{

    public static List<Integer> Brut(int arr[]){
        int n = arr.length;
        List<Integer>ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            boolean leader = true;
            for(int j=i+1;j<n;j++){
                if(arr[j] > arr[i]){
                    leader = false;
                    break;
                }
            }
            if(leader == true) ans.add(arr[i]);
        }
        return ans;
    }

    public static List<Integer> Optimal(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        List<Integer>ans = new ArrayList<>();

        for(int i=n-1;i>=0;i--){
            if(arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }
            max = Math.max(max, arr[i]);
        }
        return ans;
    }

    public static void main(String args[]){
        int arr[] = {10,22,12,3,0,6}; 
        System.out.print(Optimal(arr));
    }
}