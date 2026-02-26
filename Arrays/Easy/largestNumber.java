public class largestNumber {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity chote se chota number
        int smallest = Integer.MAX_VALUE;// + infinity bade se bada number assume 100

        for(int i=0;i<numbers.length;i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is: "+smallest);
        return largest;
    }

    public static void main(String args[]){
        int numbers[] = {1,3,0,2,9,16};
        int large = getLargest(numbers);

        System.out.println("Largest number is: "+ large);
    }
}