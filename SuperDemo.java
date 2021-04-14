
class A {
    public A() {
        System.out.println("in A constructor");
    }

    public A(int i) {
        System.out.println("in int A constructor");
    }
}

// class B extends A {
// public B() {
// System.out.println("in B constructor");
// }

// public B(int i) {
// System.out.println("in int B constructor");
// }
// }

// class B extends A {
// public B() {
// super(i);
// System.out.println("in B constructor");
// }

// public B(int i) {
// super(i);
// System.out.println("in int B constructor");
// }
// }

class B extends A {
    public B() {
        super(5);
        System.out.println("in B constructor");
    }

    public B(int i) {
        super(i);
        System.out.println("in int B constructor");
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        // A obj = new A(); --> Output - in A constructor

        // B obj = new B(); // Output - in A constructor
        // in B Constructor

        // A obj = new A(5); // Output - in int A constructor

        // B obj = new B(5);
        // Output
        // in A constructor
        // in int B constructor

        // To solve 👆👆 problem
        // we must write super(i) method in paramaterized constructor

        // B obj = new B(5);
        // Output
        // in int A constructor
        // in int B constructor

        B obj = new B();
        // Output
        // in int A constructor
        // in B constructor
    }
}
