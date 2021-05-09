public class ExceptionDemo {
    public static void main(String[] args) {
        try {

            int i = 9 / 0;
            System.out.println("Output is : " + i);
            int arr[] = new int[6]; // Array SIZE 6
            arr[6] = 8; // Index 6 is not available
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("The Index you want to access not available.");
        } catch (ArithmeticException e) {
            System.err.println("Can not divide by zero");
        }
        // catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
        // System.err.println("Error");
        // }
        catch (Exception e) {
            System.out.println(
                    "I am parent of whole exceptions and it will execute automatically at the end if all other exceptions fails");
        } finally {
            System.out.println("I will execute always despite of error occurs or not");
        }

    }
}
