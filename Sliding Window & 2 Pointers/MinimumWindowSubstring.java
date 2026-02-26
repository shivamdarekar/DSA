public class MinimumWindowSubstring{

    public static String Optimal(String str, String t){
        int n = str.length();
        int m = t.length();
        int[] hash = new int[256];
        int minLength = Integer.MAX_VALUE;
        int startIdx = -1;
        int cnt = 0;
        int left = 0;

        for(int i=0;i<m;i++){
            hash[t.charAt(i)]++;
        }

        for(int right = 0; right<n; right++){
            char ch = str.charAt(right);
            if(hash[ch] > 0) cnt++;
            hash[ch]--;

            while(cnt == m){
                if(right - left+1 < minLength){ 
                    minLength = right-left+1;
                    startIdx = left;
                }

                hash[str.charAt(left)]++;
                if(hash[str.charAt(left)] > 0) cnt--;
                left++;
            }
        }
        return (startIdx == -1) ? "" : str.substring(startIdx, startIdx+minLength);
    }

    public static void main(String[] args) {
        String str = "ACODEBANC";
        String t = "ABC";
        System.out.println(Optimal(str, t));
    }
}