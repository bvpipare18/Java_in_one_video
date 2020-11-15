class Calculator {
    // Blueprint

    // Variables
    int num1;
    int num2;
    int result;

    // Method
    public void perform() {
        result = num1 + num2;
    }
}

public class ObjectDemo {
    public static void main(String[] args) {
        // Object of class Calculator

        // Real instinct
        Calculator obj = new Calculator();// returns object of Type Calculator

        // Calculator - DataType
        // obj - Reference variable
        // new Calculator() - Object
        // Calculator() - Constructor
        obj.num1 = 5;
        obj.num2 = 15;

        // System.out.println(obj.result);
        // 👆👆these above line will print value 0 bcoz of garbage collection

        obj.perform();
        System.out.println(obj.result);
    }
}
