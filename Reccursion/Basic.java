//a function calling itself end with a specific base case
//TC = O(n) | SC = O(n)-> becoz stack that stores the flow

public class Basic{

    //print you name n times
    public static void printName(int i, int n){
        if(i > n) return;

        System.out.println("Shivam");
        printName(i+1,n);
    }

    //print numbers from 1 to n
    public static void printNumbers(int i, int n){
        if(i > n) return;

        System.out.println(i);
        printNumbers(i+1, n);
    }

    //print numbers from n to 1
    public static void printReverse(int i, int n){
        if(i < 1) return;

        System.out.println(i);
        printReverse(i-1, n);
    }

    //---------Backtracking Basics ------------//

    //print numbers from 1 to n with backtracking
    public static void printNum(int i, int n){
        if(i<1) return;

        printNum(i-1,n);
        System.out.println(i);
    }

    //print n to 1 with backtracking
    public static void printNumReverse(int i, int n){
        if(i > n) return;

        printNumReverse(i+1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        int n = 4;
        //printName(1, n);
        //printNumbers(1, n);
        //printReverse(n, n);

        //printNum(n, n);
        printNumReverse(1, n);
    }
}