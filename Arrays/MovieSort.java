/*
 * Write a program in Java to maintain the information of Movies which includes the information of name
of movie , type of movie( action , thriller , comedy ,drama ) , Hero name , Heroine , budget in Rs. Write
a program to accept the information of movies from user and sort them according to the budget of the
film.
 */

import java.util.Arrays;
import java.util.Scanner;

class Information{
	String name;
	String movietype;
	String hero,heroine;
	int budget;

	public Information(){

	}

	public Information(String name, String movietype, String hero, String heroine, int budget) {
		this.name = name;
		this.movietype = movietype;
		this.hero = hero;
		this.heroine = heroine;
		this.budget = budget;
	}

	public void display(){
		System.out.println("The name of the movie is: " + name);
		System.out.println("The movie type is: " + movietype);
		System.out.println("The name of the hero is: " + hero);
		System.out.println("The name of the heroine is: " + heroine);
		System.out.println("The budget of the movie is: " + budget);
		
	}

	
	
}

public class MovieSort{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String name;
		String movietype;
		String hero,heroine;
		int budget;
		
		
		System.out.print("Enter number of Movies: ");
		int n = scanner.nextInt();

		
		Information[] movies= new Information[n];


		for (int i = 0; i < n; i++) {
		
			System.out.println("Enter the details for movie " + (i+1));
			System.out.print("Please enter the movie name: ");
			scanner.next();
			name = scanner.nextLine();	
			System.out.print("Please enter the movie type: ");
			movietype = scanner.nextLine();
			System.out.print("Please enter the hero name: ");
			hero = scanner.nextLine();
			System.out.print("Please enter the heroine name: ");
			heroine = scanner.nextLine();
			System.out.print("Please enter the movie budget in cr: ");
			budget = scanner.nextInt();
			
			scanner.nextLine();
		 	System.out.println();
			
			movies[i] = new Information(name, movietype, hero, heroine, budget);
		}

		Information temp = new Information();
		for (int i = 0; i < movies.length; i++) {
			for (int j = 1; j < movies.length-i; j++) {
				if(Double.compare(movies[j].budget, movies[j-1].budget) < 0){
					
					temp = movies[j];
					movies[j] = movies[j-1];
					movies[j-1] = temp;
				}
			}
		}

		System.out.println("Details of highest budget movie are: ");
		movies[n-1].display();

		// arr[j] = arr[j-1];
		// arr[j-1] = temp;

		// for (int i = 0; i < movies.length; i++) {
		// 	System.out.println(movies[i].budget);
		// }

		
		// movies[j].budget.compareTo

		scanner.close();
	}

	// Arrays.sort(movies);
		//I want to sort the object array based on the budget attribute.
		//Syntax: Arrays.sort(array);
		// void budgetSort() {
		// 	for (int i = 0; i < movies.length; i++) {
		// 		for (int j = 0; j < movies.length-1; j++) {
		// 			if(Double.compare(movies[j].budget, movies[j+1].budget) > 0){
		// 				Information temp = new Information();
		// 				temp = movies[j];
		// 				movies[j] = movies[j+1];
		// 				movies[j+1] = movies[j];
		// 			}
		// 		}
		// 	}
		// }
}
