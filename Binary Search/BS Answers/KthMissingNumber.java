public class KthMissingNumber{

    public static int Brut(int[] arr, int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i] <= k) k++;
            else break;
        }
        return k;
    }

    public static int Optimal(int[] arr, int k){
        int n = arr.length;
        int start = 0, end = n-1;

        while(start <= end){
            int mid = (start+end)/2;
            int missing = arr[mid] - (mid+1);

            if(missing < k) start = mid+1;
            else end = mid-1;
        }
        return start + k;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(Optimal(arr,k));
    }
}