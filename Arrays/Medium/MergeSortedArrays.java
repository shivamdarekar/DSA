public class MergeSortedArrays{

    public static void merge(int[] arr1, int m, int[] arr2, int n){

        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i >= 0 && j >= 0){
            if(arr1[i] > arr2[j]){
                arr1[k] = arr1[i];
                i--;
            } else{
                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }

        //if arr2 still have elements
        while(j >= 0){
            arr1[k] = arr2[j];
            j--;
            k--;
        }

        //we don't check for arr1 left or not becoz they already in the sorted order and correct place
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,0,0,0};
        int m = 3, n = 3;
        int arr2[] = {2,5,6};

        merge(arr1, m, arr2, n);
        for(int x: arr1){
            System.out.print(x+" ");
        }
    }
}