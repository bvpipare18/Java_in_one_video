public class SelectionDemo {
    public static void main(String[] args) {
        int n = 7;
        if (n == 0) {
            System.out.println("Nothing");
        } else {
            if (n % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}
