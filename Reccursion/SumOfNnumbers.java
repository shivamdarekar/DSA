public class SumOfNnumbers{

    public static void parameterizeApproach(int i,int sum){
        if(i < 1){
            System.out.println(sum);
            return;
        }

        parameterizeApproach(i-1, sum+i);
    }

    public static int functionalApproach(int n){
        if(n == 0){
            return 0;
        }

        return n + functionalApproach(n-1);
    }

    public static int factorialOfNum(int n){  //3 2 1 0
        if(n == 0){
            return 1;
        }

        return n * factorialOfNum(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        //parameterizeApproach(n,sum);
        System.out.println(functionalApproach(n));
        System.out.println(factorialOfNum(n));
    }
}