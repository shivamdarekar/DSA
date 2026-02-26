public class Vowel{

    public static int countVowels(String str){
        int count = 0;

       for(int i=0;i<str.length();i++){
        char ch = Character.toLowerCase(str.charAt(i));

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            count++;
        }
       }
       return count;
    }

    public static void main(String[] args) {
        String str = "aabbcceioytuAABBCCEEII";
        int num = countVowels(str);

        System.out.println("there are total "+num+" vowels in given string");
    }
}