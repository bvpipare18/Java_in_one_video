/**
 * Case 1
 * 
 * 1.We will override the method of Parent class and print the 'I am the best'.
 */
// class A {
//     public void show() {
//         System.out.println("in A show");
//     }
// }

// class B extends A {
//     public void show() {
//         System.out.println("I am the best");
//     }
// }

// public class AnonymousDemo {
//     public static void main(String[] args) {
//         A obj = new B();
//         obj.show();
//     }
// }

/**
 * Case 2
 * 
 * We can print that 'I am the best' without writing class B using Anonymous
 * Inner Class
 */
class A {
    public void show() {
        System.out.println("in A show");
    }
}

public class AnonymousDemo {
    public static void main(String[] args) {
        A obj = new A() { // Anonymous Inner Class
            /**
             * Now the below mentioned method definition can not be used in other classes.
             */
            public void show() {
                System.out.println("I am the best");
            }
        };
        obj.show();
    }
}
