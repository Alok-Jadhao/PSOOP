/*
Flow:
Input start and end;
Call NumFinder Constructor;
Then call odd_even method for printing no.

 */

import java.util.Scanner;

class NumFinder{
    private int start;
    private int end;

    public NumFinder(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    void odd_even(int start, int end){
        int even = 0;
        int odd = 0;

        System.out.println("Even no. in the given range are: ");
        for (int i = start; i <= end; i++) {
            if(i%2==0){
                System.out.print(i + " ");
                even++;
            }

        }

        System.out.println();
        

        System.out.println("Odd no. in the given range are: ");
        for (int i = start; i <= end; i++) {
            if(i%2==1){
                System.out.print(i + " ");
                odd++;
            }

        }
        
        System.out.println();
        System.out.println();

        System.out.println("Total odd numbers are: " + odd);
        System.out.println("Total even numbers are: " + even);
    }
    
    
}

public class OddandEvenRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please provide the start and end numbers: ");
        int start = in.nextInt();
        int end = in.nextInt();

        NumFinder num1 = new NumFinder(start, end);

        num1.odd_even(start, end);

        in.close();

    }
}
