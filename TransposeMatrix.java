//column 1 prints as row1 as well as column print as rows .
import java.util.*;
public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();

            }

        }

        System.out.println("The transpose is : ");
        //To print transpose
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
    }
}
