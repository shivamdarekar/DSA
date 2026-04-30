//rotate a matrix by 90 degree clockwise
public class RotateBy90Degree{

    public static int[][] brut(int[][] arr){
        int m = arr.length;
        int n = arr[0].length; 
        int[][] ans = new int[m][n]; 

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[j][n-i-1] = arr[i][j];
            }
        }        
        return ans;   
    } //TC = (n*m) | Sc = (n*m)


    //to reduce extra space we optimize our approach
    //first find transpose of matrix then reverse all the rows
    public static void Optimal(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;

        //swap both ends, diagonal elements stays at same loaction
        for(int i=0;i<m-1;i++){
            for(int j=i+1;j<n;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //reverse row elements
        for(int i=0;i<n;i++){
            int start = 0, end = n-1;

            while(start < end){
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];   
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
    }//TC - O(n*m) | SC - O(1)

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3}, 
                {4, 5, 6},
                {7, 8, 9}
            };

        Optimal(arr);
        for(int[] row: arr){
            for(int column: row){
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }
}