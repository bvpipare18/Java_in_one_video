public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            double i = (double) 9 / 0;
            System.out.println("Output is : " + i);

        } catch (ArithmeticException e) {
            // : handle exception
            System.err.println("Error occured");
            System.out.println("You can divide a number zero");
        } finally {
            System.out.println("I will execute always despite of error occurs or not");
        }

    }
}
