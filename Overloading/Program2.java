/*
Create a Date class with data int year, int month, int date, int hrs, int min, int sec. Create a
default, no-argument constructor which sets the default date to January 1, 2000, 00:00:00
Create 3 overloaded setter methods
void setDate(int year, int month, int date)
void setDate(int year, int month, int date, int hrs, int min)
void setDate(int year, int month, int date, int hrs, int min, int sec)
Also write a displayDate() method which will display the date depending on the type of date
object created.
1-add a function calculating the date of retirement at age of 60 for the given input date.
2- You are given the dates of birth of two persons, not necessarily from the same family.
Your task is to find the younger of the two. If both of them share the same date of birth,
then the younger of the two is assumed to be that person whose name comes first in
alphabetical order.
The input will have four lines. The first two lines correspond to the first person, while the
last two lines correspond to the second person. For each person, the first line
corresponds to the name and the second line corresponds to the date of birth in DD-
MM-YYYY format. Your output should be the name of the younger of 
*/

import java.util.Scanner;

class Date {
	int year;
	int month;
	int date;
	int hrs;
	int min;
	int sec;

	public Date() {
		this.year = 2000;
		this.month = 1;
		this.date = 1;
		this.hrs = 00;
		this.min = 00;
		this.sec = 00;
	}

	public Date(int year, int month, int date, int hrs, int min, int sec) {
		this.year = year;
		this.month = month;
		this.date = date;
		this.hrs = hrs;
		this.min = min;
		this.sec = sec;
	}
	
	void setDate(int year, int month, int date){
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	void setDate(int year, int month, int date, int hrs, int min){
		this.year = year;
		this.month = month;
		this.date = date;
		this.hrs = hrs;
		this.min = min;
		
	}
	
	void setDate(int year, int month, int date, int hrs, int min, int sec){
		this.year = year;
		this.month = month;
		this.date = date;
		this.hrs = hrs;
		this.min = min;
		this.sec = sec;
	}

	void displayDate(){
		System.out.println("Date is: "+ date + ':' + month + ':' + year);
	}

	void retirement(){
		System.out.println("Your retirement date is: " + date + ':' + month + ':' + (year+60));
	}
}

public class Program2 {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

		System.out.println("How would you like to input date: ");
		System.out.println("1. 1/1/2000  2. 1/1/2000 00:00  3. 1/1/2000 00:00:00");

		int choice = in.nextInt();

		int year;
		int month;
		int date;
		int hrs;
		int min;
		int sec;

		System.out.println("Enter date: ");
		date = in.nextInt();
		System.out.println("Enter month: ");
		month = in.nextInt();
		System.out.println("Enter year: ");
		year = in.nextInt();

		switch (choice) {
			case 1:
				//Input already taken, as it was common input for all cases.
				break;
			
			// 00:00
			case 2:
				System.out.print("Enter hour: ");
				hrs = in.nextInt();
				System.out.print("Enter min: ");
				min = in.nextInt();
				break;

			// 00:00:00
			case 3:

				System.out.print("Enter hour: ");
				hrs = in.nextInt();
				System.out.print("Enter min: ");
				min = in.nextInt();
				System.out.print("Enter seconds: ");
				sec = in.nextInt();
				break;


			default:
				break;
		}
	

	}
}
