import java.util.Scanner;

class Information{
	String name;
	String movietype;
	String hero,heroine;
	int budget;
	
	
	public void display(){
		System.out.println("The name of the movie is: " + name);
		System.out.println("The movie type is: " + movietype);
		System.out.println("The name of the hero is: " + hero);
		System.out.println("The name of the heroine is: " + heroine);
		System.out.println("The budget of the movie is: " + budget);
		
	}
	
	
}

public class Movies{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String name;
		String movietype;
		String hero,heroine;
		int budget;
		
		System.out.print("Please enter the movie name: ");
		name = in.nextLine();	
		System.out.print("Please enter the movie type: ");
		movietype = in.nextLine();
		System.out.print("Please enter the hero name: ");
		hero = in.nextLine();
		System.out.print("Please enter the heroine name: ");
		heroine = in.nextLine();
		System.out.print("Please enter the movie budget in cr: ");
		budget = in.nextInt();
		
		Information movie1= new Information();
		movie1.name = name;
		movie1.movietype = movietype;
		movie1.hero = hero;
		movie1.heroine = heroine;
		movie1.budget = budget;
		
		
		in.nextLine();
		System.out.println();
		System.out.println("Enter the details for movie 2");
		
		
		
		System.out.print("Please enter the movie name: ");
		name = in.nextLine();	
		System.out.print("Please enter the movie type: ");
		movietype = in.nextLine();
		System.out.print("Please enter the hero name: ");
		hero = in.nextLine();
		System.out.print("Please enter the heroine name: ");
		heroine = in.nextLine();
		System.out.print("Please enter the movie budget in cr: ");
		budget = in.nextInt();
		System.out.println();
		
		Information movie2 = new Information();
		movie2.name = name;
		movie2.movietype = movietype;
		movie2.hero = hero;
		movie2.heroine = heroine;
		movie2.budget = budget;
		
		
		
		if(movie1.budget>movie2.budget){
			movie1.display();
		}
		else if(movie1.budget<movie2.budget){
			movie2.display();
		}
		else
			System.out.println("Both the movies are of equal budget");
	}
}
