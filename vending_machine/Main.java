package vending_machine;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<product> productsList = new ArrayList<product>();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<product> cart = new ArrayList<product>();

    public static void main(String[] args) {
        product prod1 = new product(45, "Snickers");
        productsList.add(prod1);
        product prod2 = new product(10, "Perk");
        productsList.add(prod2);
        product prod3 = new product(10, "Dairy Milk");
        productsList.add(prod3);
        product prod4 = new product(10, "5 Star");
        productsList.add(prod4);
        product prod5 = new product(10, "Kit-Kat");
        productsList.add(prod5);

        char option = 'n';

        while (option != 'y') {
            System.out.println("Enter your choice:");
            System.out.println("1. View list of all products");
            System.out.println("2. Select products to add it to your cart");
            System.out.println("3.Checkout");
            System.out.println("4.Exit");
            System.out.println("5.Add Items to Vending Machine");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    display_all_products();
                    break;
                case 2:
                    select_add_products();
                    break;
                case 3:
                    checkout();
                    break;
                case 4:
                    System.out.println("Do you want to exit?(y/n)");
                    option = sc.next().charAt(0);
                    break;
                case 5:
                    add_to_vending_machine();
                    break;
                default:
                    System.out.println("Invalid option entered. Please try again.");
                    break;
            }
        }
        sc.close();
    }

    private static void add_to_vending_machine() {
        System.out.println("Enter the name of the Product:");
        // sc.next();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String name = sc.nextLine();
        System.out.println("Enter the Price of the Product:");
        int price = sc.nextInt();
        product prd = new product(price, name);
        productsList.add(prd);
        System.out.println("Product added Successfully!");
    }

    private static void select_add_products() {
        for (int i = 1; i <= productsList.size(); i++) {
            System.out.println((i) + "." + productsList.get(i - 1).displayProduct());
        }
        System.out.println("Enter your choice of product:");
        int choice = sc.nextInt();
        cart.add(productsList.get(choice - 1));
    }

    private static void checkout() {
        System.out.println("Products in your current cart are:");
        for (product pd : cart) {
            System.out.println(pd.displayProduct());
        }
        System.out.println("How do you want to pay?");
        System.out.println("1.Cash");
        System.out.println("2.Card");
        System.out.println("Enter your preferred payment choice:");
        int choice = sc.nextInt();
        int bill_amt = 0;
        for (product pd : cart) {
            bill_amt += pd.getPrice();
        }
        if (choice == 1) {
            System.out.println("Your total Bill amount for Cash Payment is:" + bill_amt);
        } else if (choice == 2) {
            System.out.println("Your total Bill amount for Card Payment is:" + bill_amt * 2);
        } else {
            System.out.println("Invalid Payment Method. Please Try again.");
        }
    }

    private static void display_all_products() {
        for (product prod : productsList) {
            System.out.println(prod.displayProduct());
        }

    }
}
