// Method 1
// interface Abc {
// void show();
// }

// public class Interfaces {
// public static void main(String[] args) {
// Lambda Expression
// Abc obj = () -> System.out.println("New style of Interfaces");
// obj.show();
// }
// }

//Method 2
interface Demo {
    void abc(); // Method Declaration

    // Not Valid
    // public void show() {

    // }

    // VALID
    default void show() { // using default method
        System.out.println("In Interfaces show method");
    }
}

/**
 * We can not create a object of a interface of that why we will create sub
 * class for it.
 */

class A implements Demo {
    public void abc() { // Method Definition
        System.out.println("In 'abc' method");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Demo obj = new A();
        obj.abc();
        obj.show();
    }
}