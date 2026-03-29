import java.util.*;
public class RemoveKDigits{

    public static String removeKDigits(String str, int k){
        Stack<Character>st = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            while(!st.isEmpty() && k>0 && st.peek() > ch){
                st.pop();
                k--;
            }
            st.add(ch);
        }

        //if all digits in increasing order ex:123456 or all are zeros
        while(k > 0){
            st.pop();
            k--;
        }

        if(st.isEmpty()) return "0";

        StringBuilder sb = new StringBuilder();
        for(char x:st){
            sb.append(x);
        }

        while(sb.length()>0 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }

        if(sb.length() == 0) return  "0";

        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "1432219";
        int k = 3;
        System.out.println(removeKDigits(str, k));

        //remove k digits from a number and make number as small as possible
    }
}