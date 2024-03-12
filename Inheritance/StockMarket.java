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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



class Stock {
    String name;
    int[] prices;

    public Stock(String name, int[] prices) {
        this.name = name;
        this.prices = prices;
    }
	
}

class Transaction extends Stock {
    public Transaction(String name, int[] prices) {
        super(name, prices);
    }

    // Method to find the maximum profit from buying and selling the stock
    public void findMaximumProfit() {
        int maxProfit = 0;
        List<Integer> buyDays = new ArrayList<>();
        List<Integer> sellDays = new ArrayList<>();
        int buyDay = 0;
        int sellDay = 0;

        // Iterate through the prices array to find buy and sell days
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

        // Print the total profit earned and the buy/sell days
        System.out.println("Total profit earned is " + maxProfit);
        for (int i = 0; i < buyDays.size(); i++) {
            System.out.println("Buy on day " + (buyDays.get(i) + 1) + " and sell on day " + (sellDays.get(i) + 1));
        }
    }
    
}

public class StockMarket {
    public static void main(String[] args) {
    	int[] prices = {1, 5, 2, 3, 7, 6, 4, 5};
        Stock stock = new Stock("Apple", prices);
        //stock.input();
        Transaction transaction = new Transaction("Apple", prices);
        transaction.findMaximumProfit();
    }
}
