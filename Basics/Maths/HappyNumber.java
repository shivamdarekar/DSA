/*
Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
 */
//if n == 1 at the it is a happy number return true

import java.util.*;
public class HappyNumber{

    public static boolean isHappyNum(int n){
        Set<Integer>st = new HashSet<>();

        while(n!=1 && !st.contains(n)){
            st.add(n);
            n = squareSum(n);
        }
        return n==1;
    }

    public static int squareSum(int n){
        int sum = 0;

        while(n > 0){
            int lastdigit = n % 10;
            sum = sum + lastdigit * lastdigit;
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 20;
        System.out.print(isHappyNum(num));
    }
}