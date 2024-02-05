import java.util.Scanner;

class User {
    String name;
    int age;
    double accountBalance;

    public User(String name, int age, double accountBalance) {
        this.name = name;
        this.age = age;
        this.accountBalance = accountBalance;
    }

    // Check if the user can watch the movie.
    public boolean canWatchMovie(Movie movie) {
        return age >= movie.getAgeRestriction() && accountBalance >= movie.getCost();
    }
    // Print movie watch status.
    public void watchMovie(Movie movie) {
        if (canWatchMovie(movie)) {
            System.out.println(name + " is watching " + movie.getTitle());
            accountBalance -= movie.getCost();
            System.out.println("Remaining account balance: " + accountBalance);
        } else {
            System.out.println(name + " cannot watch " + movie.getTitle() + " due to age restriction or insufficient balance.");
        }
    }
}

class Movie {
    String title;
    int ageRestriction;
    double cost;
    // Movie constructor.
    public Movie(String title, int ageRestriction, double cost) {
        this.title = title;
        this.ageRestriction = ageRestriction;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public String getTitle() {
        return title;
    }
}

public class MoviePlatform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for User details
        System.out.println("Enter User Details:");
        System.out.print("Name: ");
        String userName = scanner.nextLine();
        System.out.print("Age: ");
        int userAge = scanner.nextInt();
        System.out.print("Account Balance: ");
        double userBalance = scanner.nextDouble();

        // Creating User object
        User user = new User(userName, userAge, userBalance);

        // User input for Movie details
        System.out.println("\nEnter Movie Details:");
        System.out.print("Title: ");
        scanner.nextLine(); // Consume the newline character
        String movieTitle = scanner.nextLine();
        System.out.print("Age Restriction: ");
        int movieAgeRestriction = scanner.nextInt();
        System.out.print("Cost: ");
        double movieCost = scanner.nextDouble();

        // Creating Movie object
        Movie movie = new Movie(movieTitle, movieAgeRestriction, movieCost);

        // Demonstrate the use of methods
        System.out.println("\nCan " + user.name + " watch " + movie.title + "? " + user.canWatchMovie(movie));

        // Watch the movie
        user.watchMovie(movie);

        // Close the scanner
        scanner.close();
    }
}
