package Inheritance;

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

    public Stock(String name) {
        this.name = name;
    }

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
}

class Transaction extends Stock {
    public Transaction(String name) {
        super(name);
    }

    // Incomplete because it gives the only maximum profit.
    // It should give the maximum profit for every buy and sell.
    // Like test case.

    // Wrong function.
    // Left for you to think...
    public void findMaximumProfit() {
        int maxProfit = 0;
        int buyDay = 0;
        int sellDay = 0;
        int buyPrice = 0;
        int sellPrice = 0;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                buyPrice = prices[i];
                sellPrice = prices[j];
                profit = sellPrice - buyPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                    buyDay = i;
                    sellDay = j;
                }
            }
        }
        System.out.println("Buy on day " + (buyDay + 1) + " and sell on day " + (sellDay + 1));
        System.out.println("Buy price: " + buyPrice + " Sell price: " + sellPrice);
        System.out.println("Maximum profit: " + maxProfit);
    }
}

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("Apple");
        stock.input();
        Transaction transaction = new Transaction("Apple");
        transaction.findMaximumProfit();
    }
}