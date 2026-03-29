import java.util.*;
public class GroupAnagrams{

    public static List<List<String>> groupAnagrams(String strs[]){
        Map<String, List<String>>mpp = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String s = strs[i];

            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            // if key not present, create new list
            if(!mpp.containsKey(key)){
                mpp.put(key, new ArrayList<>());
            }

            // add original string
            mpp.get(key).add(s);
        }

        List<List<String>>result = new ArrayList<>();
        for(List<String> group : mpp.values()){
            result.add(group);
        }
        return result;
    }

    public static void main(String args[]){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        //Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

        System.out.println(groupAnagrams(strs));
    }
}