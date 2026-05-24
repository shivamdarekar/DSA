
public class StringPalindrome {

    public static boolean check(String str, int i) {
        int n = str.length();

        if(i >= n/2) return true;

        if (str.charAt(i) != str.charAt(n - i - 1)) {
            return false;
        }

        return check(str, i+1);
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(check(str, 0));
    }
}
