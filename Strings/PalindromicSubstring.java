//Given a string s, return the number of palindromic substrings in it.

public class PalindromicSubstring{

    public static int countSubstrings(String s){
        int n = s.length();
        int cnt = 0;

        for(int i=0;i<n;i++){
            //Odd length palindromes (center at i)
            cnt = cnt + expand(s, i, i);

            //Even length palindromes (center btwn i and i+1)
            cnt = cnt + expand(s, i, i+1);
        }

        return cnt;
    }

    public static int expand(String s, int left, int right){
        int cnt = 0;

        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            cnt++;
            left--;
            right++;

            //expand the center ponits so check palindrome
            //Every successful expansion = 1 palindrome
        }

        return cnt;
    }

    public static void main(String[] args) {
        String str = "baaab";
        //output = 
        System.out.println(countSubstrings(str));
    }
}