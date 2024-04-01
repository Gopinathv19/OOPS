package exceptionhandling;
import java.util.*;
class a extends Exception
{
    public a(String message)
    {
        super(message);
    }
}
class b extends Exception{
    public b(String message)
    {
        super(message);
    }
}
public class userexception {
    public static void main(String[] args) {
        
    
    try
    {
        int num;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a positive number::");
        num=in.nextInt();
        in.close();
        if(num<0)
        {
            throw new a("Number not in range Exception");
        }
        else if (num>100){
            throw new b("Range not in range Exception");
        }
        else{
            System.out.println("The number is error free ypu can use it:");
        }
    }
    catch(a e)
    {
        System.out.println(e);
    }
    catch(b e)
    {
        System.out.println(e);
    }    
     
}
}
