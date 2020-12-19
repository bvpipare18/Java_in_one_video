
class Outer {
    static int a; // static variable

    // static method
    public static void show() {

    }

    // static class
    static class Inner {
        public void display() {
            System.out.println("in display");
        }
    }

}

public class InnerDemo {
    // We can create variables, methods & class
    public static void main(String[] args) {

        // It will create 3 class files after compilling
        // 1. InnerDemo.class
        // 2. Outer.class
        // 3. Outer$inner.class

        Outer obj = new Outer();
        obj.show();

        // To access static class
        Outer.Inner obj1 = new Outer.Inner();
        obj1.display();
    }

}
