
import java.util.*;

//Length of longest substring without repetation of characters

public class LengthOfLongestSubstring{

    public static int basic(String str){
        int n = str.length();
        int left = 0, maxLen = 0;

        Set<Character>st = new HashSet<>();

        for(int right = 0; right < n; right++){
            char ch = str.charAt(right);

            while(st.contains(ch)){
                st.remove(str.charAt(left));
                left++;
            }
            st.add(ch);

            maxLen = Math.max(maxLen, right - left+1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "cadbzabcd";
        System.out.print(basic(s));
    }
}