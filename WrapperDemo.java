//int, float, double
//Integer

public class WrapperDemo {
    public static void main(String[] args) {
        // Case 1
        // int i = 5; // Primitive Datatype
        // Integer ii = new Integer(i);// Boxing - Wrapping

        // int j = ii.intValue(); // Unboxing - Unwrapping

        // Integer value = i;// Autoboxing
        // int k = value; // Autounboxing

        // Case 2 --> You can't do these
        // String str = "123";
        // int i = str

        // Case 3 --> To solve Case 2 problem
        String str = "123";
        int i = Integer.parseInt(str);
        System.out.println(i);
    }
}
