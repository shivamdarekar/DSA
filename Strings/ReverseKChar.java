//For every 2k characters from the start , Reverse first k, Keep next k same
/*
Case 1: Remaining < k --> Reverse all remaining.
Case 2: Remaining >= k but < 2k --> Reverse only first k.
Case 3: Remaining >= 2k  --> Normal behavior.
*/

public class ReverseKChar{

    public static String reverseChar(String s, int k){
        char[] arr = s.toCharArray();
        int n = arr.length;

        for(int i=0;i<n;i = i + 2*k){
            int left = i;
            int right = Math.min(i+k-1, n-1);

            while(left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "abcdefgh";
        int k = 3;
        System.out.print(reverseChar(str, k));
    }
}