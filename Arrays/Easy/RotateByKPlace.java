public class RotateByKPlace{

    public static void brutForce(int arr[], int d){
        int n = arr.length;
        d = d % n;

        int temp[] = new int[d];
        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }
        //System.arraycopy(arr, 0, temp, 0, d);

        for(int i=d;i<n;i++){
            arr[i-d] = arr[i];
        }

        for(int i=n-d;i<n;i++){
            arr[i] = temp[i-(n-d)];
        }
    }
    //TC = O(d)+O(n-d)+O(d) = O(n+d)
    //SC = O(d) -> extra temp arr


    //helper reverse
    public static void reverse(int arr[],int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }

    public static void optimal(int arr[], int d){
        int n = arr.length;
        d = d % n;

        //reverse 1st d
        reverse(arr,0,d-1);

        //reverse remaining n-k
        reverse(arr,d,n-1);

        //reverse whole array
        reverse(arr,0,n-1);  //3
    }
    //TC = O(d)+O(n-d)+O(n) = O(2n) -> more than brut 
    //Sc = O(1) = not using extra space

    public static void main(String args[]){
        int arr[] = {1,2,3,4,6,7};
        int d = 9;

        //brutForce(arr, d);

        optimal(arr, d);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}