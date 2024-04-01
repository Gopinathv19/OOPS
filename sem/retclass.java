package sem;
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }

    // Method to change the name of a person
    void changeName(String newName) {
        this.name = newName;
    }

    // Method to create a new person by combining the names of two people
    static Person combineNames(Person person1, Person person2) {
        String combinedName = person1.name + " " + person2.name;
        return new Person(combinedName);
    }
}

public class  retclass {
    public static void main(String[] args) {
        // Creating two Person objects
        Person person1 = new Person("John");
        Person person2 = new Person("Doe");

        // Displaying the original names
        System.out.println("Original Names:");
        person1.display();
        person2.display();

        // Changing the name of person1
        person1.changeName("Jane");
        System.out.println("After Name Change:");
        person1.display();

        // Creating a new person by combining the names
        Person combinedPerson = Person.combineNames(person1, person2);
        System.out.println("Combined Name:");
        combinedPerson.display();
    }
}


 
