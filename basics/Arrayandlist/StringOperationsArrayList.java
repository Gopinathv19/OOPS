package Arrayandlist;

import java.util.ArrayList;
import java.util.Collections;

public class StringOperationsArrayList {

    public static void main(String[] args) {
        // Create an ArrayList to store strings
        ArrayList<String> stringList = new ArrayList<>();

        // Add strings to the list
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        stringList.add("Programming");

        // Print the original list
        System.out.println("Original List: ");
        printStringList(stringList);

        // Get and print a specific element
        String elementAtIndex2 = stringList.get(2);
        System.out.println("Element at index 2: " + elementAtIndex2);

        // Add a new element at a specific index
        stringList.add(1, "Beautiful");
        System.out.println("List after adding element: ");
        printStringList(stringList);

        // Remove an element by value
        stringList.remove("Java");
        System.out.println("List after removing element: ");
        printStringList(stringList);

        // Check if an element exists
        boolean containsJava = stringList.contains("Java");
        System.out.println("Does 'Java' exist? " + containsJava);

        // Get the index of an element
        int indexOfWorld = stringList.indexOf("World");
        System.out.println("Index of 'World': " + indexOfWorld);

        // Sort the list alphabetically
        Collections.sort(stringList);
        System.out.println("Sorted list: ");
        printStringList(stringList);

        // Reverse the list
        Collections.reverse(stringList);
        System.out.println("Reversed list: ");
        printStringList(stringList);

        // Clear the list
        stringList.clear();
        System.out.println("Empty list: " + stringList);
    }

    // Utility method to print the contents of the ArrayList
    public static void printStringList(ArrayList<String> list) {
        for (String str : list) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}


/*Adding elements
Accessing elements
Adding elements at specific positions
Removing elements
Checking if an element exists
Getting the index of an element
Sorting the list
Reversing the list
Clearing the list*/