public class DepthParenthesis{

    public static int st(String str){
        int maxDepth = 0;
        int currentDepth = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(') currentDepth++;
            else if (ch == ')') currentDepth--;
            maxDepth = Math.max(currentDepth,maxDepth);
        }
        return maxDepth;
    } //Tc- O(n)

    public static void main(String args[]){
        String str = "(1+(2*3)+((8)/4))+1";

        System.out.print(st(str));
    }
}