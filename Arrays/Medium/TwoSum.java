import java.util.*;
public class TwoSum{

    public static int[] brutForce(int num[], int tar){
        int n=num.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(num[i] + num[j] == tar){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }//O(n2) -> 2 loops


    public static void twoPointer(int num[],int tar){
        Arrays.sort(num);

        int n = num.length;
        int start=0,end=n-1;

        while(start<end){
            int sum = num[start] + num[end];

            if(sum == tar){
                System.out.println(num[start]+","+num[end]);
                return;
            } 
            else if(sum > tar) end--;
            else start++;
        }
        System.out.print("no pair found");
    }
    //O(n) -> covering all array + O(nlogn) -> sorting

    public static int[] hashMap(int num[],int tar){
        Map<Integer,Integer>map = new HashMap<>(); //value,index

        for(int i=0;i<num.length;i++){
            int first = num[i];
            int sec = tar - first;
            //sum = first + sec

            if(map.containsKey(sec)){
                return new int[]{map.get(sec),i};
            }

            map.put(first,i);
        }
        return new int[]{};
    }//O(n)
    

    public static void main(String args[]){
        int num[] = {3,2,4,5,1};
        int tar = 6;

        // int[] ans = brutForce(num, tar);
        // System.out.println(ans[0]+","+ans[1]);
        // //for(int j:ans) System.out.print(j);

         twoPointer(num, tar);

    //     int[] ans2 = hashMap(num, tar);
    //     System.out.println(ans2[0]+","+ans2[1]);
     }
}