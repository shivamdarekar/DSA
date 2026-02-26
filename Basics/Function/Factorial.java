
import java.util.*;

public class Factorial {

    public static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }

        return f;
    }

    public static int Binomialcoff(int n, int r){
        //BC = n!/r! * (n-r)!

        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);

        int BC = a / (b * c);

        return BC;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        System.out.print("Enter value of r : ");
        int r = sc.nextInt();

        //System.out.println("Factorial: " + factorial(n));

    System.out.println("Binomial Coefficient: "+ Binomialcoff(n,r));

    }
}
