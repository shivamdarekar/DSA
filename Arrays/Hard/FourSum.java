import java.util.*;

public class FourSum{

    public static List<List<Integer>> brut(int[] arr, int target){
        int n = arr.length;
        Set<List<Integer>> st = new HashSet<>();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];
                        if(sum == target){
                            List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                            Collections.sort(temp);
                            st.add(temp);
                        }
                    }
                }
            }
        }

        return new ArrayList(st);
    }
    //TC = O(n^3 * log(no. sort))

    public static List<List<Integer>> better(int[] arr, int target){
        int n = arr.length;
        Set<List<Integer>> st = new HashSet<>();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                HashSet<Integer>seen = new HashSet<>();

                for(int k=j+1;k<n;k++){
                    int fourth = target - arr[i] - arr[j] - arr[k];

                    if(seen.contains(fourth)){
                        List<Integer>temp = Arrays.asList(arr[i],arr[j],arr[k],fourth);
                        Collections.sort(temp);
                        st.add(temp);
                    }

                    seen.add(arr[k]);
                }
            }
        }
        return new ArrayList(st);
    }
    //TC = O(n^3 * log(no. sort))

    // public static List<List<Integer>> optimal(int[] arr, int target){
    //     int n = arr.length;
    //     Set<List<Integer>> st = new HashSet<>();
    // }

    public static void main(String[] args){
        int[] arr = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> ans = better(arr, target);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }
}