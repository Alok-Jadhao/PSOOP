import java.util.Scanner;

class User {
    String username;
    String password;

    // Constructor for initializing User object with username and password
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Method to display the username
    void getUsername() {
        System.out.println("Your username is: " + username);
    }

    boolean isValidPassword(String password) {
        // Condition 1: It should have at least 8 and at most 32 characters
        if (password.length() < 8 || password.length() > 32) {
            return false;
        }

        // Condition 2: It should start with an uppercase or lowercase letter
        char firstChar = password.charAt(0);
        if (!(Character.isUpperCase(firstChar) || Character.isLowerCase(firstChar))) {
            return false;
        }

        // Condition 3: It should not have spaces
        if (password.contains(" ")) {
            return false;
        }

        // If all conditions are satisfied, it's a valid password
        return true;
    }
}

class Post {
    int postID;
    int LikesCount;
    int CommentsCount;

    // Constructor for initializing Post object with postID, LikesCount, and CommentsCount
    public Post(int postID, int likesCount, int commentsCount) {
        this.postID = postID;
        LikesCount = likesCount;
        CommentsCount = commentsCount;
    }

    // Method to display the total number of likes
    void getLikes() {
        System.out.println("Total Likes: " + LikesCount);
    }

    // Method to display the total number of comments
    void getComment() {
        System.out.println("Total Comments: " + CommentsCount);
    }

    // Method to display either likes or comments based on the option
    void display(int option) {
        if (option == 1)
            getLikes();
        else if (option == 2) {
            getComment();
        } else
            System.out.println("Invalid input.");
    }

    // Method to perform either like or comment based on the option
    void feedback(int option) {
        if (option == 1)
            like();
        else if (option == 2) {
            comment();
        } else
            System.out.println("Invalid input.");
    }

    // Method to increment LikesCount
    void like() {
        LikesCount++;
    }

    // Method to increment CommentsCount
    void comment() {
        CommentsCount++;
    }


}

public class Constructor {
    public static void main(String[] args) {
        String username;
        String password;

        System.out.println("Input for User Class: ");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Username: ");
        username = in.nextLine();
        System.out.print("Enter Password: ");
        password = in.nextLine();

        // Creating User object
        User u1 = new User(username, password);

        //check password
        System.out.print("Valid password: ");
        System.out.println(u1.isValidPassword(password));
        u1.getUsername();


        System.out.println("Input for Post Class: ");

        int postID;
        int LikesCount;
        int CommentsCount;

        System.out.print("Enter postID: ");
        postID = in.nextInt();
        System.out.print("Enter likesCount: ");
        LikesCount = in.nextInt();
        System.out.print("Enter commentsCount: ");
        CommentsCount = in.nextInt();

        // Creating Post object
        Post p1 = new Post(postID, LikesCount, CommentsCount);

        System.out.println();
        System.out.println("What do you wish to see: 1. Like 2. Comment");
        int option = in.nextInt();
        // Displaying likes or comments based on user's choice
        p1.display(option);
        System.out.println("What do you want to do: 1. Like 2. Comment");
        int response = in.nextInt();
        // Performing like or comment based on user's choice
        p1.feedback(response);

        System.out.println("What do you wish to see: 1. Like 2. Comment");
        int option2 = in.nextInt();
        // Displaying likes or comments based on user's choice
        p1.display(option2);



    }
}
