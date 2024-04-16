import java.util.Scanner;

class EmployeeException extends Exception {
	public EmployeeException(String message) {
		super(message);
	}
}

public class Employee {
	String name;
	int age;

	public Employee(String name, int age) {
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
			
			Employee employee = new Employee(name, age);
			System.out.println("Object created Successfully");
		}
		catch(EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}
}
