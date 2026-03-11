public class ReverseWords_2{

    public static String Brut(String s){
        char arr[] = s.toCharArray();
        int start = 0;

        for(int i=0;i<=arr.length;i++){
            if(i == arr.length || arr[i] == ' '){
                int left = start;
                int right = i-1;

                while(left < right){
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;

                    right--;
                    left++;
                }
                start = i+1;
            }
        }

        return new String(arr);
    }//TC = O(n) | SC = O(n)

    public static String Optimal(String s){
        StringBuilder sb = new StringBuilder();
        int start = 0;

        for(int i=0;i<=s.length();i++){
            if(i == s.length() || s.charAt(i) == ' '){
                for(int j=i-1;j>=start;j--){
                    sb.append(s.charAt(j));
                }
                if(i != s.length()) sb.append(' ');
                start = i+1;
            }
        }
        return sb.toString();
    }//TC = O(n) | SC = O(1);

    public static void main(String args[]){
        String str = "Let's take LeetCode contest";

        System.out.print(Optimal(str));
    }
}