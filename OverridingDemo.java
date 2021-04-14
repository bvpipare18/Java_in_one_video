// Case 1 --> Output - in
// class A {
//     public void show() {
//         System.out.println("in A");
//     }
// }

// class B extends A {

// }

//Case 2 --> Output - in A
// class A {
//     public void show() {
//         System.out.println("in A");
//     }
// }

// class B extends A {
//     public void show1() {
//         System.out.println("in B");
//     }
// }

// Case 3 --> OutPut - in B -----> METHOD OVERRIDING
class A {
    public void show() {
        System.out.println("in A");
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("in B");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        // Case 1
        // B obj = new B();
        // obj.show();

        // Case 2
        B obj1 = new B();
        obj1.show();
    }
}
