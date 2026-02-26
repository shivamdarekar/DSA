//array work on call of reference
//jab koi small function, main function wale array mai koi changes karega
//to wo cahnges bhi main function mai reflect honge.

public class CallByRef{

    public static void updateMarks(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]){
        int marks[] = {97,98,99};
        updateMarks(marks);

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i] + " ");
        }
    }
}