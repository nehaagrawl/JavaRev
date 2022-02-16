//Print max number and min number from an array
import java.util.*;

public class Maxmin {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int max=Integer.MIN_VALUE;
       int min=Integer.MAX_VALUE;
       int a[]=new int[n];
       for (int i = 0; i < a.length; i++) 
       {
           a[i]=sc.nextInt();
       }
           for (int i = 0; i < a.length; i++) {
               if(a[i]>max)
               {
                   max=a[i];
               }
               if(a[i]<min)
               {
                   min=a[i];
   
               }
               System.out.println("hey");
             
            }
            System.out.println(max);
            System.out.println(min);
    }
}
