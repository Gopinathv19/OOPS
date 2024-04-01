//Basic
package Threads;
class a extends Thread
{
    public void run()
    {
        for(int i=0;i<=100;i++)
        {
            System.out.println("hii");
        }
    }
}
class b extends Thread{
    public void run()
    {
        for(int i=0;i<=100;i++)
        {
        System.out.println("bye");
        }
    }
}
public class thread1
{
    public static void main(String[] args) {
        a obj1=new a();
        b obj2=new b();
        obj1.start();
        obj2.start();
    }
}
