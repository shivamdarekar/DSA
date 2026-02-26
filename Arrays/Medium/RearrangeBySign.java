

public class RearrangeBySign{

    public static int[] Optimal(int arr[]){
        int n =arr.length;
        int[] ans = new int[n];
        int posIndex = 0, negIndex = 1;

        for(int i=0;i<n;i++){
           if(arr[i] < 0){
            ans[negIndex] = arr[i];
            negIndex += 2;
           }else{
            ans[posIndex] = arr[i];
            posIndex += 2;
           }
        }
        return ans;
    }

    public static void main(String args[]){
        int arr[] = {3,1,-2,4,-5,-6};
        int[] ans = Optimal(arr);
        for(int x:ans) System.out.print(x+" ");
    }
}