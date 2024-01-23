import java.util.Scanner;

class Bill{
    int unit;
    String name;
    int bill = 50;

    public Bill(int unit, String name) {
        this.unit = unit;
        this.name = name;
    }

    void price(){
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

        System.out.println("Hello " + name + ",");
        System.out.println("Your bill is: Rs " + bill);
    }
}

public class Electicity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = in.next();

        System.out.println("Please provide your units consumed: ");
        int unit = in.nextInt();

         Bill bill1 = new Bill(unit, name);
         bill1.price();

    }
}
