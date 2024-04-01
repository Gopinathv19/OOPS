package exceptionhandling;

public class nestedtry {
    
    public static void main(String[] args) {
        try{
            int a=10;
            int b=0;
            int result=a/b;
            System.out.println(result);
        try{
            int ab[]={1,2,3,4};
            System.out.println(ab[10]);
        try{
            String name="Gopinath";//give null
            System.out.println(name.charAt(3));
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        }

        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
           
    
     
    
}
}