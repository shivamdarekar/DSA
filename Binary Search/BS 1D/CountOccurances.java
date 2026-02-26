public class CountOccurances{

    public static int firstOcc(int arr[],int x){
        int n = arr.length;
        int first = -1;
        int start = 0, end = n-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid] == x){
                first = mid;
                end = mid-1;
            }
            else if(arr[mid] < x) start = mid + 1;
            else end = mid - 1;
        }
        return first;
    }

    public static int lastOcc(int arr[],int x){
        int n = arr.length;
        int last = -1;
        int start = 0, end = n-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid] == x){
                last = mid;
                start = mid+1;
            }
            else if(arr[mid] < x) start = mid+1;
            else end = mid-1;
        }
        return last;
    }

    public static int[] firstAndLastPosition(int arr[],int x){
        int first = firstOcc(arr, x);
        if(first == -1) return new int[] {-1,-1};
        int last = lastOcc(arr, x);
        return new int[]{first,last};
    }

    public static int count(int arr[],int x){
        int ans[] = firstAndLastPosition(arr, x);
        if(ans[0] == -1) return 0;
        return (ans[1] - ans[0] + 1);
    }//O(2logn)

    public static void main(String args[]){
        int arr[] = {3,4,4,13,13,13,20,40,40};
        int x = 13;
        System.out.println(count(arr,x));
    }
}

//brut by for loop -> O(n)
