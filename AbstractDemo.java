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
abstract class Human {

    public abstract void eat();

    public void walk() {

    }
}

class Man extends Human { // Concrete class
    public void eat() {

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
        Human object = new Man();
        Man object1 = new Man();
    }
}
