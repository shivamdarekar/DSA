//to find the least capacity of ship to ship packages in d days
//weights of packages are given 

public class LeastCapacity_Ship {

    public static int daysNeeded(int wt[], int cap) {
        int days = 1, load = 0;
        for (int i = 0; i < wt.length; i++) {
            if (load + wt[i] > cap) {
                days = days + 1;
                load = wt[i];
            } else {
                load = load + wt[i];
            }
        }
        return days;
    }

    public static int Brut(int weights[], int days) {
        //a ship carry min package weight = max element of array[]
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int x : weights) {
            max = Math.max(max, x);
            sum = sum + x;
        }

        for (int i = max; i <= sum; i++) {
            int daysReq = daysNeeded(weights, i);

            if (daysReq <= days) {
                return i;
            }
        }
        return sum;
    }

    public static int Optimal(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int x : weights) {
            max = Math.max(max, x);
            sum = sum + x;
        }

        int start = max, end = sum;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            int daysReq = daysNeeded(weights, mid);

            if (daysReq <= days) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public static void main(String args[]) {
        int weights[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13};
        int days = 5;

        System.out.print(Optimal(weights, days));
    }
}
