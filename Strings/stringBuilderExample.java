/*
String immutable hoti hai.
Matlab: ek baar ban gayi toh uske value change nahi ho sakti.
Har baar jab aap String ko modify karte ho (concatenate, replace, etc.), toh naya String object banta hai aur purana discard ho jata hai.

StringBuilder mutable hota hai.
Matlab: uski value ko change karne par naya object nahi banta.
Jo ek hi object hai, wahi modify hota hai.

Suppose 1 lakh strings concatenate karni hain:
String use karoge → har step pe naya object banega → bahut slow aur memory heavy.
StringBuilder use karoge → ek hi object repeatedly modify hoga → fast aur efficient.
*/

/*
sb.append("abc");     // add
sb.insert(2,'x');     // insert
sb.delete(1,3);       // delete
sb.reverse();         // reverse
sb.length();          // length
sb.toString();        // convert to String
*/

public class stringBuilderExample{
    public static void main(String args[]) {
      StringBuilder sb = new StringBuilder("");
      for(char ch = 'a'; ch <= 'z'; ch++){
        sb.append(ch);
      }

      System.out.println(sb);
      System.out.println(sb.length());
    }
}