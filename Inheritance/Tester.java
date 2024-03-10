/*
program 4 : tor, String writer. Production class has 3 argument constructor that sets
the values. It also has getter and setter methods and Overridden toString()
of object class to display details of class.
Class Play is a sub class of Production with getter and setter
methods and has an attribute int performances that is incremented every
time a play happens. Add Overridden toString() of object class to display
details of the class.
Class Musical is a Play with songs. Musical object has all attributes
of Play as well as String composer and String lyricist along with getter and
setter methods. Override toString display all attributes of Musical object
In main create 3 objects of Play and 2 objects of Musical. Every
time an object of Play or Musical is created, performances get
incremented. Also add the number of seats booked for each play or musical.
Find the total box office collection, provided cost of 1 seat for Play
is Rs 500(can be variable) and cost of 1 seat for Musical is Rs 800(can be
variable).
Display total No. of performances as 5 and display the box office
collection.
Create class Tester with main method.
*/

package Inheritance;

class Production {
    String name;
    int noOfSeats;
    double cost;
    int performances;

    Production(String name, int noOfSeats, double cost) {
        this.name = name;
        this.noOfSeats = noOfSeats;
        this.cost = cost;
        this.performances = 0;
    }

    String getname() {
        return name;
    }

    int getnoOfSeats() {
        return noOfSeats;
    }

    double getcost() {
        return cost;
    }

    int getperformances() {
        return performances;
    }

    void setname(String name) {
        this.name = name;
    }
}

class Play extends Production {
    int performances;

    Play(String name, int noOfSeats, double cost) {
        super(name, noOfSeats, cost);
        this.performances = 0;
    }

    void perform() {
        performances++;
    }

    void print() {
        System.out.println("Name: " + getname());
        System.out.println("No. of Seats: " + getnoOfSeats());
        System.out.println("Cost: " + getcost());
        System.out.println("Performances: " + getperformances());
    }
}

class Musical extends Play {
    String composer;
    String lyricist;

    Musical(String name, int noOfSeats, double cost, String composer, String lyricist) {
        super(name, noOfSeats, cost);
        this.composer = composer;
        this.lyricist = lyricist;
    }

    void print() {
        System.out.println("Name: " + getname());
        System.out.println("No. of Seats: " + getnoOfSeats());
        System.out.println("Cost: " + getcost());
        System.out.println("Composer: " + composer);
        System.out.println("Lyricist: " + lyricist);
        System.out.println("Performances: " + getperformances());
    }
}

public class Tester {
    public static void main(String[] args) {
        Play play1 = new Play("Hamlet", 50, 500);
        Play play2 = new Play("Macbeth", 50, 500);
        Musical musical1 = new Musical("Hamlet", 50, 800, "William Shakespeare", "John Lennon");
        Musical musical2 = new Musical("Macbeth", 50, 800, "William Shakespeare", "John Lennon");

        play1.perform();
        play2.perform();
        musical1.perform();
        musical2.perform();
        musical1.perform();
        musical2.perform();
    }
}