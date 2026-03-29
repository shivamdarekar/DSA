public class FindMiddleIndex{

    public static int middleidx(int[] arr){
        int n = arr.length;
        int leftSum = 0;
        int totalSum = 0;

        for(int x:arr) totalSum += x;

        for(int i=0;i<n;i++){
            int rightSum = totalSum - leftSum - arr[i];

            if(rightSum == leftSum) return i;

            leftSum = leftSum + arr[i];
        } 
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,-1,8,4};
        //output = 3rd index
        //becoz before and after 3rd index sum of element is equal

        System.out.print(middleidx(arr));
    }
}