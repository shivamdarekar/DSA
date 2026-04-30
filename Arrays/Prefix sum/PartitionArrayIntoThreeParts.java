//return true if we can partition the array into three non-empty parts with equal sums

public class PartitionArrayIntoThreeParts {

    public static boolean ans(int[] arr) {
        int n = arr.length;
        int total = 0;
        for (int x : arr) {
            total += x;
        }

        if (total % 3 != 0) {
            return false;
        }
        int target = total / 3;
        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == target) {
                cnt++;
                sum = 0;
            }

            if (cnt >= 3) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};
        System.out.print(ans(arr));
    }
}
