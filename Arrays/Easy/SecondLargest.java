public class SecondLargest{

    public static int secondLarge(int num[]){
        int largest = num[0];
        int slargest = Integer.MIN_VALUE;

        for(int i=1;i<num.length;i++){
            if(num[i] > largest){
                slargest = largest;
                largest = num[i];
            }
            else if(num[i] < largest && num[i] > slargest){
                slargest = num[i];
            }
        }
        return slargest;
    }

    public static int secondSmallest(int num[]){
        int smallest = num[0];
        int sSmall = Integer.MAX_VALUE;
        
        for(int i=0;i<num.length;i++){
            if(num[i] < smallest){
                sSmall = smallest;
                smallest = num[i];
            }
            else if(num[i] != smallest && num[i] < sSmall){
                sSmall = num[i];
            }
        }
        return sSmall;
    }

    public static void main(String args[]){
        int num[] = {3,4,6,6,1,5,2,-1,-2};
        System.out.println(secondLarge(num));
        System.out.println(secondSmallest(num));
    }
}