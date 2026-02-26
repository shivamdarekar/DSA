//search k in sorted rotated array and array contain duplicate elements

public class SearchRotatedDupli{

    //brut by linear search- O(n)

    public static boolean optimal(int arr[],int k){
        int n = arr.length;
        int start = 0, end = n-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid] == k) return true;

            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                start = start+1;
                end = end-1;
                continue;
            }

            if(arr[start] <= arr[mid]){
                if(k >= arr[start] && k <= arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(k >= arr[mid] && k <= arr[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return false;
    }
    //best case = O(logn)
    //worst case = O(n/2) -> shrinks almost half of array if input is arr2

    public static void main(String args[]){
        int arr[] = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int arr2[] = {3,3,1,3,3,3,3};
        int k = 1;
        System.out.print(optimal(arr2,k));
    }
}