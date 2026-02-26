//upper bound -> smallest index such that arr[idx] > x

public class UpperBound{

    public static int brut(int arr[], int x){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] > x) return i;
        }
        return n;
    }

    public static int optimal(int arr[], int x){
        int n = arr.length;
        int ans = n;
        int low = 0, high = n-1;

        while (low<=high){
            int mid = (low + high) / 2;

            if(arr[mid] > x){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,3,7,8,9,9,9,11};
        int x = 9;

        System.out.print(brut(arr, x));
    }
}
