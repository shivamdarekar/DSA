public class ReverseArray{

    public static void swap(int[] arr, int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static void approach1(int[] arr, int l, int r){
        if(l >= r){
            return;
        }

        swap(arr, l, r);
        approach1(arr, l+1, r-1);
    }

    public static void approach2(int[] arr, int i){
        if(i >= arr.length/2) return;

        swap(arr, i, arr.length-i-1);
        approach2(arr, i+1);
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        //approach1(arr, 0, arr.length-1);
        approach2(arr, 0);

        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}