
public class MaxSubarraySum {

    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) { 
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    //subarray sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum = "+maxSum);
    }

    public static int kadanes(int nums[]){
        int maxsum = nums[0];
        int currsum = nums[0];

        for(int i=1;i<nums.length;i++){
            currsum = Math.max(nums[i], currsum+nums[i]);
            maxsum = Math.max(maxsum, currsum);
        }
        return maxsum;
    };


    public static void main(String args[]) {
        int numbers[] = {-2,-4,5,-7,6,2};
        //maxSubarraySum(numbers);
        System.out.println(kadanes(numbers));        

    }
}

//time complexity = O(n^3) -> worst time complexity
//when 3 nested loops are use then TC is n^3.
//another two approaches for this problem are prefix array and kadans algorithm
//kadanes -> O(n)
