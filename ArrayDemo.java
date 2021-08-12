
public class ArrayDemo {
    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4, 5, 6 };
        for (int i : a) {
            System.out.println(i);
        }

        int d[][] = { { 1, 2, 3, 4, 5 }, { 2, 4, 6, 8 }, { 5, 6, 7, 8, 9, 10 } };
        // for (int i = 0; i < d.length; i++) {
        // for (int j = 0; j < d[i].length; j++) {
        // System.out.print(" " + d[i][j]);
        // }
        // System.out.println();
        // }

        for (int k[] : d) {
            for (int l : k) {
                System.out.print(" " + l);
            }
            System.out.println();
        }
    }
}
