interface Abc {
    void show();
}

public class Interfaces {
    public static void main(String[] args) {
        // Lambda Expression
        Abc obj = () -> System.out.println("New style of Interfaces");
        obj.show();
    }
}
