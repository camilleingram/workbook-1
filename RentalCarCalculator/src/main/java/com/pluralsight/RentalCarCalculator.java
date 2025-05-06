package com.pluralsight;
import java.time.LocalDate;
import java.util.Scanner;

public class RentalCarCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String wantTag, wantGPS, wantAssist;
        int daysOfRental, age;
        LocalDate pickUpDate = LocalDate.now();
        double basicRental = 29.99;

        System.out.print("How many days are you renting? ");
        daysOfRental = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Would you like an electronic toll tag at 3.95/day? ");
        wantTag = scanner.nextLine();

        System.out.print("Would you like GPS at $2.95/day? ");
        wantGPS = scanner.nextLine();

        System.out.print("Would you like roadside assistance at 3.95/day? ");
        wantAssist = scanner.nextLine();

        System.out.print("How old are you? ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("Car rental starts at $%.2f %n", basicRental);
        double optionsCost = handleOptions(wantTag, wantGPS, wantAssist);
        System.out.printf("Your total option cost is $%.2f %n", optionsCost);
        double totalPrice = carRental(daysOfRental, basicRental, wantTag, wantGPS, wantAssist, age);
        System.out.println("Your total cost for your rental starting on " + pickUpDate + " and ending on " + pickUpDate.plusDays(daysOfRental));
        System.out.printf("is $%.2f", totalPrice);
        }



    }

    public static double handleOptions ( String wantTag, String wantGPS, String wantAssist) {
        double tagPrice = 3.95, gpsPrice = 2.95, assistPrice = 3.95;
        double optionsCost = 0;

        if (wantTag.equals("yes")) {
            optionsCost += tagPrice;
        }
       if (wantGPS.equals("yes")) {
           optionsCost += gpsPrice;
       }
       if (wantAssist.equals("yes")) {
           optionsCost += assistPrice;
       }

        return optionsCost;
    }

    public static double carRental (int daysOfRental, double basicRental, String wantTag, String wantGPS, String wantAssist, int age) {

        double surcharge = 0.30;
        double optionsCost = handleOptions(wantTag, wantGPS, wantAssist);

        double totalPrice = (basicRental + optionsCost) * daysOfRental;

        if (age < 25) {
            totalPrice = ((basicRental * surcharge) + optionsCost) * daysOfRental;
            System.out.println("You are under 25. 30% surcharge applied");
        } else {
            System.out.println("You are over 25. No surcharge applied.");
        }

        return totalPrice;
    }
}

public void main() {
}
