
public class RemoveOutermostParantheses {

    public static String remove(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        int depth = 0;

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];

            if (c == '(') {
                if (depth > 0) {
                    sb.append(c);
                }
                depth++;
            } else {
                depth--;
                if (depth > 0) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        String ans = remove(s);
        System.out.println(ans);
    }
}
