
import java.util.*;

public class ThirdMaxNum{

    public static int brut(int[] arr){
        Set<Integer>st = new HashSet<>();
        for(int x: arr){
            st.add(x);
        }

        List<Integer>lt = new ArrayList<>(st);
        int n = lt.size();
        Collections.sort(lt);
        if(n < 3) return lt.get(n-1);
        return lt.get(n-3);
    }

    public static int optimal(int[] arr){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for(int x:arr){
            if(x == max1 || x == max2 || x == max3) continue;

            if(x > max1){
                max3 = max2;
                max2 = max1;
                max1 = x;
            }
            else if(x > max2){
                max3 = max2;
                max2 = x;
            }
            else if(x>max3){
                max3 = x;
            }
        }
        if(max3 == Integer.MIN_VALUE) return max1;
        return max3;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,3,5};
        System.out.print(optimal(arr));
    }
}