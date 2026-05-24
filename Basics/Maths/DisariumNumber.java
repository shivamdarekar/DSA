//number is called Disarium if sum of its digits powered with their respective positions is equal to the number itself.

public class DisariumNumber{

    public static boolean isDisarium(int n){
        double sum = 0;
        String s = Integer.toString(n);

        for(int i=0;i<s.length();i++){
            int x = s.charAt(i) - '0';
            sum += Math.pow(x, i+1);
        }

        if(sum == n) return true;
        return false;
    }

    public static void main(String[] args) {
        int n = 89;
        System.out.print(isDisarium(n));
    }
}