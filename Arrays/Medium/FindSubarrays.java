
//subarray -> continuos part of array
/*
arr = {2,4,6,8,10}
subarray of 2 = {2}, {2,4}, {2,4,6}, {2,4,6,8}, {2,4,6,8,10}
subarray of 4 = {4}, {4,6}, {4,6,8}, {4,6,8,10}
subarray of 6 = {6}, {6,8}, {6,8,10}
subarray of 8 = {8}, {8,10}
subarray of 10 = {10}
 */

public class FindSubarrays {

    public static void findSubarray(int numbers[]){
        int ts = 0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays: "+ ts);
    }
 
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12};
        findSubarray(numbers);
    }
}

/*
i = 0 (start = 0)
j = 0 (end = 0) → print: 2
j = 1 (end = 1) → print: 2 4
j = 2 (end = 2) → print: 2 4 6

i = 1 (start = 1)
j = 1 → 4
j = 2 → 4 6

i = 2 (start = 2)
j = 2 -> 6
 */