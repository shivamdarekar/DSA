//array => list of element of same type place in contiguous memory location.
//array ki size static hai runtime pe size change nahi hoti.

import java.util.*;
public class Array {
    public static void main(String args[]){
        
        //creation of array
        int marks[] = new int[50];
        //int numbers[] = {1,2,3};

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Phy: "+ marks[0]);
        System.out.println("chem: "+ marks[1]);
        System.out.println("maths: "+ marks[2]);

        //update
        marks[2] = marks[2]+1;
        System.out.println("maths:" + marks[2]);

        System.out.println("length of array: "+ marks.length);
    }
}