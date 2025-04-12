package com.pluralsight;
import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum;
        int secondNum;
        String operator;
        int result;

        System.out.print("Enter the first number: ");
        firstNum = scanner.nextInt();

        System.out.print("Enter the second number: ");
        secondNum = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter an operator: ");
        operator = scanner.nextLine();

        result = firstNum * secondNum;

        System.out.printf("Possible Calculations:%n (A)dd%n (S)ubtract%n (M)ultiply%n (D)ivide%n");
        System.out.printf("Please select an option: %s%n", operator);

        System.out.printf("%d * %d = %d", firstNum, secondNum, result);
        scanner.close();
    }
}
