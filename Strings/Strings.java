
public class Strings {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str1 = "abcd";
        String str2 = new String("xyz");

        //Strings are IMMUTABLE -> its value can't change after creating it
        
        //Scanner sc = new Scanner(System.in);
        //String name;
        //name = sc.next(); //inputed string stored in any structure (only return 1st word)
        //name = sc.nextLine();//store whole line
        //System.out.println(name);
        String fullname = "Tony Stark";
        System.out.println(fullname.length());
        System.out.println(fullname.charAt(0));

        //String concatenation -> do chizo ko jodna
        printLetters(fullname);
    }
}

/*
String str1 = "abc";
String str2 = "abc";
String str3 = str1.intern()
String str4 = new String("abc")

in this str1 = str2 but str1 != str4

if we use intern() - intern() checks the string pool.
If "abc" already exists in the pool → it returns the pooled reference.
If not, it adds it to the pool.
Use case: Save memory when many strings with the same value are created.
 */
