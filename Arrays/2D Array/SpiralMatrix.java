
import java.util.*;

public class SpiralMatrix {

    public static List<Integer> ans(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        List<Integer> ans = new ArrayList<>();

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                ans.add(arr[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ans.add(arr[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(arr[i][left]);
                }
                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        List<Integer> ans = ans(arr);
        System.out.println(ans);
    }
}
