/*
Define a class Cricketer which has:-

Attributes:-
● player_name
● runs_hit
● innings_count
● not_out_count
● batting_avg

Methods:-get_avg

Make a cricket team with 11 cricketers. For each cricketer, find his batting
average. Handle all different errors while calculating this. Also, make a method
which will find the list of cricketers in ascending order of their batting average
and also display the cricketer stats in this order.
If the average of the batting average of the entire team is less than 20 runs then throw a user-defined exception.
Note- handle errors like ArrayIndexOutOfBoundsException, ArithmeticException,ArrayStoreException, NumberFormatException, etc
*/

import java.util.Scanner;

class Cricketer {
    String player_name;
    int runs_hit;
    int innings_count;
    int not_out_count;
    double batting_avg;

    public Cricketer(String player_name, int runs_hit, int innings_count, int not_out_count) {
        this.player_name = player_name;
        this.runs_hit = runs_hit;
        this.innings_count = innings_count;
        this.not_out_count = not_out_count;
        
    }

    public double get_avg() {
        batting_avg = (double) runs_hit / (innings_count - not_out_count);
        return batting_avg;
    }
}

class ArrayIndexOutOfBoundsException extends Exception {
    public ArrayIndexOutOfBoundsException() {
        super("Array Index Out of Bound Exception");
    }
}

class NumberFormatException extends Exception {
    public NumberFormatException() {
        super("Number Format Exception");
    }
}

class ArithmeticException extends Exception {
    public ArithmeticException() {
        super();
    }
}

public class Game {
    public static void main(String[] args) throws TotalAvgException{
        Cricketer[] players = new Cricketer[2];
        // user input of cricketers.
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter player name: ");
            String name = sc.next();
            System.out.print("Enter runs hit: ");
            int runs = sc.nextInt();
            System.out.print("Enter innings count: ");
            int innings = sc.nextInt();
            System.out.print("Enter not out count: ");
            int not_out = sc.nextInt();

            // object of cricketer
            players[i] = new Cricketer(name, runs, innings, not_out);
        }



        print_sorted_avg(players);

        try {
            System.out.println("The team average is : " + team_avg(players));
        } catch (TotalAvgException e) {
            System.out.println(e);
        }

        sc.close();

    }

    public static void print_sorted_avg(Cricketer[] Players) {
        // sorting the cricketers based on their batting average
        for (int i = 0; i < Players.length; i++) {
            for (int j = i + 1; j < Players.length; j++) {
                if (Players[i].batting_avg > Players[j].batting_avg) {
                    Cricketer temp = Players[i];
                    Players[i] = Players[j];
                    Players[j] = temp;
                }
            }
        }

        // printing the sorted cricketers
        for (int i = 0; i < Players.length; i++) {
            System.out.println(Players[i].player_name + " average runs: " + Players[i].get_avg());
        }
    }

    public static double team_avg(Cricketer[] Players) throws TotalAvgException{
        double team_avg = 0;
        for (int i = 0; i < Players.length; i++) {
            team_avg += Players[i].get_avg();
        }
        team_avg /= Players.length;

        if (team_avg < 20) {
            throw new TotalAvgException();
        }

        return team_avg;
    }
}

class TotalAvgException extends Exception {
    public TotalAvgException() {
        super("Average cannot be less than 20 runs.");
    }
}
