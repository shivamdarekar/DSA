
import java.util.ArrayList;

public class MoveZeros{

    public static int[] brutForce(int arr[]){
        int n = arr.length;

        //temp array
        ArrayList<Integer>temp = new ArrayList<>();

        //add non-zero in array
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                temp.add(arr[i]);
            }
        }

        //cal non-zero numbers
        int nz = temp.size();

        //cpy temp elements fill in first nz places of original arr
        for(int i=0;i<nz;i++){
            arr[i] = temp.get(i);
        }

        //fill rest with 0
        for(int i=nz;i<n;i++){
            arr[i] = 0;
        }

        return arr;
    }

    //two pointer
    public static int[] optimal(int arr[]){
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }

        while(j < arr.length){
            arr[j] = 0;
            j++;
        }

        return arr;
    }

    public static void main(String args[]){
        int arr[] = {1,0,2,3,2,0,0,4,5,1};

        //brutForce(arr);

        optimal(arr);
        
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}