public class StringPalindrom{

    public static void isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();

            if(str.charAt(i) != str.charAt(n-1-i)){
                System.out.println("Given string is not a palindrom");
                return;
            }
        }
        System.out.println("Given String is Palindrome");
    }

    //optimal
    public static boolean  optimal(String str){
        int n = str.length();
        int i=0, j=n-1;

        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String args[]){
        String name = "nooon";
        //isPalindrome(name);
        System.out.println(optimal(name));
    }
}