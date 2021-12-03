//check number is negative or positive
import java.util.*;
class Positivneg
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.print("number entered = "+n);
        if (n>=0)
        {
            System.out.println("  positive number "); 
        }
        else 
        {
            System.out.println("  negative number "); 
        }
    }
}