import java.util.Scanner;

class Finder{
    private int start;
    private int end;

    public Finder(int start, int end) {
        this.start = start;
        this.end = end;
    }

    void arm_prime(int start, int end){
        for (int i = start; i < end; i++) {

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
                System.out.println(sum);

        }
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
