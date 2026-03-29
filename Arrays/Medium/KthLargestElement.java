import java.util.*;

//find kth largest element in the array

public class KthLargestElement{

    public static int ans1(int[] arr,int k){
        int n = arr.length;
        Arrays.sort(arr);

        // for(int i=n-1; i>=0; i--){
        //     k--;
        //     if(k == 0) return arr[i];
        // }
        // return -1;

        return arr[n-k];

    }//TC= O(nlogn) | SC = O(1)

    public static int ans2(int[] arr, int k){
        //abt heap in root data.txt

        PriorityQueue<Integer>pq = new PriorityQueue<>();

        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);

            if(pq.size() > k) pq.poll();
        }

        return pq.peek();
    }//TC = O(nlogk) | SC = O(k)


     public static void main(String[] args) {
         int[] arr = {2,4,6,5,3,1};
         int k = 2;

         System.out.println(ans2(arr, k));
     }
}