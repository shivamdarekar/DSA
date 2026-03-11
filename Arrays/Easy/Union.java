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

    public static List<Integer> optimal(int arr1[], int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;

        List<Integer>lt = new ArrayList<>();

        int i = 0, j = 0;

        while(i < n1 && j < n2){
            if(arr1[i] < arr2[j]){
                if(lt.isEmpty() || lt.get(lt.size()-1) != arr1[i]){
                    lt.add(arr1[i]);
                    i++;
                }
            }

            else if(arr1[i] > arr2[j]){
                if(lt.isEmpty() || lt.get(lt.size()-1) != arr2[j]){
                    lt.add(arr2[j]);
                    j++;
                }
            }

            else{
                if(lt.isEmpty() || lt.get(lt.size()-1) != arr1[i]){
                    lt.add(arr1[i]);
                    i++;
                    j++;
                }
            }
            
        }
        return lt;

    }

    public static void main(String args[]){
        int arr1[] = {1,1,2,3,4,4,5};
        int arr2[] = {2,2,3,4,6,8,8,9};

        System.out.print(unionBrut(arr1, arr2));
    }
}