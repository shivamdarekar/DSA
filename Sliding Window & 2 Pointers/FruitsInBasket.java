
import java.util.*;

public class FruitsInBasket{

    public static int Better(int[] arr){
        int n = arr.length;
        int maxFruits = 0;
        int left = 0;
        Map<Integer,Integer>mpp = new HashMap<>();

        for(int right = 0; right < n; right++){
            //add current fruit
            mpp.put(arr[right],mpp.getOrDefault(arr[right],0)+1);

            while(mpp.size() > 2){
                mpp.put(arr[left], mpp.get(arr[left])-1);
                
                if(mpp.get(arr[left]) == 0){
                    mpp.remove(arr[left]);
                }
                left++;
            }

            maxFruits = Math.max(maxFruits, right-left + 1);
        }
        return maxFruits;
    }
    //TC = O(n) | SC = O(1);

    public static void main(String args[]){
        int[] arr = {1,2,1,3,4,3,4,5};
        System.out.print(Better(arr));
    }
}

/*
arr is fruits produce by tree
There are two baskets available, and each basket can only contain one kind of fruit. The quantity of fruit each basket can contain is unlimited.
Start at any tree, but as you proceed to the right, select exactly one fruit from each tree, including the starting tree. One of the baskets must hold the harvested fruits.
Once reaching a tree with fruit that cannot fit into any basket, stop.
return max number of fruits
 */