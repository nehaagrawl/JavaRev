//Find element index in two-D Arrays
import java.util.*;
public class find_Element_2dArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c= sc.nextInt();
        int[][] arr=new int[r][c];
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c; j++) {
                arr[i][j]=sc.nextInt();

            }

        }
        System.out.println("enter value to find the Position in 2D Array");
        int target=sc.nextInt();
        for (int i = 0; i <r; i++) {
            for (int j = 0; j <c; j++) {
                if(target==arr[i][j])
                {
                    System.out.println("Target found at index "+i+","+j);
                }
            }

        }
    }
}
