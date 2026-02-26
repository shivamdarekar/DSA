//search input element in sorted rotated array

public class SearchRotatedArr{

    public static int brut(int arr[],int k){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == k) return i;
        }
        return -1;
    }//O(n)

    public static int optimal(int arr[],int k){
        int n = arr.length;
        int start = 0, end = n-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid] == k) return mid;

            //check which side is sorted 
            if(arr[start] <= arr[mid]){
                //right side is sorted
                if(k >= arr[start] && k <= arr[mid]){ //check k lie btn start to mid
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            } else{
                //left side is sorted
                if(k >= arr[mid] && k <= arr[end]){
                    start = mid+1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }//O(logn)

    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int k = 0;
        System.out.print(optimal(arr, k));
    }
}