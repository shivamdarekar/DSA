public class ConsecutiveOnes{

    public static int maxOnes(int arr[]){
        int cnt = 0;
        int mxcnt= 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1) cnt++;
            else cnt = 0;

            mxcnt = Math.max(mxcnt, cnt);
        }
        return mxcnt;
    }

    public static void main(String args[]){
        int arr[] = {1,1,2,3,1,1,1,4,6};
        System.out.print(maxOnes(arr));
    }
}