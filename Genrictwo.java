class Genrictwo {
        public static void main (String[] args)
    {
        Genricclas <String, Integer> n1 = new Genricclas<String, Integer>("Neha", 23);
  
        n1.print();
    }
}
// We use < > to specify Parameter type
    class Genricclas <N, A>
{
    N name;  // An object of type N
    A Age;  // An object of type A

    // constructor
    Genricclas(N name, A Age)
    {
        this.name = name;
        this.Age = Age;
    }
  
    // To print objects of N and A
    public void print()
    {
        System.out.println(name);
        System.out.println(Age);
    }
}
