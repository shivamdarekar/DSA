public class CallByValue {

    public static void swap(int a,int b){
        //swap
        int temp = a;
        a = b;
        b = temp;

        // System.out.println("a = "+a);
        // System.out.println("b = "+b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        swap(a, b);

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}


/*
- java mai hum cal by value use karte hai
- call by value mai main f:n mai jo originsl variable hai uski copy dusre f:n mai pass hoti hai 
- iss karan main mai a & b ki  value print karne ke baad swap nahi hui kyuki swap f:n mai buss orginal a & b ki copy gayi aur uske 
changes ussi f:n tak simit rahe original main f:n mai value cahnge nahi hui
- call by reference mai hum orinal value dusare f:n ko pass karte hai.
 */