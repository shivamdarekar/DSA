//maximum points obtain from k cards
//continious cards from left or right not between 
//contigious so sliding window appproach

public class MaxPointsObtain{

    public static int maxPoints(int[] arr, int k){
        int n = arr.length;
        int Lsum = 0, Rsum = 0;

        for(int i=0;i<k;i++){
            Lsum = Lsum + arr[i];
        }
        
        int maxSum = Lsum;
        int rightIdx = n-1;

        for(int i=k-1; i>=0; i--){
            Lsum = Lsum - arr[i];
            Rsum = Rsum + arr[rightIdx];
            rightIdx--;

            maxSum = Math.max(maxSum, Lsum+Rsum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int k = 3;  //output 15

        System.out.print(maxPoints(arr, k));
    }
}