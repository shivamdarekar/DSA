import java.util.*;
public class Union{

    public static List<Integer> unionBrut(int arr1[], int arr2[]){
        Set<Integer>set = new HashSet<>();

        for(int num1:arr1) set.add(num1);
        for(int num2:arr2) set.add(num2);

        List<Integer>union = new ArrayList<>(set);
        Collections.sort(union);
        return union;
    }

    public static void optimal(int arr1[], int arr2[]){
        
    }

    public static void main(String args[]){
        int arr1[] = {1,1,2,3,4,4,5};
        int arr2[] = {1,2,3,4,6,8,8,9};

        System.out.print(unionBrut(arr1, arr2));
    }
}