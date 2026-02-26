/*
Given an array and an integer k, find the maximum sum of any subarray of size k.
fixed size window que
sliding window ka goal - O(n)
*/

public class MaxSubarraySum{

    public static int maxSum(int[] arr, int k){
        int n = arr.length;
        int sum = 0, maxSum = Integer.MIN_VALUE;

        for(int i=0;i<k;i++){
            sum = sum + arr[i];
        }

        maxSum = sum;
        int left = 0;

        for(int i=k; i<n; i++){
            sum = sum+arr[i];
            sum = sum - arr[left];
            left++;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        //Output = 9   // subarray [5,1,3]

        System.out.print(maxSum(arr, k));
    }
}