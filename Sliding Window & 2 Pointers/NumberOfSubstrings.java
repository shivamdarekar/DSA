// Number of substring containing all three characters
// Problem Statement: Given a string s , consisting only of 
// characters 'a' , 'b' , 'c'.Find the number of substrings 
// that contain at least one occurrence of all these characters 'a' , 'b' , 'c'.

public class NumberOfSubstrings{

    public static int numberOfSubstrings(String str){
        int n = str.length();
        int count = 0;
        int[] freq = new int[3];
        int left = 0;

        for(int right = 0; right<n; right++){
            char ch = str.charAt(right);
            freq[ch - 'a']++;

            while(freq[0]>0 && freq[1] > 0 && freq[2] > 0){
                count = count + (n - right);
                freq[str.charAt(left) - 'a']--;
                left++;
            }
        }
        return count;
    }

    public static void main(String args[]){
        String s = "abcba";
        System.out.println(numberOfSubstrings(s));

    }
}