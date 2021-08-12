//Case 1

// class Pen {
//     public void write() {
//         System.out.println("Im a Pen");
//     }
// }

// class Pencil {
//     public void write() {
//         System.out.println("Im a Pencil");
//     }
// }

// class Kit {
//     public void doSomething(Pen p) {
//         p.write();
//     }

//     public void doSomething(Pencil pc) {
//         pc.write();
//     }
// }

//Case 2

// class Writer {
//     /**
//      * It compulsory to have this method in this Parent class which does nothing but
//      * empty.
//      */
//     public void write() {

//     }
// }

// class Pen extends Writer {
//     public void write() {
//         System.out.println("Im a Pen");
//     }
// }

// class Pencil extends Writer {
//     public void write() {
//         System.out.println("Im a Pencil");
//     }
// }

// class Kit {
//     public void doSomething(Writer p) {
//         p.write();
//     }
// }

//Case 3.1

// abstract class Writer {
//     /**
//      * 1.Having the method which does nothing bcoz it does nothing instead we can
//      * declare the method.
//      * 
//      * 2.Because we are declaring the method we must use 'abstract' keyword.
//      * 
//      * 3.Bcoz we are using abstract method we must declare the class as 'abstract'.
//      */
//     public abstract void write(); // declaration
// }

// class Pen extends Writer {
//     public void write() {
//         System.out.println("Im a Pen");
//     }
// }

// class Pencil extends Writer {
//     public void write() {
//         System.out.println("Im a Pencil");
//     }
// }

// class Kit {
//     public void doSomething(Writer p) {
//         p.write();
//     }
// }

// Case 3.2

// interface Writer {
//     public abstract void write(); // declaration

//     void show();
// }

/**
 * 1.Let's say in future if Pen wants to extend Writer as well as Another class
 * named 'Abc' since it is not possible Multiple inheritance on java.
 * 
 * 2.But he can extend one class as usual & also he can extend another with the
 * help of Interfaces
 * 
 * 3.Pen class can implement 'n' number of classes.
 * 
 * 4.When you create & declare any method inside a interface it is assumed to be
 * 'public abstract'.
 * 
 * 5.We can't define any method inside a inteerface.
 * 
 */
// class Pen extends Abc implements Writer {
// public void write() {
// System.out.println("Im a Pen");
// }
// }

// class Pencil implements Writer {
// public void write() {
// System.out.println("Im a Pencil");
// }
// }

// class Kit {
// public void doSomething(Writer p) {
// p.write();
// }
// }

// Why do we need Interfaces?
interface A {
    void show();
}

class B implements A {
    public void show() {
        System.out.print("I am Show Method");
    }

    /**
     * 1.You can have a method which is not in Interface class
     * 
     * 2.Below written method is not valid bcoz it is not declared in interface
     * class.
     * 
     */
    // public void kuchbhi() {
    // System.out.print("Aise hi");
    // }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        // Case 1
        // Kit obj = new Kit();

        // Pen p = new Pen();
        // obj.doSomething(p);

        // Pencil pc = new Pencil();
        /**
         * 1. As we can see the code in Case 1 In order to pass Pencil's object we have
         * created another doSomething() Method whch takes 'pc' as a argument.
         * 
         * 2. Why we should write same method but takes different parameters?
         * 
         * The answer to this question is in Case 2.
         */
        // obj.doSomething(pc);

        // Case 2

        // Kit obj = new Kit();

        // Writer p = new Pen();
        // /** It Will call write() method of pen */
        // obj.doSomething(p);

        // Writer pc = new Pencil();
        // /** It Will call write() method of pencil */
        // obj.doSomething(pc);

        // Case 3.1
        // Kit obj = new Kit();

        // Writer p = new Pen();
        // /** It Will call write() method of pen */
        // obj.doSomething(p);

        // Writer pc = new Pencil();
        // /** It Will call write() method of pencil */
        // obj.doSomething(pc);

        // Case 3.2
        // Kit obj = new Kit();

        // Writer p = new Pen();
        // /** It Will call write() method of pen */
        // obj.doSomething(p);

        // Writer pc = new Pencil();
        // /** It Will call write() method of pencil */
        // obj.doSomething(pc);

        /** Object of interface cannot be created */
        // Writer obj = new Writer(); // NOT VALID

        // Case 4
        A obj = new B();
        obj.show();
        // obj.kuchbhi();
    }
}
