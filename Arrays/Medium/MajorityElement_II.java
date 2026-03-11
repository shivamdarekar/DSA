import java.util.*;

//elements that appears more than n/3 times 
public class MajorityElement_II{

    public static List<Integer> ans(int[] arr){
        int n = arr.length;
        List<Integer>lt = new ArrayList<>();
        Map<Integer,Integer>mpp = new HashMap<>();

        for(int x: arr){
            mpp.put(x, mpp.getOrDefault(x, 0)+1);

            if(mpp.get(x) > n/3 && !lt.contains(x)){
                lt.add(x);
            }
        }
        return lt;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,6,1,1,2,2,2,6,1,2,6};
        List<Integer> res = ans(arr);
        for(int x: res){
            System.out.print(x+" ");
        }
    }
}