//2D array -> array of arrays
public class Basics{
    public static void main(String args[]){

        int[][] arr = new int[3][4]; //[row][column]
        int[][] arr2 = {{1,2,3,5}, {4,5,6,8}, {7,8,9,2}};

        // for(int i=0;i<3;i++){
        //     for(int j=0;j<4;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        int sum = 0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                sum = sum + arr2[i][j];
            }
        }
        System.out.print(sum);
    }
}