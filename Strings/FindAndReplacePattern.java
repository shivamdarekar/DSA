import java.util.*;
public class FindAndReplacePattern{

     public static List<String> Optimal(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        String pEncoded = encode(pattern);

        for (String word : words) {
            if (encode(word).equals(pEncoded)) {
                ans.add(word);
            }
        }

        return ans;
    }

    public static String encode(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for (char c : s.toCharArray()) {
            map.putIfAbsent(c, idx++);
            sb.append(map.get(c));
        }

        return sb.toString();
    }

    //#####################################################################

    public static List<String> Better(String[] words, String pattern){
        List<String>ans = new ArrayList<>();

        for(int i=0;i<words.length;i++){
            String word = words[i];

            if(isMatch(word, pattern)){
                ans.add(word);
            }
        }
        return ans;
    }

    public static boolean isMatch(String word, String pattern){
        if(word.length() != pattern.length()) return false;

        int[] mpp1 = new int[256];
        int[] mpp2 = new int[256];

        for(int i=0;i<word.length();i++){
            if(mpp1[word.charAt(i)] != mpp2[pattern.charAt(i)]) return false;

            mpp1[word.charAt(i)] = i+1;
            mpp2[pattern.charAt(i)] = i+1;
        }
        return true;
    }


    public static void main(String[] args) {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";

        List<String> ans = Better(words, pattern);
        System.out.println(ans);
    }
}