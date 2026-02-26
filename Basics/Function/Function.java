//Fuction => Block of code to perform some task 
//void main is a function who return nothing 
//methods => class ke andar likhe hue fucnctions.
//f:n is reusale code write ones and use many times in same file
//every f:n in java is a method.

import java.util.*;

public class Function {

    public static void Helloworld() {
        System.out.println("Hello World");
    }

    public static int calculateSum(int a,int b){  //parameter
        int sum = a+b;
        //System.out.println("sum is: "+sum);
        return sum;
    }

    public static void main(String[] args) {
        //Helloworld(); //function call

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a,b);  //argument or actual parameters
        System.out.println("sum is: "+sum);
    }
}


//function overloading => multiple function with same name but different parameters