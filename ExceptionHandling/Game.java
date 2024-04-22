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
        batting_avg = (double) runs_hit / innings_count;
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
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        Cricketer[] players = new Cricketer[11];
        // user input of cricketers.
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            if(i == 12) {
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.println("Enter player name: ");
            String name = sc.next();
            System.out.println("Enter runs hit: ");
            int runs = sc.nextInt();
            System.out.println("Enter innings count: ");
            int innings = sc.nextInt();
            System.out.println("Enter not out count: ");
            int not_out = sc.nextInt();

            // object of cricketer
            players[i] = new Cricketer(name, runs, innings, not_out);
        }

        sc.close();

        // explicit ArrayIndexOutOfBoundsException
        try {
            
        }
     

        // finding batting average for all cricketers
        for(int i = 0; i < players.length; i++) {
            System.out.println(players[i].player_name + " average runs: " + players[i].get_avg());
        }
    }
}
