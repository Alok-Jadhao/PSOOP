import java.util.Scanner;

// Class to hold information about movies
class Information {
    String name;
    String movietype;
    String hero, heroine;
    int budget;

    // Default constructor
    public Information() {

    }

    // Parameterized constructor
    public Information(String name, String movietype, String hero, String heroine, int budget) {
        this.name = name;
        this.movietype = movietype;
        this.hero = hero;
        this.heroine = heroine;
        this.budget = budget;
    }

    // Method to display movie details
    public void display() {
        System.out.println("The name of the movie is: " + name);
        System.out.println("The movie type is: " + movietype);
        System.out.println("The name of the hero is: " + hero);
        System.out.println("The name of the heroine is: " + heroine);
        System.out.println("The budget of the movie is: " + budget);
    }
}

public class MovieSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String movietype;
        String hero, heroine;
        int budget;

        // Accepting the number of movies from the user
        System.out.print("Enter number of Movies: ");
        int n = scanner.nextInt();

        // Array to hold movie objects
        Information[] movies = new Information[n];

        // Accepting movie details from the user
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details for movie " + (i + 1));
            System.out.print("Please enter the movie name: ");
            scanner.nextLine(); // Consume newline left by previous nextInt()
            name = scanner.nextLine();
            System.out.print("Please enter the movie type: ");
            movietype = scanner.nextLine();
            System.out.print("Please enter the hero name: ");
            hero = scanner.nextLine();
            System.out.print("Please enter the heroine name: ");
            heroine = scanner.nextLine();
            System.out.print("Please enter the movie budget in cr: ");
            budget = scanner.nextInt();

            System.out.println();

            // Creating Information object and storing it in the movies array
            movies[i] = new Information(name, movietype, hero, heroine, budget);
        }

        // Sorting movies based on budget
        Information temp;
        for (int i = 0; i < movies.length; i++) {
            for (int j = 1; j < movies.length - i; j++) {
                if (movies[j].budget < movies[j - 1].budget) {
                    temp = movies[j];
                    movies[j] = movies[j - 1];
                    movies[j - 1] = temp;
                }
            }
        }

        // Displaying details of the movie with highest budget
        System.out.println("Details of highest budget movie are: ");
        movies[n - 1].display();
        scanner.close();
    }
}
