
import java.util.*;

//which number appears more than n/2

public class AppearNby2{

    public static int brut(int arr[]){
        int n = arr.length;
        int occ = n/2;
        for(int i=0;i<n;i++){
            int cnt = 0;
            for(int j=0;j<n;j++){
                if(arr[i] == arr[j]){
                    cnt++;
                }
            }
            if(cnt > occ) return arr[i];
        }
        return -1;
    }//O(n^2)

    public static int optimal(int arr[]){
        Map<Integer,Integer>map = new HashMap<>();
        //Key → array element | Value → frequency (count)

        int n = arr.length;

        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
            //Agar key exists → return its value, Agar key does NOT exist → return defaultValue
            if (map.get(num) > n / 2) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[] = {3, 4, 1, 1, 1, 7, 1, 1};
        System.out.print(brut(arr));
    }
}