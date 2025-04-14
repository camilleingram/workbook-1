package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int sandwichSize, age;
        String loaded;

        System.out.println("1: Regular: base price $5.45");
        System.out.println("2: Large: base price $8.95");
        System.out.print("What size sandwich would you like? (1 or 2) ");
        sandwichSize = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Would you like the sandwich loaded? (yes/no) ");
        loaded = scanner.nextLine();


        System.out.print("How old are you? ");
        age = scanner.nextInt();
        scanner.nextLine();

        handleTotal(sandwichSize, age, loaded);

        scanner.close();
    }

    public static double sandwichPrice (int sandwichSize) {
        double price = 0;

        if (sandwichSize == 1) {
            price = 5.95;
        } else if (sandwichSize == 2){
            price = 8.95;
        }
        return price;
    }

    public static void handleTotal(int sandwichSize, int age, String loaded) {

        double price = handleAddOn(sandwichSize, loaded);
        double discount;

        if (age <= 17){
            discount = 0.1;
            price -= (price * discount);
            System.out.printf("Student discount added! Your total is $%.2f", price);

        } else if (age >= 65) {
            discount = 0.2;
            price -= (price * discount);
            System.out.printf("Senior Discount added! Your total is $%.2f", price);

        } else {
            System.out.printf("No discount added. Your total is $%.2f", price);
        }
    }

    public static double handleAddOn(int sandwichSize, String loaded) {
        double price = sandwichPrice(sandwichSize);
        double addOn;

        if (sandwichSize == 1 && loaded.equals("yes")) {
            addOn = 1;
            price += addOn;
        } else if(sandwichSize == 2 && loaded.equals("yes")) {
            addOn = 1.75;
            price += addOn;
        } else if ((sandwichSize == 1 && loaded.equals("no") || sandwichSize == 2 && loaded.equals("no"))) {
            addOn = 0;
            price += addOn;
        }
        
        return price;
    }

}
