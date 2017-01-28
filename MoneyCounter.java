package moneycounter;

import java.util.Scanner;

class MoneyCounter {
    public static void main (String[] args) {
        
        
        Scanner reader = new Scanner(System.in);
        
        double pennyValue, nickelValue, dimeValue, quarterValue, dollarValue, money;
        double pennyAmount, nickelAmount, dimeAmount, quarterAmount, dollarAmount;
        
        //takes input for how many pennies you have
        System.out.println("How many pennies do you have?");
        pennyAmount = reader.nextDouble();
        
        //takes input for how many nickels you have
        System.out.println("How many nickels do you have?");
        nickelAmount = reader.nextDouble();
        
        //takes input for how many dimes you have
        System.out.println("How many dimes do you have?");
        dimeAmount = reader.nextDouble();
        
        //takes input for how many quarters you have
        System.out.println("How many quarters do you have?");
        quarterAmount = reader.nextDouble();
        
        //takes input for how many dollars you have
        System.out.println("How many dollars do you have?");
        dollarAmount  = reader.nextDouble();
        
        
        pennyValue = (1 * pennyAmount) / 100;
        
        nickelValue = (5 * nickelAmount) / 100;
        
        dimeValue = (10 * dimeAmount) / 100;
        
        quarterValue = (25 * quarterAmount) / 100;
        
        dollarValue = (100 * dollarAmount) / 100;

        //calculates and outputs the total amount of money    
        money = pennyValue + nickelValue + dimeValue + quarterValue + dollarValue;
        System.out.println ("You have $" + money);
    }
}