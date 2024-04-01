 
import java.util.Iterator;
import java.util.LinkedList;
public class collectionsdemo1 {
    public static void main(String[] args) 
    {
        LinkedList<String> L=new LinkedList<String>();
        L.add("welcome");
        L.add("python");
        L.add("Java");
        System.out.println("***********Printing the elements**********");
        System.out.println(L);
        L.add(2,"C+++");
        System.out.println(L);
        System.out.println("********Removing the elements***********");
        L.remove("Java");
        L.remove(0);
        System.out.println(L);
        System.out.println("*****removing the existing one and replacing with other*******");
        L.set(1,"c");
        System.out.println(L);
        System.out.println("********Contains*********");
        System.out.println(L.contains("python"));
        System.out.println("isEmpty()");
        System.out.println(L.isEmpty());
        System.out.println("*********Enhanced for loop*********");
        for(String str:L)
        {
            System.out.println(str);
        }
        System.out.println("*********Iterator***********");
        Iterator<String> it=L.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
         
    }
    
}
