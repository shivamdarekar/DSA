
public class ConvertToLowercase {

    public static String convert(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            sb.append(ch);
        }

        return sb.toString();
    }

    /*
    'A' → 65  
    'a' → 97  
    Difference = 32
    uppercase + 32 = lowercase
     */
    public static void main(String[] args) {
        String s = "HAPPY";
        System.out.println(convert(s));
    }
}
