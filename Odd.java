
//sum of odd number upto given integer
import java.util.Scanner;

public class Odd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("number= " + n);
        int sum = 0;
        for (int i = 1; i <= n; i = i + 2) {
            System.out.println(i);
            sum = sum + i;

        }
        System.out.println("sum = " + sum);
    }
}
