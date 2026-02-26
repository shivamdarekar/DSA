//arr={2,4,6,8,10} ek element ke pairs form karne hai other elements ke saath
/*
like (2,4)  (2,6) (2,8) (2,10)
     (4,6) (4,8) (4,10)
     (6,8) (6,10)
     (8,10) 
 */

public class Pairs {

    public static void printPairs(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int current = numbers[i]; //2,4,6,8
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("("+current+","+numbers[j]+")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,16};
        printPairs(numbers);
    }
}