//Declare an employee class with minimum 4 fields , declare respective constructors, methods and use it.
class Employeee
{
    int eid;
    String ename;
    float salary;
    Employeee(int id,String name,float s)//constructor
    {
        eid=id;
        ename=name;
        salary=s;
    }
    void display()//method
    
    {
        System.out.println(eid+ " "+ename+" "+salary);
    }
    public static void main(String args[])
    {
    Employeee e1=new Employeee(101,"tiger ",25000);//creating object
    Employeee e2=new Employeee(102,"vicky ",250000);
    Employeee e3=new Employeee(103,"selena ",25000000);
    Employeee e4=new Employeee(104,"taylor ",2500000);
    e1.display();
    e2.display();
    e3.display();
    e4.display();
    }

}
