//in this problem, given a array of bloom day of flowers and we have find the day of flower bloom when we make m bouquets
//and k adjecent flowers

public class MinBouquets{

    public static boolean possible(int arr[], int day, int m, int k){
        int totalBouq = 0;
        int cnt = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] <= day) cnt++;
            else{
                totalBouq = totalBouq + (cnt/k);
                cnt = 0;
            }
        }
        totalBouq = totalBouq + (cnt/k);

        if(totalBouq >= m) return true;
        else return false;
    }

    public static int Brut(int arr[], int m, int k){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

       for(int x:arr) {
        min = Math.min(min,x);
        max = Math.max(max,x);
       }

       for(int i=min;i<=max;i++){
        boolean possibleBouq = possible(arr, i, m, k);

        if(possibleBouq == true) return i;
       }
       return -1;
    }
    //O((max-min+1) * n)

    public static int Optimal(int arr[], int m, int k){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int n:arr){
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        int start = min, end = max;
        while(start<=end){
            int mid = start + (end-start)/2;
            boolean possibleBouq = possible(arr, mid, m, k);

            if(possibleBouq == false) start = mid+1;
            else end = mid-1;
        }
        return start;
    }
    //O(n * log(max-min+1))

    public static void main(String args[]){
        int arr[] = {7,7,7,7,12,7,7};
        
        //no. of bouquets = m & adjecent flowers required = k
        int m = 2, k = 3;

        System.out.print(Optimal(arr, m, k));
    }
}