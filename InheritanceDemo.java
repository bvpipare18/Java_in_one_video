/**
 * 
 * 1. Calculator & CalcAdv, CalcAdv & CalcVeryAdv --> Single Level Inheritance
 * 2. Calculator & CalcAdv & CalcVeryAdv --> Multi Level Inheritance
 */

class Calculator { // Super,Parent,Base
    public int add(int i, int j) {
        return i + j;
    }
}

class CalcAdv extends Calculator { // Sub, Child, Derrived
    public int sub(int i, int j) {
        return i - j;
    }
}

class CalcVeryAdv extends CalcAdv {
    public int multi(int i, int j) {
        return i * j;
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Calculator calc = new Calculator();
        // CalcAdv calc = new CalcAdv();
        CalcVeryAdv calc = new CalcVeryAdv();
        int result1 = calc.add(4, 5);
        int result2 = calc.sub(6, 3);
        int result3 = calc.multi(6, 3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
