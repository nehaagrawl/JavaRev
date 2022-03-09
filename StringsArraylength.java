/*
Take an array of Strings input from the user & find the cumulative (combined) length of all those strings
 */
import java.util.*;
public class StringsArraylength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String[] a =new String[n];
        int sum=0;
        for (int i = 0; i <a.length ; i++) {
            a[i]= sc.next();
            sum+=a[i].length();
        }
System.out.println(sum);
    }
}
