import java.util.*;
public class ThreeSum{

    public static List<List<Integer>> brut(int[] arr){
        int n = arr.length;
        Set<List<Integer>> st = new HashSet<>();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        List<Integer>temp = Arrays.asList(arr[i], arr[j],arr[k]);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                }
            }
        }

        return new ArrayList<>(st);
    }
    //TC = O(n^3 * log(no. of unique triplets))


    public static List<List<Integer>> better(int[] arr){
        Set<List<Integer>> ans = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            //set to store elements seen in the interation
            Set<Integer>st = new HashSet<>();

            for(int j=i+1;j<arr.length;j++){
                int third = -(arr[i]+arr[j]);

                if(st.contains(third)){
                    List<Integer>temp = Arrays.asList(arr[i], arr[j], third);
                    Collections.sort(temp);
                    ans.add(temp);
                }

                st.add(arr[j]);
            }
        }

        return new ArrayList<>(ans);
    }
    //TC = O(n^2 * log(no. of unique triplets))

    public static void main(String args[]){
        int arr[] = {-1,0,1,2,-1,-4};
        //return triplets whose sum is 0

        List<List<Integer>> ans = better(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }
}