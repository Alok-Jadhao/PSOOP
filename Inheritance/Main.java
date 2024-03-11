

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
The cost of stock on each day is given in an array A[] of size N.
Day 1 price in first location, day 2 price in second location etc. Find all
the days on which you buy and sell the stock any number of time so that in between those days your profit is maximum. A new transaction can only start after previous transaction is complete. 
Person can hold only one share at a time.
Create class Stock that has name of stock and array of prices. Also it
has input method that initializes the predicted price of the stock in an array of length N.
Create class Transaction that is sub class of Stock class. It has method
findMaximumProfit
method.
Example
Stock Prices: {1, 5, 2, 3, 7, 6, 4, 5}
Total profit earned is 10
Buy on day 1 and sell on day 2
Buy on day 3 and sell on day 5
Buy on day 7 and sell on day 8
*/

class Stock {
    String name;
    int[] prices;

    public Stock(String name, int[] prices) {
        this.name = name;
        this.prices = prices;
    }
	
	/*
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int n = in.nextInt();
        prices = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter price for day " + (i + 1) + ": ");
            prices[i] = in.nextInt();
        }
    }
    */
}

class Transaction extends Stock {
    public Transaction(String name, int[] prices) {
        super(name, prices);
    }

	/*
	Logic for findMaxProfit.
	Use a for loop to iterate through every loop
	i and j variables.

	I can think of:
	check till next prices is less than the current price and then sell it.
	Use isComplete flag to check if the transcation is complete.
	*/
	
	/*
	public void findMaximumProfit() {
		int j = 0;
		int profit;
		
		for(int i = 0; i < prices.length()-1; i++) {
			boolean isComplete = false;
			if(prices[i] < prices[i+1] {
				
			}
			
		}
	*/
		
		
	/*
	public void findMaximumProfit() {
        int maxProfit = 0;
        int buyDay = 0;
        int sellDay = 0;
        int buyPrice = 0;
        int sellPrice = 0;
        int profit = 0;
        int TotalP = 0;
        for (int i = buyDay; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                buyPrice = prices[i];
                sellPrice = prices[j];
                profit = sellPrice - buyPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                    TotalP += maxProfit;
                    buyDay = i;
                    sellDay = j;
                    System.out.println("Buy on day " + (i + 1) + " and sell on day " + (sellDay + 1));
                }
            }
        }
        
        
        System.out.println("Maximum profit: " + TotalP);
    }
    */

    public void findMaximumProfit() {
        int maxProfit = 0;
        List<Integer> buyDays = new ArrayList<>();
        List<Integer> sellDays = new ArrayList<>();
        int buyDay = 0;
        int sellDay = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                buyDays.add(i);
                buyDay = i;
                while (i < prices.length - 1 && prices[i + 1] >= prices[i]) {
                    i++;
                }
                sellDays.add(i);
                sellDay = i;
                maxProfit += prices[sellDay] - prices[buyDay];
            }
        }

        System.out.println("Total profit earned is " + maxProfit);
        for (int i = 0; i < buyDays.size(); i++) {
            System.out.println("Buy on day " + (buyDays.get(i) + 1) + " and sell on day " + (sellDays.get(i) + 1));
        }
    }
    
}

public class Main {
    public static void main(String[] args) {
    	int[] prices = {1, 5, 2, 3, 7, 6, 4, 5};
        Stock stock = new Stock("Apple", prices);
        //stock.input();
        Transaction transaction = new Transaction("Apple", prices);
        transaction.findMaximumProfit();
    }
}
