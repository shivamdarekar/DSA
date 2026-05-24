
import java.util.*;

//one to one mapping of words
public class WordPattern{

    public static boolean isMatch(String pattern, String words){
        String[] arr = words.split(" ");

        if(arr.length != pattern.length()) return false;

        for(int i=0;i<arr.length;i++){
            String word = arr[i];
            char ch = pattern.charAt(i);

            Map<Character, String>mpp1 = new HashMap<>();
            Map<String, Character>mpp2 = new HashMap<>();

            if(mpp1.containsKey(ch)){
                if(!mpp1.get(ch).equals(word)) return false;
            }else{
                mpp1.put(ch, word);
            }

            if(mpp2.containsKey(word)){
                if(!mpp2.get(word).equals(ch)) return false;
            }else{
                mpp2.put(word, ch);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        System.out.print(isMatch(pattern, s));
    }
}