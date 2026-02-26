//find last digit of num = num % 10 
//remove last digit of num = num / 10

/*
if n=1023 to pahle iska  last digit find karenge % ki help se then 
last digit ko print karenge uske baad divide karke last digit remove karenge jab tak 0 nahi atta.
*/

//to save a reverse num => rev = (rev*10) + lastdigit

public class PrintReverse {
    public static void main(String args[]){
        
        int n = 1099;
        // while(n > 0){
        //     int lastDigit = n % 10;
        //     System.out.print(lastDigit);
        //     n = n / 10;
        // }
        //System.out.println();



        //Reverse the given number,save in var and print
        int rev = 0;
        while(n > 0){
            int lastDigit = n % 10;
            rev = (rev*10) + lastDigit;
            n = n / 10;
        }
        System.out.println(rev);
    }
};

