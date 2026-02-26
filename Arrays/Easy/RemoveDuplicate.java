public class RemoveDuplicate{

    //two pointer approach
    public static int removeDuplicate(int arr[]){
        int j = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[j] != arr[i]){
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
    }

    public static void main(String args[]){
        int arr[] = {1,1,2,3,3,4,5,5};
        int k1 = removeDuplicate(arr);

        for(int i=0;i<arr.length;i++){
            if(i < k1) System.out.print(arr[i] + " ");
            else System.out.print("_ ");
        }
    }
}