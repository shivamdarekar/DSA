//pick element from unsorted part and place it in right position in sorted part

public class insertionSort{

    public static void sort(int arr[]){
        for(int i=1;i<arr.length;i++){ //i=1 because hamne index 0 ko already sorted mana hai
            int curr = arr[i];
            int prev = i-1;

            //finding out the correct position to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            //insertion
            arr[prev+1] = curr;
        }
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[] = {1,3,5,2,4};
        sort(arr);
        printArr(arr);
    }
}