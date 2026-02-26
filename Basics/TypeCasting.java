public class TypeCasting {
    public static void main(String args[]){
        float a = 25.9999f;
        // int b = a; lossy conversion
        int b = (int) a;
        System.out.println(b);
    }
}

// type conversion - implicit conversion
// type casting - explicit conversion 

// - type conversion order
// byte -> short -> int -> float -> double -> long
// agar ulta coversion karenge to loosy conversion hoga (data loss hoga).

// - type casting = jabardasti type conversion karna
