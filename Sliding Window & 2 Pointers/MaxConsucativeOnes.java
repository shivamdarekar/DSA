public class MaxConsucativeOnes{
    public static int Better(int[] arr, int k){
        int n = arr.length;
        int left = 0;
        int zeroCount = 0;
        int maxLen = 0;

        for(int right = 0; right < n; right++){
            if(arr[right] == 0) zeroCount++;

            while(zeroCount > k){
                if(arr[left] == 0){
                    zeroCount--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left+1);
        }
        return maxLen;
    }

    public static int Optimal(int[] arr, int k){
        int n = arr.length;
        int l = 0;
        int zeroCount = 0;
        int maxLen = 0;

        for(int r=0;r<n;r++){
            if(arr[r] == 0) zeroCount++;

            if(zeroCount > k){
                if(arr[l] == 0) zeroCount--;
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        System.out.print(Optimal(arr, k));
    }
}