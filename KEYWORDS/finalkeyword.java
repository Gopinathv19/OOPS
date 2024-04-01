// final-method,variable,class
//final variable cause the variable static
//finall class ,the class cant be inherited
// final method a method cannot be override

final class A
{
   final int num=9;
   
   final void show()
   {
    System.out.println("In class a");
   }
}

public class finalkeyword
{
    public static void main(String[] args) {
        A a=new A();
        a.show();
    }
}
