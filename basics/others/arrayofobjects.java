import java.util.Scanner;

class Students {
    int marks;
    String name;
    int rollNo;
}

public class arrayofobjects {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Students[] students = new Students[5];

        for (int i = 0; i < 5; i++) {
            students[i] = new Students(); // Initialize student object
            System.out.println("Enter the name of the student");
            students[i].name=in.nextLine();
            System.out.println("Enter the marks of student " + (i + 1) + ": ");
            students[i].marks = in.nextInt();

            System.out.println("Enter the roll number of student " + (i + 1) + ": ");
            students[i].rollNo = in.nextInt();
        }

        in.close(); // Close scanner to avoid resource leaks

        // Print student details
        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("  Marks: " + students[i].marks);
            System.out.println("  Roll No: " + students[i].rollNo);
        }
    }
}
