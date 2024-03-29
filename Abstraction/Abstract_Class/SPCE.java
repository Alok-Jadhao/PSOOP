import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

abstract class Course {
    abstract void studentDetails();
}

class Comps extends Course {
    ArrayList<String[]> students = new ArrayList<>();

    @Override
    void studentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for Computer Science students:");
        while (true) {
            System.out.print("Enter student name (or 'done' to finish): ");
            String name = scanner.nextLine();
            if (name.equals("done")) {
                break;
            }
            System.out.print("Enter UID: ");
            String uid = scanner.nextLine();
            System.out.print("Enter year (FE, SE, TE): ");
            String year = scanner.nextLine();
            students.add(new String[]{name, uid, year});
        }
        scanner.close();
        Collections.sort(students, (a, b) -> {
            String[] years = {"FE", "SE", "TE"};
            return Integer.compare(
                indexOf(years, a[2]), 
                indexOf(years, b[2])
            );
        });
    }

    private int indexOf(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
}

class IT extends Course {
    ArrayList<String[]> students = new ArrayList<>();

    @Override
    void studentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for Information Technology students:");
        while (true) {
            System.out.print("Enter student name (or 'done' to finish): ");
            String name = scanner.nextLine();
            if (name.equals("done")) {
                break;
            }
            System.out.print("Enter UID: ");
            String uid = scanner.nextLine();
            System.out.print("Enter year (FE, SE, TE): ");
            String year = scanner.nextLine();
            students.add(new String[]{name, uid, year});
        }
        scanner.close();
        Collections.sort(students, (a, b) -> {
            String[] years = {"FE", "SE", "TE"};
            return Integer.compare(
                indexOf(years, a[2]), 
                indexOf(years, b[2])
            );
        });
    }

    private int indexOf(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
}

public class SPCE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a course:");
        System.out.println("1. Computer Science (Comps)");
        System.out.println("2. Information Technology (IT)");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Course course = null;
        switch (choice) {
            case 1:
                course = new Comps();
                break;
            case 2:
                course = new IT();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        course.studentDetails();

        System.out.println("\nStudent details sorted by year:");
        for (String[] student : ((Comps) course).students) {
            System.out.println("Name: " + student[0] + ", UID: " + student[1] + ", Year: " + student[2]);
        }
    }
}
