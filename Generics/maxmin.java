package Generics;

public class maxmin {
  public static <T extends Comparable<T>> void valuefinder(T i1, T i2) {
    if (i1.compareTo(i2) > 0) {
      System.out.println(i1 + "greater than" + i2);
    } else {
      System.out.println(i2 + "is greater than" + i1);
    }
  }

  public static void main(String[] args) {
    valuefinder(8, 9);
  }
}

