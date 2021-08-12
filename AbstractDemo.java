//Case 1
// class Human {
//     public void eat() {

//     }

//     public void walk() {

//     }
// }

//Case 2
// abstract class Human {
//     public void eat() {

//     }

//     public void walk() {

//     }
// }

// Case 3
// abstract class Human {
//     Declaration --> We must use abstract keyword it's compulsory
//     public abstract void eat();

//     Definition
//     public void walk() {

//     }
// }

//Case 4
// abstract class Human {

//     public abstract void eat();

//     public void walk() {

//     }
// }

// class Man extends Human { // Concrete class
//     public void eat() {

//     }
// }
//Why do we need a abstarct Classes?

// Case 5
// class Printer {
//     public void show(Integer i) {
//         System.out.println(i);
//     }

//     public void show(Double i) {
//         System.out.println(i);
//     }
// }

//Case 6 --> Integer & Double Classes extends Number abstract class
class Printer {
    public void show(Number i) {
        System.out.println(i);
    }

}

public class AbstractDemo {
    public static void main(String[] args) {
        // Case 1
        // Human object = new Human();

        // Case 2 --> NOT valid in case 2
        // Human object = new Human();

        // Case 3 --> NOT valid in case 3
        // Human object = new Human();

        // Case 4 --> VALID
        // Human object = new Man();
        // Man object1 = new Man();

        // Case 5
        // Printer obj = new Printer();
        // obj.show(5);
        // obj.show(5.5);

        // Case 6 --> To solve above Case 5 Problem
        Printer obj = new Printer();
        obj.show(5);
        obj.show(5.5);

    }
}
