public class InsertSearchPosition{

    public static int insertIndex(int arr[],int x){
        int n = arr.length;
        int start = 0, end = n-1;
        int ans = n;

        while(start<=end){
            int mid = (start+end) / 2;

            if(arr[mid] >= x){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        int arr[] = {1,2,4,5,7};
        int x = 3;
        
        System.out.print(insertIndex(arr, x));
    }
}