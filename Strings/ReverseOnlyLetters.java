public class ReverseOnlyLetters{

    public static String reverse(String str){
        char[] arr = str.toCharArray();
        int i = 0, j = arr.length-1;

        while(i < j){
            if(!Character.isLetter(arr[i])) i++;
            else if(!Character.isLetter(arr[j])) j--;
            else{
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "Test1ng-Leet=code-Q!";
        System.out.println(reverse(str));
    }
}