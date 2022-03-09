/*
Algorithm: (We are given a 2D matrix of n X m ).
1. We will need 4 variables:
a. row_start - initialized with 0.
b. row_end - initialized with n-1.
c. column_start - initialized with 0.
d. column_end - initialized with m-1.
2. First of all, we will traverse in the row row_start from column_start to column_end and we will increase the row_start with 1 as we have
traversed the starting row.
3. Then we will traverse in the column column_end from row_start to
row_end and decrease the column_end by 1.
4. Then we will traverse in the row row_end from column_end to
column_start and decrease the row_end by 1.
5. Then we will traverse in the column column_start from row_end to
row_start and increase the column_start by 1.
6. We will do the above steps from 2 to 5 until row_start <= row_end
and column_start <= column_end.


 */
import java.util.*;
public class SpiralTraversal2DArray {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int[][] arr = new int[r][c];

        for (int i = 0; i <r; i++) {
            for (int j = 0; j <c; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("The Spiral Order Matrix is : ");
        int rowstart=0;
        int rowend=r-1;
        int cloumnstart=0;
        int columnend=c-1;

       //To print spiral order matrix
        while(rowstart<=rowend && cloumnstart<=columnend)
        {
            //1
            for(int col=cloumnstart;col<columnend;col++)
            {
                System.out.print(arr[rowstart][col]+" ");
            }
            rowstart++;
            //2

            for(int row=rowstart;row<=rowend;row++){
                System.out.print(arr[row][columnend]+" ");
            }
            columnend--;

            //3
            for(int col=columnend;col>=cloumnstart;col--)
            {
                System.out.print(arr[rowend][col]+" ");
            }
            rowend--;

            //4
            for(int row=rowend;row>=rowstart;row--)
            {
                System.out.print(arr[row][cloumnstart]+" ");
            }
            cloumnstart++;
            System.out.println();

        }

}
}
