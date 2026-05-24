import java.util.*;
public class MergeSort{

    public static void mergeSort(int[] arr, int low, int high){
        if(low >= high) return;

        int mid = (low+high)/2;

        //sort left half
        mergeSort(arr, low, mid);

        //sort right half
        mergeSort(arr, mid+1, high);

        //merge both halves
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high){
        List<Integer>lt = new ArrayList<>();
        int left = low, right = mid+1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]) {
                lt.add(arr[left]);
                left++;
            }else{
                lt.add(arr[right]);
                right++;
            }
        }

        while(right <= high){
            lt.add(arr[right]);
            right++;
        }

        while(left <= mid){
            lt.add(arr[left]);
            left++;
        }

        for(int i=low;i<=high;i++){
            arr[i] = lt.get(i-low);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,5,8,1,4,3,2};
        mergeSort(arr, 0, arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}