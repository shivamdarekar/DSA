public class Sort{

    public static void Count(int arr[]){
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0) cnt0++;
            else if(arr[i] == 1) cnt1++;
            else cnt2++;
        }

        for(int i=0;i<cnt0;i++){
            arr[i] = 0;
        }

        for(int i=cnt0;i<cnt0+cnt1;i++){
            arr[i] = 1;
        }

        for(int i=cnt0+cnt1;i<arr.length;i++){
            arr[i] = 2;
        }
    }//O(n^2)

    //Dutch National flag algorithm
    public static void optimal(int arr[]){
        int n = arr.length;
        int low=0, mid=0, high=n-1;

        while(mid <= high){
            
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                low++;
                mid++;
            }
            else if(arr[mid] == 1) mid++;
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
    }//O(n)

    public static void main(String args[]){
        int arr[] = {0, 2, 1, 2, 0, 1, 1, 0, 2, 0};

        optimal(arr);
        for(int j:arr) System.out.print(j+" ");
    }
}