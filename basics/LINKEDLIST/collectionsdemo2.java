 
import java.util.Collections;
import java.util.LinkedList;
public class collectionsdemo2 {
    public static void main(String[] args) {    
    LinkedList<Integer> L=new LinkedList<>();
    L.add(6);
    L.add(7);
    L.add(3);
    L.add(10);
    LinkedList<Integer> L2=new LinkedList<>();
    L2.addAll(L);
    System.out.println(L2);
    System.out.println(L2.removeAll(L));
    Collections.sort(L);
    System.out.println(L);
    Collections.sort(L,Collections.reverseOrder());
    System.out.println(L);  
    Collections.shuffle(L);
    System.out.println(L);
}
}