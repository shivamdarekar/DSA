public class LargestOdd{

public static String lg(String str){
    int n = str.length();
    int idx = -1;
    int i;

    //find last odd digit
    // char - '0' converts ASCII digit to numeric value (e.g., '5' - '0' = 5)
    // then % 2 == 1 checks if the digit is odd
    for(i=n-1;i>=0;i--){
        if((str.charAt(i) - '0') % 2 == 1){
            idx = i;
            break;
        }
    }

    //return empty string if no odd digit
    if(idx == -1) return "";

    i = 0;
    while(i <= idx && str.charAt(i) == '0') i++;

    return str.substring(i, idx+1);

}

    public static void main(String[] args) {
        String str = "0034537468";
        System.out.println(lg(str));
    }
}