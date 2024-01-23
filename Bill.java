//Flow of the program:
//Read name;
//Read no. of units;
//Print name;
//Print no of units * rate;


/*For the first 100 units – 60 paise per unit.

For the next 200 units – 80 paise per unit

Beyond 300 units – 90 paise per unit.
 */

import java.util.*;

public class Bill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = in.next();

        System.out.println("Please provide your units consumed: ");
        int unit = in.nextInt();

        System.out.println("Hello " + name + ",");
        double bill = 50;
        if(unit<101)
        {
            bill += (float) (unit * 0.60);
        }

        else if(unit<301)
        {
            bill += (float) (unit * 0.60);
        }

        else if(unit >300)
        {
            bill += (float) (unit * 0.90);
        }

        if(bill>300)
            bill += bill * 0.15;

        System.out.println("Your bill is: Rs" + bill);

    }
}

//
