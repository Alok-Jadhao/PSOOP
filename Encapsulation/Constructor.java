

/*
Problem statement 2.
The "User" class represents a social media user with attributes: username, password. The class should
have a method to get username.
The "Post" class represents a social media post with attributes such as postID, LikesCount, and Com-
mentsCount.
It should have methods to display no. of likes and comments for a post.
The User class also has methods to like/comment on posts.
The main method should create objects of the "User" and "Post" classes and demonstrate the use of
their methods

UPDATE:
Update:
Accepted password as a string as input. Your task is to determine if the input string is a valid password or not. For a string to be a valid password, it must satisfy all the conditions given below: (1) It should have at least 8 and at most 32 characters
(2) It should start with an uppercase or lowercase letter
(3) It should not have any of these characters: / \ = ' "
(4) It should not have spaces
It could have any character that is not mentioned in the list of characters to be avoided (points 3 and 4). Output True if the string forms a valid password and False otherwise.
 */

import java.util.Scanner;

class User{
    String username;
    String password;



    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void getUsername(){
        System.out.println("Your username is: " + username);
    }
}

class Post{
    int postID;
    int LikesCount;
    int CommentsCount;

    public Post(int postID, int likesCount, int commentsCount) {
        this.postID = postID;
        LikesCount = likesCount;
        CommentsCount = commentsCount;
    }

    void getLikes(){
        System.out.println("Total Likes: " + LikesCount);
    }

    void getComment(){
        System.out.println("Total Comments: "+ CommentsCount);
    }

    void like(){
        LikesCount++;
    }

    void comment(String comment){
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
        
        in.nextLine();
        
        User u1 = new User(username, password);
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
        System.out.print("Enter new comment: ");
        String comment = in.nextLine();
        
        
        Post p1 = new Post(postID, LikesCount, CommentsCount);
        p1.getLikes();
        p1.getComment();
        p1.like();
        p1.comment(comment);

        p1.getLikes();
        p1.getComment();
        
    }
}
