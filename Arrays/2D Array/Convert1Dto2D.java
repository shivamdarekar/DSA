public class Convert1Dto2D{

    public static int[][] brut(int[] arr, int m, int n){
        if(m*n != arr.length) return new int[][]{};

        int[][] ans = new int[m][n];
        int idx = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j] = arr[idx];
                idx++;
            }
        }
        return ans;
    }// TC = O(m*n)

    public static int[][] optimal(int[] arr, int m, int n){
        if(m*n != arr.length) return new int[][]{};
        int ans[][] = new int[m][n];

        for(int i=0;i<m*n;i++){
            ans[i/n][i%n] = arr[i];
        }
        return ans;
    }//O(n)

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int m = 3, n = 2;
        int[][] ans = optimal(arr, m, n);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
    }
}
}
