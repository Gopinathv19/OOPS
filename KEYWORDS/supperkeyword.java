//super(); calling the constructor of supper class
//this(); this will execute the constructor of same class

class A extends Object
{
    void hii()
    {
        System.out.println("bye");
    }
    
    A()
    {
        super();
        System.out.println("in a");
    }
    A(int c)
    {
        System.out.println("In parameterized constructor of A:");
    }
}
class B extends A{
    B(int c)
    {
      super();
     
      System.out.println("In parameterized constructor of B:");
    }
    
    B()
    {
         
         super();
    
        System.out.println("in B");
    }
}


public class supperkeyword 
{
    public static void main(String[] args) {
    B obj = new B(); 
    obj.hii();  
    }
}
