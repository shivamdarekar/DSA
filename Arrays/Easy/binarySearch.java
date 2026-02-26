public class binarySearch {

    public static int searching(int numbers[],int key){
        int start = 0, end = numbers.length-1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){ //right
                start = mid + 1;
            } else {  //left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 10;

         System.out.println("index for key is: "+ searching(numbers, key));
    }
}

/*
1st iteration:
start = 0, end = 7 → mid = (0+7)/2 = 3

numbers[3] = 8 < 10 → key is on right → start = mid + 1 = 4

2nd iteration:
start = 4, end = 7 → mid = (4+7)/2 = 5

numbers[5] = 12 > 10 → key is on left → end = mid - 1 = 4

3rd iteration:
start = 4, end = 4 → mid = 4

numbers[4] = 10 == key → ✅ found → return 4
 */