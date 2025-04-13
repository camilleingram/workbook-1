package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double hoursWorked, payRate;

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("How much are you paid an hour? ");
        payRate = scanner.nextDouble();

        System.out.print("How many hours did you work? ");
        hoursWorked = scanner.nextDouble();
        if(hoursWorked > 40){
            System.out.printf("%s, your gross pay is $%.2f.", name, calculateOTGrossPay(payRate, hoursWorked));
        } else {
            System.out.printf("%s, your gross pay is $%.2f.", name, calculateGrossPay(payRate, hoursWorked));
        }

        scanner.close();
    }

    public static double calculateGrossPay (double rate, double hours) {
        double grossPay;

        grossPay = rate * hours;

        return grossPay;
    }

    public static double calculateOTGrossPay(double rate, double hours) {

        double overtimeHours;
        double overtimeRate;
        double grossPay;

        overtimeHours = hours - 40;
        overtimeRate = overtimeHours * (rate * 1.5);
        grossPay = overtimeRate + (40 * rate);

        System.out.printf("You have worked %.2f overtime hours %n", overtimeHours);

        return grossPay;
    }
}
