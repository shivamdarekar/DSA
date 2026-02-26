public class RotatedMin{

    public static int bs(int arr[]){
        int n = arr.length;
        int start = 0,end = n-1;
        int ans = Integer.MAX_VALUE;

        while(start<=end){
            int mid = (start+end)/2;

            if(arr[start] <= arr[end]){
                ans = Math.min(ans,arr[start]);
                break;
            }

            if(arr[start] <= arr[mid]){
                ans = Math.min(ans,arr[mid]);
                start = mid+1;
            }else{
                ans = Math.min(ans,arr[mid]);
                end = mid-1;
            }
        }
        return ans;
    }//O(logn)

    public static void main(String args[]){
        int arr[] = {7,8,9,1,2,3,4};
        System.out.print(bs(arr));
    }
}