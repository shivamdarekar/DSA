import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FindAllAnagrams{

    public static List<Integer> findAnagrams(String s, String p){
        int[] pfreq = new int[26];
        int[] sfreq = new int[26];

        List<Integer>st = new ArrayList<>();

        for(int i=0;i<p.length();i++){
            pfreq[p.charAt(i) - 'a']++;
        }

        int k = p.length();

        for(int i=0;i<s.length();i++){
            sfreq[s.charAt(i) - 'a']++;

            if(i>=k){
                sfreq[s.charAt(i-k) - 'a']--;
            }

            if(Arrays.equals(sfreq,pfreq)){
                st.add(i-k+1);
            }
        }
        return st;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        //Output: [0,6] = return an array of all the start indices of p's anagrams in s
        
        System.out.println(findAnagrams(s, p));
    }
}