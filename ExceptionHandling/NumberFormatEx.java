import java.util.Scanner;

public class NumberFormatEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String a = sc.next();
			int num = Integer.parseInt(a);
			System.out.println("The Parsed Number is: " + num);
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
