public class MaximumProductSubarray{

public static int Brut(int[] arr){
    int n = arr.length;
    int maxProduct = Integer.MIN_VALUE;

    for(int i=0;i<n;i++){
        int product = 1;
        for(int j=i;j<n;j++){
            product = product * arr[j];
        } 

        maxProduct = Math.max(maxProduct, product);
    }
    return maxProduct;
}//O(n^2)

public static int Optimal(int[] arr){
    int n = arr.length;
    int maxProduct = Integer.MIN_VALUE;
    int prefix = 1;
    int suffix = 1;

    for(int i=0;i<n;i++){
        if(prefix == 0) prefix = 1;
        if(suffix == 0) suffix = 1;

        prefix = prefix * arr[i];
        suffix = suffix * arr[n-1-i];

        maxProduct = Math.max(maxProduct, Math.max(prefix,suffix));
    }
    return maxProduct;
}//O(n)

    public static void main(String[] args) {
        int[] arr = {1,2,-3,0,-4,-5};
        System.out.println(Optimal(arr));
    }
}