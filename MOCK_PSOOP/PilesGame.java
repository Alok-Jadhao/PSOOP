/*
 * This game starts with two piles of n1 and n2 chips.
They play alternatively.
In his/her turn a person has to remove one of the piles and split the other pile into two
piles, these two new piles need not be of the same size. The person who cannot make a
move in his turn loses. Write a program to find the winner. Here interface Piles has
SetPiles(int,int) to set the number of chips in each pile.
Sample Input
31
92
Sample Output
Bob
Alice
Explanation
Test case 1:
Initially, the piles are (3, 1).
Alice takes 1 and splits 3 into (1, 2).
Bob takes 1 and splits 2 into (1, 1).
Alice cannot make her move. Thus Bob wins.
Test case 2:
Initially, the piles are (9, 2).
Alice takes 9 and splits 2 into (1, 1).
Bob cannot make his move. Thus Alice wins.
*/
import java.util.Scanner;

interface Piles {
    
    void setPiles(int a, int b);


}

class Player1 implements Piles {
    int a;
    int b;
    
    @Override
    public void setPiles(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    
    public boolean checkWinner() {
        if(this.a == this.b) {
            System.out.println("Player 1 wins.");
            return true;
        }
        return false;
    }
}

class Player2 implements Piles {
    int a,b;

    @Override
    public void setPiles(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    
    public boolean checkWinner() {
        if(this.a == this.b) {
            System.out.println("Player 2 wins.");
            return true;
        }
        return false;
    }
}

public class PilesGame {
    public static void main(String[] args) {
        System.out.println("The Game Begins: ");
        System.out.println("The inital piles are: (10, 10)");
        Player1 p1 = new Player1();
        Player2 p2 = new Player2();
        Scanner sc = new Scanner(System.in);
        
        do {
            // take input of p1
            System.out.print("Enter new a and b for p1: ");
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            p1.setPiles(a, b);
            // check winner.
            if(p1.checkWinner()) {
                break;
            }
            p1.setPiles(a, b);
            // take input of p2
            System.out.print("Enter new a and b for p2: ");
            int c = sc.nextInt();
            int d = sc.nextInt();
            p2.setPiles(c, d);
            // check winner
            if(p2.checkWinner()) {
                break;
            }
        } while (!p1.checkWinner() && !p2.checkWinner());

        System.out.println("Game over.");

        sc.close();
            
        
    }
}
