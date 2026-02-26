

public class SetMAtrixZero{

    public static void Better(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;

        boolean[] row = new boolean[m];
        boolean[] column = new boolean[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] == 0){
                    row[i] = true;
                    column[i] = true;
                }
            }
        }

        //2nd pass to set zero at place of true
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i] || column[j]){
                    arr[i][j] = 0;
                }
            }
        }
    }
    //Tc -> O(m*n) || Sc -> O(m+n)

    public static void Optimal(int[][] arr){
        int m = arr.length; //row
        int n = arr[0].length; //column

        boolean isFirstRowZero = false;
        boolean isFirstColumnZero = false;

        //true if in first row any zero becoz if 1 zero found then all row become zero at last
        for(int i=0;i<n;i++){
            if(arr[0][i] == 0){
                isFirstRowZero = true;
            }
        }

        for(int i=0;i<m;i++){
            if(arr[i][0] == 0){
                isFirstColumnZero = true;
            } 
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(arr[i][j] == 0){
                    arr[0][j] = 0;
                    arr[i][0] = 0;
                }
            }
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(arr[0][j] == 0 || arr[i][0] == 0){
                    arr[i][j] = 0;
                }
            }
        }

        if(isFirstRowZero){
            for(int i=0;i<n;i++){
                arr[0][i] = 0;
            }
        }

        if(isFirstColumnZero){
            for(int i=0;i<m;i++){
                arr[i][0] = 0;
            }
        }

    }

    public static void main(String[] args) {
        int arr[][] = {{1,8,1,8},{1,0,1,1},{1,0,1,4}};

        Optimal(arr);


        for(int[] row: arr){
            for(int column: row){
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }
}