/*
Enter an array (use Scanner) of distinct n integers (use command line
argument) and a sum value. Print all triplets with a sum smaller than the given
sum value.
Example:
Input : arr[] = {-2, 0, 1, 3}
sum = 2.
Output : (-2, 0, 1)
(-2, 0, 3)
Explanation : The two triplets have sum less than or equal to 2.
*/

import java.util.Scanner;

class PrintTriplet {
    int n;
    int sum;
    int[] arr;

    public PrintTriplet(int n, int[] arr, int sum) {
        this.n = n;
        this.arr = arr;
        this.sum = sum;
    }

    public void print() {
        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    if(arr[i] + arr[j] + arr[k] < sum) {
                        System.out.println("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
                    }
                }
            }
        }
    }   
}

public class Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);

        int[] arr = new int[n];
        System.out.print("Enter array separated by a space: ");
        for(int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
        }

        System.out.print("Enter the sum: ");
        int sum = sc.nextInt();

        PrintTriplet triplet = new PrintTriplet(n, arr, sum);

        triplet.print();
    }
}
