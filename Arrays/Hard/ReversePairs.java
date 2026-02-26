//return cnt of reverse pairs where i < j && arr[i] > 2*arr[j]

public class ReversePairs{

    public static int Brut(int[] arr){
        int cnt = 0;

        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(i < j && arr[i] > 2*arr[j]) cnt++;
            }
        }
        return cnt;
    }

    public static void Optimal(int[] arr){
        //need modified merge sort recusrsion
    }

    public static void main(String[] args) {
        int[] arr = {2,4,3,5,1};
        System.out.print(Brut(arr));
    }
}