import java.util.*;

public class LongestConsecutive{

    public static int Brut(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int longest = 1;
        int lastSmaller = Integer.MIN_VALUE;
        int currCount = 0;

        for(int i=0;i<n;i++){
            if(arr[i] - 1 == lastSmaller){
                currCount++;
                lastSmaller = arr[i];
            }
            else if(arr[i] != lastSmaller){
                currCount = 1;
                lastSmaller = arr[i];
            }

            longest = Math.max(currCount,longest);
        }
        return longest;
    } //O(n logn)


    public static int Optimal(int[] arr){
        int n = arr.length;
        int longest = 0;

        if(n==0) return 0;

        Set<Integer>set = new HashSet<>();
        for(int x:arr){
            set.add(x);
        }

        for(int l:set){
            if(!set.contains(l-1)){
                int currNum = l;
                int cnt = 1;

                while(set.contains(currNum+1)){
                    currNum++;
                    cnt++;
                }
                longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int arr[] = {1,0,1,2};
        System.out.println(Brut(arr));
    }
}