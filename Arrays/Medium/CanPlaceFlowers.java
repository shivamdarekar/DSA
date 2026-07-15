public class CanPlaceFlowers{

    public static boolean canPlace(int[] arr, int k){
        int n = arr.length;
        int cnt = 1;

        for(int i=0;i<n;i++){
            if(arr[i] == 0 &&
               (i == 0 || arr[i-1] == 0) &&
               (i == n-1 || arr[i+1] == 0)
            ){
                arr[i] = 1;
                cnt++;
            }
        }
        return cnt >= k;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 1};
        int k = 2;
        System.out.println(canPlace(arr, k));
    }
}