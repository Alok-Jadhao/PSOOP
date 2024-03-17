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
MM-YYYY format. Your output should be the name of the younger of person
*/

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

    static void compareDates(int day1,int month1,int year1,int day2,int  month2,int year2,String name1,String name2) {
        long sum1=0;
        sum1+= year1*365 + month1*30 +day1;

        long sum2=0;
        sum2+= year2*365 + month2*30 +day2;

        if (sum1 <sum2){
            System.out.println(name2 +" is younger");
        }
        else {
            System.out.println(name1 +" is younger");
        }
    }
}

public class Program2 {
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
        Date.compareDates(day1, month1,year1,day2, month2,year2, name1, name2);

    }
}


