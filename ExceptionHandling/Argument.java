// package ExceptionHandling;

import java.util.Scanner;

public class Argument {
	public static void main(String[] args) {
		System.out.println("Enter two integers:");
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = Integer.parseInt(args[0]);
		System.out.print(a/b);
		System.out.println(c);
	}
}
