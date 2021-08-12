//Case 1

// class A {
//     public void show() {
//         System.out.println("in A");
//     }
// }

// class B extends A {
//     public void show() {
//         System.out.println("in B");
//     }
// }

// class C extends A {
//     public void show() {
//         System.out.println("in C");
//     }
// }

//Case 2

class A {
    public void show() {
        System.out.println("in A");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B");
    }

    public void second_method() {
        System.out.println("in Second Method");
    }
}

class C extends A {
    public void show() {
        System.out.println("in C");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        // Case 1
        /** These will be linked at runtime polymorphism */
        A obj1 = new B();// runtime polymorphism OUTPUT - in B
        obj1.show();

        obj1 = new C();
        obj1.show();// Dynamic Method Dispatch
        // Case 2
        // A obj = new B();
        // obj.second_method();
        /** You can not do above scenario */
    }
}
