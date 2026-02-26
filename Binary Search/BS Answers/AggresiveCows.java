//place the cows in stall[] so minimum distance is max.
//return min dist which is max in all possible allocation

import java.util.Arrays;
public class AggresiveCows{

    public static boolean canPlaceCow(int[] stall, int d, int cows ){
        int cowCount = 1;
        int lastPos = stall[0];

        for(int i=1;i<stall.length;i++){
            if(stall[i] - lastPos >= d){
                cowCount++;
                lastPos = stall[i];
            }
            if(cowCount >= cows) return true;
        }
        return false;
    }

    public static int Brut(int stall[], int cows){
        int n = stall.length;
        Arrays.sort(stall);

        int maxDist = stall[n-1] - stall[0];
        int ans = 0;

        for(int d=1;d<=maxDist;d++){
            if(canPlaceCow(stall, d, cows)){
                ans = d;
            }
        }
        return ans;
    }

    public static int Optimal(int stall[], int cows){
        int n = stall.length;
        Arrays.sort(stall);

        int maxDist = stall[n-1] - stall[0];
        int start = 1, end = maxDist;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(canPlaceCow(stall, mid, cows)){
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }
        return end;
    }
    //O(nlogn) + O(n + log(max-min))

    public static void main(String args[]){
        int[] stall = {2,3,4,15,8,10}; //2 3 4 8 10 15
        int cows = 3;
        System.out.print(Brut(stall, cows));
    }
}