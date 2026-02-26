//allocatate the books to m students such that each get atleast one book
//allocate book in a manner such that maximum number of pages is minimum
//return max no. pages in which is min in all possible allocation

public class BookAllocation{

    public static int countStudents(int[] arr, int pages){
        int students = 1;
        int pagesSum = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] + pagesSum <= pages){
                // add pages to current student
                pagesSum = arr[i] + pagesSum;
            } else{
                students++;
                pagesSum = arr[i];
            }
        }
        return students;
    }

    public static int Brut(int[] arr, int m){

        if(m > arr.length) return -1;

        int max = Integer.MIN_VALUE;  //min no. pages each student have so he can take atleast 1 book which is max no. in array
        int sum = 0;
        for(int x:arr){
            max = Math.max(max,x);
            sum = sum + x;
        }

        for(int i=max;i<=sum;i++){
            if(countStudents(arr, i) == m){
                return i;
            }
        }
        return max;
    }

    public static int Optimal(int arr[], int m){
        if(m > arr.length) return -1;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int x:arr) {
            max = Math.max(max,x);
            sum = sum + x;
        }

        int start = max, end = sum;
        while(start<=end){
            int mid = start + (end-start)/2;
            int students = countStudents(arr, mid);

            if(students > m) start = mid+1;
            else end = mid - 1;
        }
        return start;
    }

    public static void main(String args[]){
        int[] arr = {25, 46, 28, 49, 24}; //no. pages in a book
        int m = 4; //no. of students

        System.out.print(Optimal(arr, m));
    }
}