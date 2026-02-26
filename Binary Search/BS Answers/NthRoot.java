public class NthRoot{

    public static int Brut(int n, int m){
        for(int i=1;i<m;i++){
            long power = (long)Math.pow(i, n);
            
            if(power == m) return i;
            if(power > m) break;
        }
        return -1;
    }

    public static int Optimal(int n, int m){
        int start = 1, end = m;

        while(start <= end){
            int mid = (start+end)/2;
            long power = (long)Math.pow(mid, n);

            if(power == m) {
                return mid;
            }
            else if(power > m) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }

    //for large input like m=10^9 n=10
    public static int Opt2(int n, int m){
        int start = 1, end = m;
        while(start<=end){
            int mid = start + (end - start) / 2;

            long ans = 1;
            for(int i=0;i<n;i++){
                ans = ans * mid;
                if(ans > m) break;
            }

            if(ans == m) return mid;
            if(ans > m) end = mid - 1;
            else start = mid+1;
        }
        return -1;
    }

    public static void main(String args[]){
        int n = 3, m = 27;
        //we have to find i^n == m

        System.out.println(Brut(n, m));
        System.out.println(Optimal(n, m));
    }
} 