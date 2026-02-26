import java.util.*;

public class Anagrams {

    public static boolean isAnagram(String str1,String str2){
      str1 = str1.toLowerCase();
      str2 = str2.toLowerCase();

      if(str1.length() != str2.length()){
        return  false;
      }

      char[] arr1 = str1.toCharArray();
      char[] arr2 = str2.toCharArray();

      Arrays.sort(arr1);
      Arrays.sort(arr2);

      return Arrays.equals(arr1, arr2);
    }

    public static boolean Optimal(String str1, String str2){
      if(str1.length() != str2.length()) return false;

      int freq[] = new int[26];

      for(int i=0;i<str1.length();i++){
        freq[str1.charAt(i) - 'a']++;
        freq[str2.charAt(i) - 'a']--;
      }

      for(int count:freq){
        if(count != 0) return false;
      }
      return true;
    }

    public static void main(String args[]) {
        String str1 = "race";
        String str2 = "care";

        if(Optimal(str1, str2)){
            System.out.println(str1 +" and "+str2 + " are anagrams");
        } else{
            System.out.println(str1 +" and "+str2 + " are not anagrams");

        }
    }
}
