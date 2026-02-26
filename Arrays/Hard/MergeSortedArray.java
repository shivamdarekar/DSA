
import java.util.Arrays;

//merge two sorted array without  using extra space

public class MergeSortedArray{

    public static int[] merge(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;
        int idx = 0;

        int[] ans = new int[n+m];

        while(i < n && j < m){
            if(arr1[i] <= arr2[j]){
                ans[idx] = arr1[i];
                idx++;
                i++;
            }else{
                ans[idx] = arr2[j];
                idx++; j++;
            }
        }

        while(i < n){
            ans[idx++] = arr1[i++];
        }

        while(j < m){
            ans[idx++] = arr2[j++];
        }

        return ans;

        //also we can overwrite arr1,arr2 elemets by arr3 so they are in correct order 
    }
    //TC = O(n+m) | SC = O(n+m)

    //que is do not merge just sort both array as per correct order
    public static void optimal(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int i = n-1;
        int j = 0;

        while(i >= 0 && j < m){
            if(arr1[i] > arr2[j]){
                swap(arr1, arr2, i, j);
                i--; j++;
            }else{
                break;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    //TC = O(min(n,m)) + O(nlogn) + O(mlogm) | SC = O(1)

    public static void swap(int[] arr1, int[] arr2, int i, int j){
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {0,2,4,6,8,9};

        optimal(arr1, arr2);
        for(int x: arr1) System.out.print(x+" ");
        for(int y: arr2) System.out.print(y+" ");
    }
}