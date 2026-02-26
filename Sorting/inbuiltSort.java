
import java.util.Arrays;


public class inbuiltSort{

    static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,8,6,4,2};
        //Arrays.sort(arr);  //full array sort
        Arrays.sort(arr,0,3); //sort array till specific index (0 to 3)
        printArr(arr);
    }
}

//time complexity => O(logn)