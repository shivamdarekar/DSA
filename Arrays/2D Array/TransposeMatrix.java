public class TransposeMatrix{

    public static int[][] transpose(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;

        int[][] ans = new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[j][i] = arr[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int[][] ans = transpose(arr);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}