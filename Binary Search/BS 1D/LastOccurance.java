
public class LastOccurance {

    public static int brut(int arr[], int x) {
        int n = arr.length;
        int ans = -1;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == x) {
                ans = i;
                break;
            }
        }
        return ans;
    }//O(n);

    public static int optimal(int arr[], int x) {
        int n = arr.length;
        int start = 0, end = n - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == x) {
                ans = mid;
                start = mid + 1;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }// O(log n)

    public static int[] firstAndLastPosition(int arr[],int x){
        int n = arr.length;
        int first = -1;
        int last = -1;

        for(int i=0;i<n;i++){
            if(arr[i] == x){
                if(first == -1) first = i;
                last = i;
            }
        }
        return new int[]{first,last};
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 4, 13, 13, 13, 20, 40, 40};
        int x = 40;
        //System.out.println(optimal(arr, x));

        int ans[] = firstAndLastPosition(arr, x);
        System.out.print(ans[0]+","+ans[1]);
    }
}
