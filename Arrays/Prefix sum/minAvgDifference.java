
public class minAvgDifference {

    public static int ans(int[] nums) {
        int n = nums.length;
        long total = 0;
        for (int x : nums) {
            total += x;
        }

        long lsum = 0;
        long mindiff = Integer.MAX_VALUE;
        int idx = -1;

        for (int i = 0; i < n; i++) {
            lsum = lsum + nums[i];
            long rsum = total - lsum;

            long leftAvg = lsum / (i + 1);

            long rightAvg = 0;
            if (i != n - 1) {
                rightAvg = rsum / (n - i - 1);
            }

            long currdiff = Math.abs(leftAvg - rightAvg);

            if (currdiff < mindiff) {
                mindiff = currdiff;
                idx = i;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 9, 5, 3};
        System.out.print(ans(arr));
    }
}
