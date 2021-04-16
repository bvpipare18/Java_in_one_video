//Final Keyword
//Case 1 -- 'final' keyword with Variable

// class A {
//     final int DAY = 19; // It becomes constant now

//     public A() { // Constructor
//         System.out.println(DAY);
//     }
// }

// Case 1.1

// class A {
//     final int DAY; 

//     public A() { // Constructor
//         DAY = 10; //1st Assignment is VALID
// DAY = 26; //2nd Assignment is NOT VALID since it is Constant
//     }
// }

//Case 2 -- 'final' keyword with method

/** Once you make a method as final then you can't override that method */
// class A {
//     public final void show() {
//         System.out.println("in A");
//     }
// }

// class B extends A {
// Below👇👇 code is NOT valid bcoz the method is final
// public void show() {
// System.out.println("in B");
// }
// }

// Case 3 -- 'final' keyword with Classes

/** Once you make a class as final then you can't inherit/extend that class */
// final class A {
// public final void show() {
// System.out.println("in A");
// }
// }

// INVALID in these context
// class B extends A {

// }

public class FinalDemo {
    public static void main(String[] args) {
        // Case 1
        // A = new A();

        // Case 2
        // B obj = new B();
        // A obj = new B();
        //
        // Case 1
        // A obj = new A();
        // obj.show();

    }
}
