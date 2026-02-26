
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

    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE; //max sum
        int cs = 0; //current sum

        for(int i=0;i<numbers.length;i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("max subarray sum is: "+ ms);
    };


    public static void main(String args[]) {
        int numbers[] = {-2,-4,5,-7,6,2};
        //maxSubarraySum(numbers);
        kadanes(numbers);

    }
}

//time complexity = O(n^3) -> worst time complexity
//when 3 nested loops are use then TC is n^3.
//another two approaches for this problem are prefix array and kadans algorithm
//kadanes -> O(n)
