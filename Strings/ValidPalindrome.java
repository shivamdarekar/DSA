public class ValidPalindrome{

    public static boolean checkPalindrome(String s){
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;

        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))) j--;

            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(checkPalindrome(str));
    }
}