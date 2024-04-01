package Generics;

public class genricmethods2 {
    public static<E>void display(E[] array3){
        for(E element:array3)
           System.out.println(element);
     
    }
    public static void main(String[] args) {
        Integer[] array1={2,3,3,4,4,5};
        Character[] array2={'g','o','p','i',};
        display(array1);
        display(array2);
        
    }
}
