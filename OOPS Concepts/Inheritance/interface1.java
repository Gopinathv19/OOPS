interface a{
    
    void hello();
}
interface b extends a
{
    void gm();
}

interface c{
    void greet();
}
class d implements b,c{
    public void hello(){
        System.out.println("hello");
    }
    public void gm(){
        System.out.println("gm");
    }
    public void greet(){
        System.out.println("greet");
    }
}
public class interface1 {
    public static void main(String[] args) {
        d obj=new d();
        obj.hello();
        obj.gm();
        obj.greet();
    }
}
