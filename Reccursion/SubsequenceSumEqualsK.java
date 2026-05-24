import java.util.*;
public class SubsequenceSumEqualsK{

    public static void print(int i, int[] arr, List<Integer>lt, int k, int sum){
        int n = arr.length;

        if(i == n){
            if(sum == k){
                System.out.println(lt);
            }
            return;
        }

        lt.add(arr[i]);
        sum += arr[i];
        print(i+1, arr, lt, k, sum);
        lt.remove(lt.size()-1);
        sum -= arr[i];
        print(i+1, arr, lt, k, sum);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int k = 2;
        List<Integer> lt = new ArrayList<>();
        print(0, arr, lt, k, 0);
    }
}