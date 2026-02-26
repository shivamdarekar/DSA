/*
str.compareTo => A != a 
0: equal
<0: -ve str1 < str2
>0: +ve str1 > str2
*/

//str.compareToIgnore => A == a

public class LargestString{
    public static void main(String args[]) {
        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits[0];
        for(int i=0; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }

        System.out.println(largest);
    }
}

//time complexity => O(x * n)
//x -> length of string
//n -> total no. of strings in array