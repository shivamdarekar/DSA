//num occurence is different -> true otherwise false

public class Occurence{

 public static int countOccurence(int num[]){
    int count = 0;
    for(int i=0;i<num.length; i++){
        for(int j=0;j<num.length;j++){
            if(num[i] == num[j]){
                count++;
            }
        }
    }
    return count;
 }

    public static void main(String args[]){
        int num[] = {1,2,1,4,2,1};
        System.out.print(countOccurence(num));
    }
}