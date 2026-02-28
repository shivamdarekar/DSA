public class ReverseVowels{

    public static String reverseVowel(String s){
        char[] arr = s.toCharArray();
        int n = arr.length;
        int left = 0, right = n-1;

        while(left < right){
            if(!isVowels(arr[left])) left++;
            else if(!isVowels(arr[right])) right --;
            else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return new String(arr);
    }

    public static boolean isVowels(char ch){
        ch = Character.toLowerCase(ch);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "IceCreAmi";
        System.out.print(reverseVowel(str));
    }
}