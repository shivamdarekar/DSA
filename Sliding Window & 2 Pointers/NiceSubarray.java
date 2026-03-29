//A continuous subarray is called nice if there are k odd numbers on it, cnt such nice subarrays

public class NiceSubarray{

    public static int cntNiceSubarrays(int[] arr, int k){
        return atMost_2(arr, k) - atMost_2(arr, k-1);
    }

    public static int atMost_1(int[] nums, int k){
        int left = 0;
        int sum = 0;
        int count = 0;

        // Traverse array using right pointer
        for (int right = 0; right < nums.length; right++) {
            // Add current element to sum
            sum += (nums[right]%2);

            // Shrink window if sum exceeds k
            while (sum > k) {
                sum -= (nums[left]%2);
                left++;
            }

            // Add number of valid subarrays ending at right
            count += (right - left + 1);
        }

        return count;
    }

    //approach 2
    public static int atMost_2(int[] arr,int k){
        int n = arr.length;
        int oddcnt = 0;
        int cnt = 0;
        int l = 0;

        for(int r=0;r<n;r++){
            if(arr[r]%2 == 1) oddcnt++;

            while(oddcnt > k){
                if(arr[l]%2 == 1) oddcnt--;
                l++;
            }

            cnt = cnt + (r-l+1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,2,9,1};
        int k = 3;
        System.out.print(cntNiceSubarrays(arr, k));
    }
}