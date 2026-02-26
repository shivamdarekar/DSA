//swap adjecent elements

public class bubbleSort {

    public static void sort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) { //loop unsorted part tak jayega
                if (arr[j] > arr[j + 1]) {
                    //swap 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {4, 5, 1, 3, 2};
        sort(arr);
        printArr(arr);
    }
}

//time complexity => O(n^2)
//in outer loop at place of turn<n-1 we also write turn<n
//but one unnessary loop will run which is waste of time
