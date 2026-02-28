public class SortedOrNot{

    public static boolean ans(int[] arr){
        int n = arr.length;
        int cnt = 0;

        for(int i=0;i<n;i++){
            if(arr[i] > arr[(i+1) % n]) cnt++;
        }
        return cnt <= 1;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,5,6,1,2};
        System.out.println(ans(arr));
    }
}