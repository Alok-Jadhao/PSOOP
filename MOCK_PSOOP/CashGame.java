/*
 * A random number is generated between 0-1000 which is the cash inflow to the person
playing the game. Two people play the game 5 times and the winner is the one whose
total cash is maximum and the program displays the winner. Use the constructor to set
the initial amount as zero.
Hint - Use array of objects, import java.lang.Math; and use Math.random()
*/

class Game {
    private int amount;
    private int totalAmount;

    public Game() {
        amount = 0;
        totalAmount = 0;
    }

    public void playGame() {
        for (int i = 0; i < 5; i++) {
            amount = (int)(Math.random() * 1000);
            totalAmount += amount;
        }
    }

    public int getTotalAmount() {
        return totalAmount;
    }
}

public class CashGame {
    public static void main(String[] args) {
        Game[] players = new Game[2];
        players[0] = new Game();
        players[1] = new Game();

        for (int i = 0; i < 2; i++) {
            players[i].playGame();
        }

        displayWinner(players);
    }

    public static void displayWinner(Game[] players) {
        if (players[0].getTotalAmount() > players[1].getTotalAmount()) {
            System.out.println("Player 1 wins with total amount: " + players[0].getTotalAmount());
        } else {
            System.out.println("Player 2 wins with total amount: " + players[1].getTotalAmount());
        }
    }
} 
