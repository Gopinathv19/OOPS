package exceptionhandling;

public class ThrowandHandling {
    
    public static void main(String[] args) 
    {
       int result;
        int a=20;
        int b=78;
        try{
             
            result=a/b;
            if(result==0)
               throw new ArithmeticException("IT is a double value");
            
        }
        catch(ArithmeticException e)
        {
            result=100;
            System.out.println("The error is"+e);

        }
        System.out.println(result);
    }
    
}
