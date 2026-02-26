//find the longest substring with at most k distinct characters

import java.util.*;
public class LongestSubstringAtmostKChar{

    public static int st(String str, int k){
        if(k==0 || str.length() == 0) return 0;
        int maxLength = 0;
        int left = 0;

        Map<Character, Integer>mpp = new HashMap<>();

        for(int right = 0; right < str.length(); right++){
            char ch = str.charAt(right);
            mpp.put(ch, mpp.getOrDefault(ch,0)+1);

            while(mpp.size()>k){
                mpp.put(str.charAt(left), mpp.get(str.charAt(left))-1);
                if(mpp.get(str.charAt(left)) == 0){
                    mpp.remove(str.charAt(left));
                }
                left++;
            }

            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
    //TC = O(n) -> Right pointer → O(n) | Left pointer → O(n) (total, not nested)
    //Sc = O(k) -> HashMap stores at most k characters

    public static void main(String args[]){
        String str = "aababbcaacc";
        int k = 2;
        System.out.print(st(str,k));
    }
}