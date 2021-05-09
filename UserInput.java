import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class UserInput {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Enter a number ");

//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         int n = Integer.parseInt(br.readLine());
//         System.out.println(n);
//     }
// }
public class UserInput {
    public static void main(String[] args) throws Exception {
        int n = 0;
        System.out.println("Enter a number ");

        BufferedReader br = null;
        // creating resources
        try {
            br = new BufferedReader(new InputStreamReader(System.in));

            n = Integer.parseInt(br.readLine());
        }
        // handling resources
        catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        // closing resources
        finally {
            /** It will throw the exception */
            br.close();
        }
        System.out.println(n);
    }
}
