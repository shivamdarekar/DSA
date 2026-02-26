public class ConvertToUppercase{

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        int i = 0;
        // Handling leading spaces
        while(str.charAt(i) == ' ' && i < str.length()){
            sb.append(str.charAt(i));
            i++;
        }

        if(i < str.length()){
            sb.append(Character.toUpperCase(str.charAt(i)));
            i++;
        }

        for(; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "hi, my name is shivam ";
        System.out.println(toUpperCase(str));
    }
}

//time complexity => O(n)