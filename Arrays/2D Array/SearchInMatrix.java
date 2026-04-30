public class SearchInMatrix{

    public static boolean brut(int[][] arr, int tar){
        int m = arr.length;
        int n = arr[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] == tar) return true;
            }
        }
        return false;
    }//O(m*n)


    public static boolean better(int[][] arr, int tar){
        int m = arr.length;
        int n = arr[0].length;

        for(int i=0;i<m;i++){
            if(arr[i][0] <= tar && arr[i][n-1] >= tar){
                return binarySearch(arr[i],tar);
            }
        }
        return false;
    }//O(n × log m)

    public static boolean binarySearch(int[] arr, int tar){
        int start = 0, end = arr.length-1;

        while(start<=end){
            int mid = (start+end) / 2;

            if(arr[mid] == tar) return true;
            else if(arr[mid] > tar) end = mid - 1;
            else start = mid + 1;
        }
        return false;
    }


    public static boolean optimal(int[][] arr, int tar){
        int m = arr.length;
        int n = arr[0].length;

        int i=0, j=n-1;

        while(i<m && j>=0){
            if(arr[i][j] == tar) return true;
            else if(arr[i][j] > tar) j--;
            else i++;
        }
        return false;
    }//

    public static void main(String[] args) {
         int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        int target = 10;

        System.out.print(better(matrix, target));
    }
}