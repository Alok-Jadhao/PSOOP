import java.util.Scanner;

class Posting {
    // Data members
    private int courseWork;
    private int aptTest;
    private int techTest;
    private int interview;
    private int total;

    // Constructor to initialize values for Programmer role
    Posting(int courseWork, int aptTest, int techTest, int interview) {
        this.courseWork = courseWork;
        this.aptTest = aptTest;
        this.techTest = techTest;
        this.interview = interview;
    }

    // Constructor to initialize values for Team Leader role
    Posting(int techTest, int interview) {
        this.techTest = techTest;
        this.interview = interview;
    }

    // Constructor to initialize values for Project Manager role
    Posting(int interview) {
        this.interview = interview;
    }

    // Method to evaluate and display result for Programmer role
    void program() {
        total = aptTest + courseWork + techTest + interview;

        if (total >= 80) {
            System.out.println("You are hired as Programmer.");
        } else {
            System.out.println("You are not hired.");
        }
    }

    // Method to evaluate and display result for Team Leader role
    void lead() {
        total = techTest + interview;

        if (total >= 85) {
            System.out.println("You are hired as Team Leader.");
        } else {
            System.out.println("You are not hired.");
        }
    }

    // Method to evaluate and display result for Project Manager role
    void manager() {
        total = interview;

        if (total >= 90) {
            System.out.println("You are hired as Project Manager.");
        } else {
            System.out.println("You are not hired.");
        }
    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to choose a role
        System.out.println("Which role do you want to apply for?");
        System.out.println("1. Programmer\n2. Team Leader\n3. Project Manager");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                // Input marks for Programmer role
                System.out.println("Coursework: ");
                int coursework = sc.nextInt();
                System.out.println("Aptitude Test: ");
                int aptitude = sc.nextInt();
                System.out.println("Technical Test: ");
                int technical = sc.nextInt();
                System.out.println("Interview: ");
                int interview = sc.nextInt();
                // Create Posting object for Programmer
                Posting p1 = new Posting(coursework, aptitude, technical, interview);
                // Evaluate and display result
                p1.program();
                break;
            case 2:
                // Input marks for Team Leader role
                System.out.println("Technical Test: ");
                int tech = sc.nextInt();
                System.out.println("Interview: ");
                int interview2 = sc.nextInt();
                // Create Posting object for Team Leader
                Posting p2 = new Posting(tech, interview2);
                // Evaluate and display result
                p2.lead();
                break;
            case 3:
                // Input marks for Project Manager role
                System.out.println("Interview: ");
                int interview3 = sc.nextInt();
                // Create Posting object for Project Manager
                Posting p3 = new Posting(interview3);
                // Evaluate and display result
                p3.manager();
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
        }
        sc.close();
    }
}
