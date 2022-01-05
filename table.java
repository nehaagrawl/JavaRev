import java.util.*;
class table
{
    public static void main(String args[]){

    Scanner in=new Scanner(System.in);
    System.out.print("input a number to print a table of that number = ") ;
      int n=
 in.nextInt();  
      System.out.println("print the table for number : "+n) ;
      int i;
      int m;
      for ( i=1;i<=10;i++){
        m=n*i;
      System.out.println(m ) ;
      }
}
}