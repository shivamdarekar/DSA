public class PaintersPartition{

    public static int countPainters(int arr[], int ans){
        int painters = 1;
        int time = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] + time <= ans){
                time += arr[i];
            }else{
                painters++;
                time = arr[i];
            }
        }
        return painters;
    }

    public static int Brut(int arr[], int k){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int x:arr){
            max = Math.max(x,max);
            sum = sum + x;
        }

        for(int i=max;i<=sum;i++){
            if(countPainters(arr,i) == k){
                return i;
            }
        }
        return max;
    }

    public static int Optimal(int arr[], int k){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int x:arr){
            max = Math.max(x,max);
            sum = sum + x;
        }

        int start = max, end = sum;
        while(start<=end){
            int mid = start + (end-start)/2;
            int totalPainters = countPainters(arr, mid);
            
            if(totalPainters > k) start = mid + 1;
            else end = mid - 1;
        }
        return start;
    }

    public static void main(String args[]){
        int arr[] = {10,20,30,40};
        int k = 2;

        System.out.print(Optimal(arr, k));
    }
}