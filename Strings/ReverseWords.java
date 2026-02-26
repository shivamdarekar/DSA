
import java.util.*;

public class ReverseWords{

    public static String Brut(String str){
        List<String>words = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                sb.append(str.charAt(i));
            }
            //if space and word is formed
            else if (sb.length() > 0){
                words.add(sb.toString());
                sb.setLength(0); //reset sb
            }
        }
        //for last word
        if(sb.length() > 0){
            words.add(sb.toString());
        }

        Collections.reverse(words);
        return String.join(" ", words);
    }

    public static String Optimal(String str){
        int n = str.length();
        StringBuilder result = new StringBuilder();
        int i = n-1;

        while(i>=0){

            while(i >= 0 && str.charAt(i) == ' '){
                i--;
            }

            int end = i;

            while(i >= 0 && str.charAt(i) != ' '){
                i--;
            }
            int start = i+1;

            if(result.length() > 0){
                result.append(" ");
            }
            result.append(str.substring(start, end+1));
        }
        return result.toString();
    }

    public static void main(String args[]){
        String str = "amazing coding skills";
        System.out.println(Optimal(str));
    }
}