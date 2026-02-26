public class SqrtOfElement{

    static int Brut(int n){
        int ans = 1;
        for(int i=1;i<=n;i++){
            if(i*i <= n) ans = i;
            else break;
        }
        return ans;
    }

    public static int Optimal(int n){
        int ans = 0;
        int start = 1, end = n;

        while(start <= end){
            int mid = (start+end)/2;

            if(mid * mid <= n){
                ans = mid;
                start = mid+1;
            }
            else end = mid - 1;
        }
        return ans;
    }//O(logn)

    public static void main(String args[]){
        int n = 28;
        System.out.println(Brut(n));
        System.out.println(Optimal(n));
    }
}