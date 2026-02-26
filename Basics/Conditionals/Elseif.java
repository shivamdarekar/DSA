
import java.util.Scanner;

//in elseif agar if true hai to elseif check nahi hoga 
//lekin if false hai to elseif check hoga

public class Elseif{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Adult");
        } else if(age >= 12 && age<=18) {
            System.out.println("teenager");
        }else {
            System.out.println("Child");
        }
        
    }
}