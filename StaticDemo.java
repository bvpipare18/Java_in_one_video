class Emp {
    int emp_id;
    int salary;
    // String ceo;
    static String ceo;

    static { // Execute ---> when you load a class file
        ceo = "Larry";
    }

    public Emp() { // Execute ---> When you create an object
        emp_id = 1;
        salary = 3000;
    }

    public void show() {
        System.out.println(emp_id + "   :   " + salary + "  :   " + ceo);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        // Emp basu = new Emp();
        // basu.emp_id = 8;
        // basu.salary = 4000;
        // basu.ceo = "Bill";

        // Emp balu = new Emp();
        // balu.emp_id = 9;
        // balu.salary = 5000;
        // balu.ceo = "Bill";

        // balu.ceo = "Jef";

        // Emp basu = new Emp();
        // basu.emp_id = 8;
        // basu.salary = 4000;
        // Emp.ceo = "Bill";

        // Emp balu = new Emp();
        // balu.emp_id = 9;
        // balu.salary = 5000;
        // Emp.ceo = "Bill";

        // Emp.ceo = "Jef";

        // basu.emp_id = 8;
        // basu.salary = 4000;
        // basu.ceo = "Bill";
        Emp basu = new Emp();
        Emp balu = new Emp();

        System.out.println("ID  :   Salary  :   Ceo");
        basu.show();
        balu.show();
    }
}
