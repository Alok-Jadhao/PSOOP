/*
There is an abstract class called ‘AmusementPark’.
It has a method getCost() - Suppose a group comes together so this will return the total cost of the group.
There are 2 classes 'Esselworld’ and ‘Imagica’ that inherit ‘AmusementPark’. In EsselWorld,
those above 21 age have an entry fee of Rs. 1050 and for ages below 21 or above 60 it’s Rs. 660.
Similarly, in Imagica, those above 21 age have an entry fee of Rs. 1500 and for ages below 21 or above 60 it’s Rs. 1100.
Given:-
·   Esselworld has a total of 5 games
·   Imagica has a total of 7 games
·   Both have some games which are not included in the pass and have some additional cost.
(Note: You can assume games are numbered like Game 1 to 5 out of which first 3 games(Game no 1 to 3) are included in the pass
and the rest of the games ( game no 4 onwards) have an extra charge of Rs. 50)
·   When the person is going back home, the total number of games that were played and which were not played must be shown.
Also, show the count of the games played.
·   On weekends Pass cost is Rs 300 higher compared to the actual cost.
·   Also, display the total cost of the person when he is leaving.(extra game cost+ticket cost)
 */

import java.util.Scanner;

abstract class AmusementPark {
    abstract double getCost();  // It will return the total cost of group.
}

class EsselWorld extends AmusementPark {
    int age;
    int noPeople;
    boolean isWeekend;
    double totalCost = 0;

    public EsselWorld(int noPeople, boolean isWeekend) {
        this.noPeople = noPeople;
        this.isWeekend = isWeekend;
    }

    void sum(int age, int gamesNotIncluded) {
        if (age < 21 || age > 60) {
            totalCost += 660;
        } else {
            totalCost += 1050;
        }

        if(isWeekend) {
            totalCost += 300;
        }
        totalCost += gamesNotIncluded * 50;

    }

    @Override
    double getCost() {
        return totalCost;
    }
}

class Imagica extends AmusementPark {
    int age;
    int noPeople;
    boolean isWeekend;

    public Imagica(int noPeople, boolean isWeekend) {
        this.noPeople = noPeople;
        this.isWeekend = isWeekend;
    }

    void sum(int age, int gamesNotIncluded) {

    }

    @Override
    double getCost() {
        double totalCost = 0;
        if(age < 21 && age > 60) {
            totalCost += 1050;

        } else {
            totalCost += 600;
        }

        if(isWeekend) {
            totalCost += 300;
        }

        return totalCost;
    }
}

public class FunCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // No of people in group.
        System.out.println("Enter number of people: ");
        int noPeople = in.nextInt();
        // Ask if it is weekend.
        System.out.println("Is it a weekend? (true/false): ");
        boolean isWeekend = in.nextBoolean();
        // Ask which park.
        System.out.println("Which park? (1. EsselWorld 2. Imagica): ");
        int park = in.nextInt();
        // Switch case.
        /*
        switch (park) {
            case 1:
                EsselWorld esselWorld = new EsselWorld(noPeople, isWeekend);
                break;

            case 2:
                Imagica imagica = new Imagica(noPeople, isWeekend);
                break;

            default:
                System.out.println("Invalid choice.");
        }
        */

        // Assume th e calculation below for EsselWorld only.
        EsselWorld esselWorld = new EsselWorld(noPeople, isWeekend);

        // loop for each person.
        for(int i = 0; i < noPeople; i++) {
            System.out.println("Input Details for Person " + (i + 1));
            // Ask for age.
            System.out.print("Enter age: ");
            int age = in.nextInt();
            // Ask for total games played in same line.
            System.out.print("Enter total games played: ");
            int totalGames = in.nextInt();
            // Ask for games played not included in pass.
            System.out.print("Enter no of games played not included in pass: ");
            int gamesNotIncluded = in.nextInt();

            // Sum up the cost.
            esselWorld.sum(age, gamesNotIncluded);
        }

        System.out.println("Total cost: " + esselWorld.getCost());

        in.close();
    }
}


/*
Flow:
No. of person.
Weekend.

Individual person:
Age
Total ride he took.
ride which not covered in pass.

Repeat for other people.

Give back the total cost.
 */
