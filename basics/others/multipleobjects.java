class gopinath{
     
    void dance(){
        System.out.println("i can dance");
    }
}



public class multipleobjects{
public static void main(String[] args) {
    gopinath obj[]=new gopinath[5];
    for(int i=0;i<5;i++){
        System.out.println(obj[i]);
    }
}
}