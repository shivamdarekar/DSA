//lower bound -> smallest index such that arr[idx] >= x

public class LowerBound{

    public static int optimal(int arr[],int x){
        int n = arr.length;
        int start=0, end = n-1;
        int ans = n;

        while(start<=end){
            int mid = (start + end) / 2;

            if(arr[mid] >= x) {
                ans = mid;
                end = mid - 1;
            }
            else start = mid + 1;
        }
        return ans;
    }//O(log2n)

    public static int brut(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= x){
                return i;
            }
        }
        return arr.length;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,3,7,8,9,9,9,11};
        int x = 10;
        System.out.print(brut(arr, x));
    }
}