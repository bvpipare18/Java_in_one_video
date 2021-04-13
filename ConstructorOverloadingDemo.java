class Casio {

    int num1;
    int num2;
    String operation;

    public Casio() { // Default Constructor
        num1 = 0;
        num2 = 0;
        operation = "Nothing";
        System.out.println("Default Constructor");
    }

    public Casio(int i) { // Constructor with 1 parameter
        num1 = 5;
        num2 = 0;
        operation = "Nothing";
        System.out.println("Constructor with 1 parameter");
    }

    public Casio(int i, int j) { // Constructor with 2 parameter
        num1 = 0;
        num2 = 0;
        operation = "Nothing";
    }

    public Casio(int i, int j, String op) { // Constructor with 3 parameter
        num1 = 0;
        num2 = 0;
        operation = op;
    }

}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        // Casio obj = new Casio();
        Casio obj1 = new Casio(4);
        System.out.println(obj1.num1);
        System.out.println(obj1.operation);
        // Casio obj2 = new Casio(4,5);
        // Casio obj3 = new Casio(4, 5, "Overloading");
        // System.out.println(obj3.operation);
    }
}
