package ca.bcit.comp1510.lab11;

import java.util.Scanner;

public class Shopping {
    
    public static void displayPrompt(Scanner scan, Transaction user) {
        System.out.println("Please enter the name of an item you would like to buy "
                + "(or 'quit' to end)");
        String itemName = scan.next().trim();
        System.out.println("How much would you pay for the item? (input as float/double)");
        double itemPrice = scan.nextDouble();
        System.out.println("How many of this item would you like? (input as int >= 1)");
        int quantity = scan.nextInt();
        
        choosePurchaseOption(scan, itemName, itemPrice, quantity, user);
    }
    
    public static void choosePurchaseOption(Scanner scan, 
            String itemName, 
            double itemPrice, 
            int quantity, 
            Transaction user) {
        System.out.println("Please select which addToCart option you wish to use: (1 or 2)");
        System.out.println("1. Add by attributes (name, price, qty)");
        System.out.println("2. Add by Item (obj)");
        
        String selection = scan.next().trim();
        if (selection.equals("1")) {
            user.addToCart(itemName, itemPrice, quantity);
        }
        else if (selection.equals("2")) {
            user.addToCart(new Item(itemName, itemPrice, quantity));
        }
        else {
            System.out.println("Error: Usage (1 or 2)");
        }
        System.out.println(user);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Transaction user = new Transaction(1);
        while(true) {
            displayPrompt(scan, user);
        }
    }
}
