import java.util.*;
public class LongestPalindrome{

    public static int ans1(String str){
        int n = str.length();
        int maxlen = 0;
        Map<Character,Integer>mpp = new HashMap<>();

        for(int i=0;i<n;i++){
            char ch = str.charAt(i);

            mpp.put(ch, mpp.getOrDefault(ch, 0)+1);
        }

        boolean oddFound = false;
        for(int x:mpp.values()){
            if(x % 2 == 0) maxlen+=x;
            else if(x % 2 == 1){
                maxlen = maxlen + x-1;
                oddFound = true;
            }
        }

        if(oddFound == true) maxlen+= 1;

        return maxlen;
    }

    public static int ans2(String s){
        int n = s.length();
        int[] freq = new int[128];

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            freq[ch]++;
        }

        int length = 0;
        boolean oddFound = false;
        for(int i=0;i<freq.length;i++){
            int count = freq[i];

            if(count % 2 == 0 ) length += count;
            else if(count % 2 == 1){
                length += count - 1;
                oddFound = true;
            }
        }

        if(oddFound == true) length += 1;
        return length;
    }

    public static void main(String[] args) {
        String str = "abccccdd";
        //find length of longest palindrome that can be built with this letters

        System.out.println(ans2(str)); 
    }
}