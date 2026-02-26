//check one string is rotation of another
//two strings given str and goal return true if str become goal after perform some rotations

public class StringRotation{

    public static boolean Brut(String str, String goal){
        if(str.length() != goal.length()) return false;

        for(int i=0;i<str.length();i++){
          String rotated = str.substring(i) + str.substring(0, i);
          if(rotated.equals(goal)){
            return true;
          }
        }
        return false;
    }
    //s.substring(i) → index i se end tak
    //s.substring(0, i) → index 0 se i-1 tak
    //Tc - O(n^2) | Sc - O(n)


    public static boolean Optimal(String str, String goal){
        if(str.length() != goal.length()) return false;

        String concate = str + str;
        return concate.contains(goal);

        //rotation + rotation = rotationrotation
    }
    //Tc - O(n) | Sc - O(n)

    public static void main(String[] args) {
        String str = "rotation";
        String goal = "tionrota";
        System.out.print(Optimal(str, goal));
    }
}