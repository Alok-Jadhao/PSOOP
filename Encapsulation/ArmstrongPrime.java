import java.util.Scanner;

class Finder{
    private int start;
    private int end;

    public Finder(int start, int end) {
        this.start = start;
        this.end = end;
    }

    void arm_prime(int start, int end){

        System.out.println("Armstrong Numbers in given range are: ");
        for (int i = start; i <= end; i++) {
            //Code for Armstrong no.
            int num = i;
            int cnt = 0;
            int rem, sum;


            while (num > 0) {
                num /= 10;
                cnt++;
            }
            num = i;
            double sum1 = 0;
            while (num != 0) {
                rem = num % 10;
                sum1 += Math.pow(rem, cnt);
                num /= 10;
            }
            sum = (int) sum1;
            if (sum == i)
                System.out.print(sum + " ");

        }
        System.out.println();

        System.out.println("Prime Numbers are:");
        int numP = 0;
        for (int i = start; i < end; i++) {
            //Code for Prime No.

            int flag = 1;
            if (i == 1)
                continue;
            for (int j = 2; j < i; j++) {


                if (i % j == 0)
                    flag = 0;
            }

            if (flag == 1) {
                System.out.print(i + " ");
                numP++;
            }


        }
        System.out.println();
        System.out.println("Total Prime Numbers in given range are: " + numP);
        System.out.println();
    }
}

public class ArmstrongPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please provide the start and end numbers: ");
        int start = in.nextInt();
        int end = in.nextInt();

        Finder finder = new Finder(start, end);

        finder.arm_prime(start, end);

        in.close();
    }
}
