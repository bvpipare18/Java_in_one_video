class Calculator {

    int num1;// instance scope
    int num2;// instance scope

    // public Calculator(int num1, int num2) {
    // num1 = num1;
    // num2 = num2;
    // }

    // To solve 👆👆 above problem
    // We use 'this' keyword
    public Calculator(int num1, int num2) {
        this.num1 = num1; // current object
        this.num2 = num2; //
    }

    // public Calculator(int number1, int number2) {
    // // number1, number2 are local scopes
    // num1 = number1;
    // num2 = number2;
    // }

}

public class ObjectDemo {
    public static void main(String[] args) {

        Calculator obj = new Calculator(4, 8);// returns object of Type Calculator
        System.out.println(obj.num1);
        System.out.println(obj.num2);

    }
}
