public class SmallestDivisor{

    public static int Brut(int arr[], int limit){
        int max = Integer.MIN_VALUE;
        for(int x:arr) max = Math.max(max, x);

        for(int i=1;i<=max;i++){
            int sum = 0;
            for(int j=0;j<arr.length;j++){
                sum = sum + (int)Math.ceil((double)arr[j]/i);
            }
            if(sum <= limit) return i;
        }
        return -1;
    }
    //O(max * n)

    public static int Optimal(int arr[], int limit){
        int max = Integer.MIN_VALUE;
        for(int x:arr) max = Math.max(max, x);
        int start = 1, end = max;

        while(start<=end){
            int mid = start + (end-start) / 2;
            int sum = 0;
            for(int i=0;i<arr.length;i++){
                sum = sum + (int)Math.ceil((double)arr[i]/mid);
            }

            if(sum <= limit) end = mid - 1;
            else start = mid + 1;
        }
        return start;
    } //O(log(max) * n)

    public static void main (String args[]){
        int arr[] = {1,2,3,4,5};
        int threshold = 8;
        System.out.println(Optimal(arr, threshold));
    }
}