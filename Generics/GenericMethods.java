package Generics;
import java.util.Arrays;
import java.util.List;

public class GenericMethods {

    public static <T extends Number> int countOddIntegers(List<T> numbers) {
        int oddCount = 0;
        for (T number : numbers) {
            if (number.intValue() % 2 != 0) 
            {
                oddCount++;
            }
        }
        return oddCount;
       }

    public static <T> void swapElements(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length)
         {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static <T extends Comparable<T>> T findMaximalElement(List<T> list, int begin, int end) {
        if (begin < 0 || begin >= list.size() || end < 0 || end >= list.size()) {
            throw new IndexOutOfBoundsException("Invalid range");
        }

        T maxElement = list.get(begin);
        for (int i = begin + 1; i <= end; i++) {
            if (list.get(i).compareTo(maxElement) > 0) {
                maxElement = list.get(i);
            }
        }
        return maxElement;
    }

    public static void main(String[] args)
     {
        // Count odd integers in a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int oddCount = countOddIntegers(numbers);
        System.out.println("Number of odd integers: " + oddCount);

        // Swap elements in an array of strings
        String[] words = {"Hello", "World", "Welcome"};
        swapElements(words, 0, 2);
        System.out.println("Swapped array: ");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();

        // Find maximal element in a range of a list of doubles
        List<Double> doubles = Arrays.asList(1.23, 4.56, 7.89, 3.14);
        double maxElement = findMaximalElement(doubles, 1, 3);
        System.out.println("Maximal element in range [1, 3]: " + maxElement);
    }
}

