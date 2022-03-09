//Taking a matrix as an input and printing its elements.
import java.util.*;
public class ArrayTwoD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows =sc.nextInt();
        int cloum = sc.nextInt();

        int[][] a=new int[rows][cloum];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <cloum ; j++)
            {
                a[i][j]= sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cloum;j++) {
                System.out.print(a[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
    }

