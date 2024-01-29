/*Write a program to find all prime numbers in the given range.
Print the prime numbers and total number of prime numbers in the range. Use the concept of class and objects.
*/

import java.util.Scanner;

class Prime{
	private int start;
    private int end;

    public Prime(int start, int end) {
        this.start = start;
        this.end = end;
    }

    void findprime(int start, int end) {

        
        for (int i = start; i <= end; i++) {
        	
     		int flag = 1;
     		if(i==1)
					continue; 
            for (int j = 2; j<i ; j++) {
            
				           	
                if (i % j == 0)
                    flag = 0;
            }

            if (flag == 1)
                System.out.print(i + " ");
        }

        System.out.println();
    }
    
    
}

public class PrimeNumbers {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please provide the start and end numbers: ");
        int start = in.nextInt();
        int end = in.nextInt();

        Prime prime = new Prime(start, end);

        prime.findprime(start ,end);

        in.close();
    }
}


//j * j <= i * i
