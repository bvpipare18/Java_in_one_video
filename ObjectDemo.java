class Calculator {

    int num1;
    int num2;
    double num3;
    int result;

    // Default Constructor
    public Calculator() {
        num1 = 5;
        num2 = 7;
        System.out.println("in default constructor");
    }

    // Constructor with 1 parameter
    public Calculator(int n) {
        System.out.println("Constructor with 1 parameter");
        num1 = n;
        num2 = n;
    }

    // Constructor with 1 parameter
    public Calculator(double j) {
        System.out.println("Constructor with 1 parameter type double");
        num1 = (int) j;
        num2 = (int) j;
        num3 = j;
    }

    // Constructor with 2 parameter
    public Calculator(int n, float f) {
        System.out.println("Constructor with 2 parameter");

        num1 = n;
        num2 = (int) f;
    }

    // Constructor with 3 parameter
    public Calculator(int n, float f, double k) {
        System.out.println("Constructor with 3 parameter");

        num1 = n;
        num2 = (int) f;
        num3 = k;
    }

    public void perform() {
        System.out.println("in perform method");
        result = num1 + num2;
    }
}

public class ObjectDemo {
    public static void main(String[] args) {

        Calculator obj = new Calculator();// returns object of Type Calculator
        System.out.println(obj.num1);
        System.out.println(obj.num2);

        Calculator obj1 = new Calculator(7);
        System.out.println(obj1.num1);
        System.out.println(obj1.num2);

        Calculator obj2 = new Calculator(7.5);
        System.out.println(obj2.num1);
        System.out.println(obj2.num2);
        System.out.println(obj2.num3);

        Calculator obj3 = new Calculator(7, 5.5f);
        System.out.println(obj3.num1);
        System.out.println(obj3.num2);

        Calculator obj4 = new Calculator(7, 5.5f, 7.55);
        System.out.println(obj4.num1);
        System.out.println(obj4.num2);
        System.out.println(obj4.num3);

        obj.perform();
        System.out.println(obj.result);
    }
}
