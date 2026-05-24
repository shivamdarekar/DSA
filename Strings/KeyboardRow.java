import java.util.*;
public class KeyboardRow{

    public static String[] findWords(String[] words) {
        int n = words.length;
        List<String>lt = new ArrayList<>();
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";

        for(int i=0;i<n;i++){
            String s = words[i];
            if(isRowContains(s,r1) || isRowContains(s,r2) || isRowContains(s,r3)){
                lt.add(s);
            }
        }

        return lt.toArray(new String[0]);
    }

    public static boolean isRowContains(String s, String row){
        s = s.toLowerCase();
        for(char c: s.toCharArray()){
            if(row.indexOf(c) == -1) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
    }
}