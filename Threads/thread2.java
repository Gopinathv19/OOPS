//Sleep Method
package Threads;
class a extends Thread{
    public void run(){
        for(int i=0;i<=100;i++)
        {
            System.out.println("hii");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
 
                e.printStackTrace();
            }
        }
    }
}
class b extends Thread{
    public void run()
    {
        for(int i=0;i<=100;i++)
        {
        System.out.println("bye");
        try {
            Thread.sleep(1);
        } catch (InterruptedException e)
         {
            e.printStackTrace();
        }
        }
    }
}
public class thread2
{
    public static void main(String[] args) 
    {
        a obj1=new a();
        b obj2=new b();
        obj1.setPriority(5);
        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());        
        obj1.start();
        try 
        {
            Thread.sleep(1);
        } 
        catch (InterruptedException e) 
        {
            
            e.printStackTrace();
        }
        obj2.start();
    }
}