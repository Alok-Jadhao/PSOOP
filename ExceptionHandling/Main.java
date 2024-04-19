import java.util.Scanner;

class EmployeeException extends Exception {
	public EmployeeException(String message) {
		super(message);
	}
}

public class Main {
	String name;
	int age;

	public Main(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Name: ");
		String name = sc.next();
		
		System.out.print("Please Enter Age: ");
		int age = sc.nextInt();

		try {
			if(name.matches("[0-9]+")) {
				throw new EmployeeException("Name cannot be integer");
			}

			if(age > 50) {
				throw new EmployeeException("Age cannot be greater than 50");
			}
			
			Main employee = new Main(name, age);
			System.out.println("Object created Successfully");
		} catch(EmployeeException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("End of Employee Program");
		System.out.println();

		System.out.println("Demonstration of different kinds of Exception:");
		System.out.println();

		System.out.println("Array out of bound exception: ");
		int[] arr = new int[5];
		try {
			System.out.println(arr[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();

		System.out.println("NumberFormatException: ");
		try {
			String a = sc.next();
			int num = Integer.parseInt(a);
			System.out.println("The Parsed Number is: " + num);
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();

		System.out.println("StringOutOfBoundsExample: ");
		String sample = "Hello";
        try {
            char character = sample.charAt(10);
            System.out.println(character);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
		System.out.println();

		System.out.println("AirthmaticException: find HCF and LCM of two no's: ");
		
		System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

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
