package Generics;

public class genericclass<T1,T2> 
{
    void display(T1 name,T2 ID)
    {
        System.out.println("Name of the employee:"+name+"ID of the employee"+ID);
    }
    public static void main(String[] args) {
      genericclass<String,Integer> obj =new  genericclass<String,Integer>();
      obj.display("Modi",2024);
    }
}
