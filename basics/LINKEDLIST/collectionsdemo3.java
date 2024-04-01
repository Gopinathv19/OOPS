 
import java.util.LinkedList;
public class collectionsdemo3 
{
    public static void main(String[] args) {
    LinkedList<Integer>L=new LinkedList<>();
    L.add(5);
    L.add(90);
    L.add(678);
    L.add(89);
    L.add(435);
    L.add(10);
    L.add(4);
    System.out.println(L);
    L.addFirst(10000);
    System.out.println(L);
    L.addLast( 190000);
    System.out.println(L);
    System.out.println(L.getFirst());
    System.out.println(L.getLast());
    L.removeFirst();
    System.out.println(L);
    L.removeLast();
    System.out.println(L);

}
    
}
