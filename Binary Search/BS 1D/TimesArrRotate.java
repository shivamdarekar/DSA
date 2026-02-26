public class TimesArrRotate{

    public static int brut(int arr[]){
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int index = -1;

        for(int i=0;i<n;i++){
            if(arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static int opt1(int arr[]){
        int n = arr.length;
        int start = 0,end = n-1;
        int index = -1;
        int min = Integer.MAX_VALUE;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[start] <= arr[end]){
                if(arr[start]<min){
                    min = arr[start];
                    index = start;
                }
                break;
            }

            if(arr[start] <= arr[mid]){
                if(arr[start] < min){
                    min = arr[start];
                    index = start;
                }
                start = mid+1;
            }
            else{
                if(arr[mid]<min){
                    min = arr[mid];
                    index = mid;
                }
                end = mid-1;
            }
        }
        return index;
    }

    public static int opt2(int arr[]){
        int n = arr.length;
        int start = 0, end = n-1;

        while(start < end){
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[end]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }

    public static void main(String args[]){
        int arr[] = {4,5,7,8,0,1,2};
        System.out.println(brut(arr));
    }
}