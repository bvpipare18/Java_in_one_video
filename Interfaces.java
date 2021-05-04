// @FunctionalInterface
// interface Demo {
//     void abc();

//     default void show() {
//         System.out.println("In Demo show()");
//     }
// }

// interface MyDemo {
//     default void show() {
//         System.out.println("In MyDemo show()");
//     }
// }

// class Random implements Demo, MyDemo {
//     public void abc() {
//         System.out.println("In abc");
//     }

//     /**
//      * 1. Below method is written to solve problem that arises due presence of same
//      * method in both the Interfaces.
//      * 
//      * 2. It will have confusion to method to call.
//      */
//     @Override
//     public void show() {
//         Demo.super.show();
//     }
// }

// public class Interfaces {

//     public static void main(String[] args) {
//         Demo obj = new Random();
//         obj.abc();
//         obj.show();
//     }
// }

/** Method 2 --> Calling static method of Interface */
interface Demo {
    void abc();

    static void show() {
        System.out.println("We can call static method without creating object");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Demo.show();
    }
}
