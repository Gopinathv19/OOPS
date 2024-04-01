 abstract class one{
    abstract public void Engineer();
    one(){
        System.out.println("idhu theriyama potche da");
    }
    public void doctor(){
        System.out.println("I want to be a doctor");
    }
    public void dancer(){
        System.out.println("I want to be a dancer");
    }
}
abstract class two extends one{
    public void Engineer(){
        System.out.println("Iam a Engineer");
    }
    abstract public void dentist();
}
class three extends two{
    public void dentist()
    {
        System.out.println("Iam a dentist");
    }
}


public class abstraction
{
    public static void main(String[] args) {
        three obj=new three();
        obj.doctor();
        obj.Engineer();
        obj.dancer();
        obj.dentist();
    }
}