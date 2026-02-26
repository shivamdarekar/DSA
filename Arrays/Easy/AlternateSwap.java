public class AlternateSwap{

    public static void swap(int arr[]){
        for(int i=0; i<arr.length-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    public static void main(String args[]){
        int num[] = {1,2,3,4,5,6,7};
        swap(num);

        for(int j:num){
            System.out.print(j + " ");
        }
    }
}

//swap alternate numbers