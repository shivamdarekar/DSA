//if we remove atmost 1 char from string is this string is valid palindrome 
public class ValidPalindrome_II{

    public static boolean validPalindrome(String s){
        int i = 0;
        int j = s.length()-1;

        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return check(s,i+1,j) || check(s,i,j-1);
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean check(String s, int i, int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }

    public static void main(String args[]){
        String str = "abcdabacba";
        System.out.print(validPalindrome(str));
    }
}