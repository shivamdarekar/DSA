public class AppearsOnce{

    public static void brut(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int num = arr[i];
            int cnt = 0;

            for(int j=0;j<n;j++){
                if(arr[j] == num){
                    cnt++;
                }
            }
            if(cnt == 1) System.out.print(num+" ");
        }
        
    }//O(n^2)

    public static int optimal(int arr[]){
        int xor = 0;
        for(int i=0;i<arr.length;i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }//O(n)

    public static void main(String args[]){
        int arr[] = {2,2,3,5,6,7,8,8,9,9,1,1};
        brut(arr);
    }
}