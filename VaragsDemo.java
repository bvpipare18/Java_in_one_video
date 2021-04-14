// class Calculator {
// public int add(int i, int j) {
// return i + j;
// }
// }

// public class VaragsDemo {
// public static void main(String[] args) {
// Calculator obj = new Calculator();
// System.out.println(obj.add(4, 5));
// }
// }

// Above code will work fine with 2 arguments

// class Calculator {
// public int add(int i, int j, int k) {
// return i + j + k;
// }
// }

// public class VaragsDemo {
// public static void main(String[] args) {
// Calculator obj = new Calculator();
// System.out.println(obj.add(4, 5, 6));
// }
// }

// Above code will work fine with 3 arguments

// Let us supose you dont want your number of arguments to be specific and your
// variably passing
// n arguments and that n could be of any number.
// we can pass any number of arguments once you use this Concept Varags.

class Calculator {
    public int add(int... n) { // 4,5,6,7,8,9 - it will come as a array
        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        return sum;
    }
}

public class VaragsDemo {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(4, 5, 6, 7, 8, 9));
        System.out.println(obj.add(4, 5, 6, 7, 8, 5949));
        System.out.println(obj.add(4, 5, 6, 7, 8, 9, 10, 11, 12));
    }
}