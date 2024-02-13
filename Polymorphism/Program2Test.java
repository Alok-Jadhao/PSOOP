import java.util.Scanner;

class Date {
    int year;
    int month;
    int date;
    int hrs;
    int min;
    int sec;

    // Default constructor
    public Date() {
        this.year = 2000;
        this.month = 1;
        this.date = 1;
        this.hrs = 0;
        this.min = 0;
        this.sec = 0;
    }

    void setDate(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    void setDate(int year, int month, int date, int hrs, int min) {
        this.year = year;
        this.month = month;
        this.date = date;
        this.hrs = hrs;
        this.min = min;
    }

    void setDate(int year, int month, int date, int hrs, int min, int sec) {
        this.year = year;
        this.month = month;
        this.date = date;
        this.hrs = hrs;
        this.min = min;
        this.sec = sec;
    }

    // Display date method
    void displayDate() {
        System.out.println("Date: " + date + "/" + month + "/" + year + " " + hrs + ":" + min + ":" + sec);
    }

    // Calculate retirement date at age of 60
    void retirement() {
        System.out.println("Retirement date: " + date + "/" + month + "/" + (year + 60) + " " + hrs + ":" + min + ":" + sec);
    }

    static String compareDates(Date date1, Date date2) {
        // Compare years
        if (date1.year != date2.year) {
            if(date1.year < date2.year)
                return "Person 1";
            else
                return "Person 2"; 
        }

        // If years are equal, compare months
        if (date1.month != date2.month) {
            return date1.month < date2.month ? "Person 1" : "Person 2";
        }

        // If months are equal, compare days
        return date1.date < date2.date ? "Person 1" : (date1.date == date2.date ? "Person 1" : "Person 2");
    }
}

public class Program2Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Person 1 details
        System.out.println("Enter name of Person 1:");
        String name1 = scanner.nextLine();
        System.out.println("Enter date of birth of Person 1 in DD-MM-YYYY format:");
        int day1 = scanner.nextInt();
        int month1 = scanner.nextInt();
        int year1 = scanner.nextInt();
        Date date1 = new Date();
        date1.setDate(year1, month1, day1);

        // Person 2 details
        System.out.println("Enter name of Person 2:");
        scanner.nextLine(); // Consume newline character left by previous scanner.nextInt()
        String name2 = scanner.nextLine();
        System.out.println("Enter date of birth of Person 2 in DD-MM-YYYY format:");
        int day2 = scanner.nextInt();
        int month2 = scanner.nextInt();
        int year2 = scanner.nextInt();
        Date date2 = new Date();
        date2.setDate(year2, month2, day2);

        // Compare dates of birth
        String youngerPerson = Date.compareDates(date1, date2);

        // Display younger person
        System.out.println("Younger person: " + youngerPerson);
    }
}
