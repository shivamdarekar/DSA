//two strings s and part, perform the following operation on s until all occurrences of the substring part are removed

public class RemoveSubstringOcc{

    public static String removeOcc(String s, String part){
        int m = part.length();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            sb.append(ch);

            if(sb.length() >= m){
                if(sb.substring(sb.length() - m).equals(part)){
                    sb.delete(sb.length() - m, sb.length());
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        //output = dab

        System.out.print(removeOcc(s, part));
    }
}