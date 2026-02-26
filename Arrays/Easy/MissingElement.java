public class MissingElement{

    public static int missingnum(int arr[]){
        int n = arr.length+1;
        for(int i=1;i<=n;i++){
            int flag = 0;
            for(int j=0;j<n-1;j++){
                if(arr[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) return i;
        }
        return -1;
    } 
    //TC -> O(n^2)
    //SC -> O(1)


    public static int optimal(int arr[]){
        int n = arr.length;

        //sum of 1st n numbers
        int sum = (n * (n + 1)) / 2;

        int s2 = 0;
        for(int i=0;i<n;i++){
            s2 += arr[i];
        }

        int missingnum = sum - s2;
        return missingnum;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        System.out.print(optimal(arr));
    }
}