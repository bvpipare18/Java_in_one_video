
public class ArrayDemo {
    public static void main(String[] args) {

        int d[][] = { { 1, 2, 3, 4 }, { 2, 4, 6, 8 }, { 5, 6, 7, 8 } };// 2D array same no. of elements in row

        System.out.println(d[0][2]);// 0 zero column 2

        for (int i = 0; i < d.length; i++) {// row
            for (int j = 0; j < d[i].length; j++) {// column

                // These will print on single line
                // System.out.println(" "+d[i][j]);

                System.out.print(" " + d[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        int a[][] = { { 1, 2, 3, 4, 5 }, { 2, 4, 6, 8 }, { 5, 6, 7, 8, 9, 10 } }; // Jagged array different no. of array
                                                                                  // in rows

        for (int i = 0; i < a.length; i++) {// row
            for (int j = 0; j < a[i].length; j++) {// column

                // These will print on single line
                // System.out.println(" "+d[i][j]);

                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }
    }
}
