package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        double hoursWorked;
        double payRate;
        double grossPay;
        double overtimeRate;
        double overtimeHours;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("How many hours have you worked? ");
        hoursWorked = scanner.nextDouble();

        System.out.print("How much are you paid an hour? ");
        payRate = scanner.nextDouble();

        if (hoursWorked > 40) {
            overtimeHours = hoursWorked - 40;
            overtimeRate = overtimeHours * (payRate * 1.5);
            grossPay = overtimeRate + (40 * payRate);

            System.out.printf("%s, your gross pay is $%.2f", name, grossPay);

        } else {
            grossPay = hoursWorked * payRate;

            System.out.printf("%s, your gross pay is $%.2f", name, grossPay);
        }

        scanner.close();
    }
}
