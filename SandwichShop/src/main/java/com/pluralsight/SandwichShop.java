package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int sandwichSize, age;

        System.out.println("1: Regular: base price $5.45");
        System.out.println("2: Large: base price $8.95");
        System.out.print("What size sandwich would you like? (1 or 2) ");
        sandwichSize = scanner.nextInt();
        scanner.nextLine();

        System.out.print("How old are you? ");
        age = scanner.nextInt();
        scanner.nextLine();

        discount(sandwichSize, age);

        scanner.close();
    }

    public static double sandwichPrice (int sandwichSize) {

        if (sandwichSize == 1) {
            return 5.45d;
        } else {
            return 8.95d;
        }

    }

    public static void discount(int sandwichSize, int age) {

        double price = sandwichPrice(sandwichSize);
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

}
