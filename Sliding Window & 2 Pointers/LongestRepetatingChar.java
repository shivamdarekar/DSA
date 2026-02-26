//longest repetating character replacement(replace k char with any char)
//return the length of the longest substring that contains the same letter

public class LongestRepetatingChar{

    public static int optimal(String str, int k){
        int[] freq = new int[26];
        int maxLen = 0;
        int maxFreq = 0;
        int left = 0;

        for(int right = 0; right < str.length(); right++){
            int idx = str.charAt(right) - 'A';
            freq[idx]++;

            maxFreq = Math.max(maxFreq, freq[idx]);

            while((right - left + 1) - maxFreq > k){
                freq[str.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }// TC = O(n) | SC = O(1) or O(26) fixed size
    //also in this que we dont recalculating maxfreq we reusing it ao no wrong ans just save extra time

    public static void main(String[] args) {
        String str = "BAABAABBBAAA";
        int k = 2;
        System.out.println(optimal(str, k));
    }
}