public class isSorted{

    public static boolean checkIsSorted(int num[]){
        for(int i=1;i<num.length;i++){
            if(num[i-1] <= num[i]){}
            else return false;
        }
        return true;
    }

    public static void main(String args[]){
        int num[] = {1,1,2,3,4,4,8,5,6};
        System.out.println(checkIsSorted(num));
    }
}