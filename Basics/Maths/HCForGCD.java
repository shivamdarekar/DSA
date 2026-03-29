//find hcf or GCD of a number

public class HCForGCD{

    public static void Brut(int n1, int n2){
        int i = Math.min(n1,n2);

        for(;i>=1;i--){
            if(n1 % i == 0 && n2 % i == 0){
                System.out.print(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;
        Brut(num1,num2);
    }
}