public class PeakElement{

    public static int Brut(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            boolean left = (i == 0) || (arr[i] >= arr[i-1]);
            boolean right = (i == n-1) || arr[i] >= arr[i+1];

            if(left && right) return i;
        }
        return -1;
    }

    public static int Optimal(int arr[]){
        int n = arr.length;
        int start = 1, end = n-2;

        if(n == 1) return 0;
        if(arr[0] > arr[1]) return 0;
        if(arr[n-1] > arr[n-2]) return n-1; 

        while(start <= end){
            int mid = (start+end) / 2;

            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(arr[mid] > arr[mid-1]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    //if multiple peaks present
    public static int Opt2(int arr[]){
        int n = arr.length;
        int start = 1, end = n-1;

        if(n == 1) return 0;
        if(arr[0] > arr[1]) return 0;
        if(arr[n-1] > arr[n-2]) return n-1;

        while(start <= end){
            int mid = (start+end)/2;

            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(arr[mid] > arr[mid-1]) return start = mid+1;
            else if(arr[mid] > arr[mid+1]) return end = mid-1;
            else start = mid + 1;

        }
        return -1;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8};
        System.out.print(Brut(arr));
    }
}