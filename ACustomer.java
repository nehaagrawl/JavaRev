import java.util.*;
class ACustomer{
public ACustomer()
    {
    int cid;
    String cname;
    int accno;
    }
    ACustomer(int cid ,String cname,int accno)
    {
        this.cid=cid; 
        this.cname= cname;
        this.accno=accno;
        }
        void displaycustomer()
        {
            System.out.println("customer id is "+cid);
            System.out.println("Name is"+cname);
            System.out.println("Accno is"+accno);
        }
        
    class retailcustomer extends ACustomer
    {
        int creditcardnumber=123;
    }
    public void display()
    {
        System.out.println("cerditcardno="+creditcardnumber);
    }
   public  class wholesalecustomer extends ACustomer
    {
        int accno;
    }

    {
        public static void main (String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter customer id")
            int cid=sc.nextInt();
            System.out.println("enter customer name")
            int cname=sc.nextInt();
            System.out.println("enter customer accno.")
            int accno=sc.nextInt();
            ACustomer obj=new ACustomer();
            obj.displaycustomer();
    }
}}