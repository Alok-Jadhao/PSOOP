import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        try {
            int hcf = findHCF(num1, num2);
            int lcm = findLCM(num1, num2);

            System.out.println("HCF: " + hcf);
            System.out.println("LCM: " + lcm);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        }
    }

    public static int findHCF(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static int findLCM(int num1, int num2) {
        int hcf = findHCF(num1, num2);
        int lcm = (num1 * num2) / hcf;
        return lcm;
    }
}
