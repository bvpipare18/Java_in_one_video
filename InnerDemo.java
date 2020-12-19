
class Outer {
    int a; // member variable

    // member method
    public void show() {
        System.out.println("in show");
    }

    // memeber class
    class Inner {
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

        // INVALID IN CASE OF ABOVE CONDITION
        // inner_class_name obj_of_inner_class = new inner_class_name();

        // In order to call the method present inside a nested class,
        // we use below syntax
        // RIGHT
        // outer_class_name.inner_class_name new_object_name = object_of_outer_class.new
        // inner_class_name();
        Outer.Inner obj1 = obj.new Inner();
        obj1.display();
    }

}
