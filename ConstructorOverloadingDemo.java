class Casio {

    int num1;
    int num2;
    String operation;

    public Casio() {
        num1 = 0;
        num2 = 0;
        operation = "Nothing";
    }

    public Casio(int i) {
        num1 = 0;
        num2 = 0;
        operation = "Nothing";
    }

    public Casio(int i, int j) {
        num1 = 0;
        num2 = 0;
        operation = "Nothing";
    }

    public Casio(int i, int j, String op) {
        num1 = 0;
        num2 = 0;
        operation = op;
    }

}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Casio obj = new Casio();
        System.out.println(obj.num1);
        System.out.println(obj.operation);
        // Casio obj1 = new Casio(4);
        // Casio obj2 = new Casio(4,5);
        // Casio obj3 = new Casio(4, 5, "Overloading");
        // System.out.println(obj3.operation);
    }
}
