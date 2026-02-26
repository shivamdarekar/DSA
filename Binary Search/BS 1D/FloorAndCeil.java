//floor = largest no. in array <= x
//ceil = smallest no. in array >= x

public class FloorAndCeil{

    public static int findFloor(int arr[], int x){
        int n = arr.length;
        int start = 0, end = n-1;
        int ans = -1;

        while (start<=end){
            int mid = (start + end) / 2;

            if(arr[mid] <= x){
                ans = arr[mid];
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        int arr[] = {10,20,30,40,50};
        int x = 35;
        //floor = 30
        //ceil = 40

        System.out.print(findFloor(arr, x));
    }
}