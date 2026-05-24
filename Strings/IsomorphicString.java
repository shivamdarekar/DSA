//Given two strings s and t, check if characters in s can be consistently mapped to characters in t.
//One to One mapping

public class IsomorphicString{

    public static boolean checkIsomorphic(String s, String t){
        int[] mpp1 = new int[256];
        int[] mpp2 = new int[256];

        if(s.length() != t.length()) return false;

        for(int i=0;i<s.length();i++){
            if(mpp1[s.charAt(i)] != mpp2[t.charAt(i)]) return false;

            mpp1[s.charAt(i)] = i+1;
            mpp2[t.charAt(i)] = i+1;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t =  "add";
    }
}