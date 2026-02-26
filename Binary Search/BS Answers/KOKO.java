public class KOKO{

    public static long calTotalHours(int[] piles, int i ){
        long TotalHours = 0;
        for(int p:piles){
            //ceil(p/i) = (p+i-1)/i; use long to avoid overflow
            TotalHours = TotalHours + ((long)p + i - 1) / i;
        }
        return TotalHours;
    }

    public static int brut(int[] piles, int h){
        int max = 0;
        for(int p:piles) max = Math.max(max,p);

        for(int i=1;i<=max;i++){
            long hours = calTotalHours(piles,i);

            if(hours <= h) return i;
        }
        return max;
    }

    public static int Optimal(int piles[], int h){
        int max = 0;
        for(int p:piles) max = Math.max(max, p);

        int start = 1, end = max;
        int ans = max;
        while(start <= end){
            int mid = start + (end - start) / 2;

            long totalH = calTotalHours(piles, mid);

            if(totalH <= h){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        int piles[] = {7, 15, 6, 3};
        int h = 8;
        System.out.println(brut(piles, h));
        //System.out.print(Optimal(piles, h));
    }
}