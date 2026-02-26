import java.util.*;

public class LongestCommanPrefix{

    //common prefix jo sab strings me hoga, wo first aur last me bhi hoga
    //Isliye bas first aur last ko compare karna enough hai.
    public static String lg(String[] str){
        int n = str.length;
        StringBuilder ans = new StringBuilder();

        Arrays.sort(str);

        String first = str[0];
        String last = str[n - 1];

        //Dono strings me se shorter length tak compare karenge, Out of bounds se bachne ke liye
        int minLength = Math.min(first.length(),last.length());

        for(int i=0; i<minLength; i++){
            if(first.charAt(i) != last.charAt(i)){
                return ans.toString();
            }

            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String[] arr = {"flower", "flight", "flow"};
        System.out.print(lg(arr));
    }
}