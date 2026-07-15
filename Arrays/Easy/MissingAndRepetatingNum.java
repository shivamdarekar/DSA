import java.util.*;
public class MissingAndRepetatingNum{

    public static List<Integer> ans(int[] arr){
      int n = arr.length;
      List<Integer>lt = new ArrayList<>();
      int[]  freq = new int[n+1];

      for(int x:arr){
        freq[x]++;
      }

      int r = -1;
      int m = -1;

      for(int i=1;i<=n;i++){
        if(freq[i] == 2) r = i;
        if(freq[i] == 0) m = i;
      }
        lt.add(r);
        lt.add(m);
        return lt;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,4,3,5};
        List<Integer> ans = ans(arr);
        System.out.println(ans);
    }
}