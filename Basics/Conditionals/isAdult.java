import java.util.*;

public class isAdult {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("adult: drive, vote");
        } else {
            System.out.println("not adult");
        }
    
    }
}