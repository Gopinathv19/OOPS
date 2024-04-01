package Arrayandlist;
import java.util.*;
public class listprac {
 public static void main(String[]args){
    ArrayList<Integer> s= new ArrayList<Integer>();
    // Inserting the elements
    s.add(3);
    s.add(6);
    s.add(7);
    s.add(28);
    s.add(78);
    s.add(89);
    s.add(67);
    System.out.println(s);
    // inserting the element with respetive index element
    s.set(4,10);
    // geting the value of element in the respective index value
    System.out.println(s.get(4));
    System.out.println(s.size());
    //Ascending order
    Collections.sort(s);
    System.out.println(s);
    //Descending order
    Collections.sort(s,Collections.reverseOrder(null));
    System.out.println(s);
    
     
 }
}
