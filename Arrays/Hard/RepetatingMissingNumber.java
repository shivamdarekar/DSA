//find repetating and missing number in given array

class RepetatingMissingNumber{

    public static int[] Brut(int[] arr){
        int n = arr.length;
        int repetating = -1;
        int missing = -1;
        
        for(int i=1;i<=n;i++){
            int cnt = 0;
            for(int j=0;j<n;j++){
                if(i == arr[j]) cnt++;
            }

            if(cnt == 2) repetating = i;
            if(cnt == 0) missing = i;

            //stop early if both found
            if(repetating != -1 && missing != -1) break;
        }

        return new int[]{repetating, missing};
    }
    //TC = O(n^2) | SC = O(1)

    public static int[] Better(int[] arr){
        int n = arr.length;
        int[] hash = new int[n+1];

        //update freq of number in hash array
        for(int i=0;i<n;i++){
            hash[arr[i]]++; 
        }

        int missing = -1;
        int repetating = -1;

        for(int i=1;i<=n;i++){
            if(hash[i] == 2) repetating = i;
            else if(hash[i] == 0) missing = i;

            //exit early if both are found
            if(missing != -1 && repetating != -1){
                break;
            }
        }
        return new int[]{repetating, missing};
    }
    //TC = O(2n) | SC = O(n)

	public static void main(String args[]){
        int arr[] = {1,2,3,4,5,2};
        int result[] = Better(arr);
        System.out.println("Repetating Number: " + result[0]);
        System.out.println("Missing Number: " + result[1]);
    }
}