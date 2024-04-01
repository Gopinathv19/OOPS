package Generics;
public class GenericMinMaxFinder 
{
    public static <T extends Comparable<T>> T findMin(T x, T y) {
        if (x.compareTo(y) < 0) {
            return x;
        } else {
            return y;
        }
    }

    public static <T extends Comparable<T>> T findMax(T x, T y) {
        if (x.compareTo(y) > 0) {
            return x;
        } else 
        {
            return y;
        }
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        System.out.println("Minimum value: " + findMin(x, y));
        System.out.println("Maximum value: " + findMax(x, y));

        double d1 = 3.14;
        double d2 = 2.71;
        System.out.println("Minimum value: " + findMin(d1, d2));
        System.out.println("Maximum value: " + findMax(d1, d2));

        String s1 = "Hello";
        String s2 = "World";
        System.out.println("Minimum value: " + findMin(s1, s2));
        System.out.println("Maximum value: " + findMax(s1, s2));
    }

}
