// Runnable
package Threads;
class a implements Runnable{
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("hii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                 
                e.printStackTrace();
            }
        }
    }
}
class b implements Runnable{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
        System.out.println("bye");
        try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                 
                e.printStackTrace();
            }
        }
    }
}
public class thread3
{
    public static void main(String[] args) {
        Runnable obj1=new a();
        Runnable obj2=new b();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
    }
}



