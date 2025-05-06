package com.pluralsight;
import java.util.Random;

public class MathApp {

    public static void main(String[] args) {
//         Question 1:
        int bobSalary = 30000;
        int garySalary = 40000;
        int highestSalary;

        highestSalary = Math.max(bobSalary, garySalary);
        System.out.printf("Question 1: The highest salary is %d %n", highestSalary);

//        Question 2:
        int carPrice = 40000;
        int truckPrice = 90000;

//        Question 3:
        double area;
        double radius = 7.25;

        area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Question 3: the area of a circle is %f %n", area);

//        Question 4:
        double squareRoot;

        squareRoot = Math.sqrt(5.0);
        System.out.printf("Question 4: The square root is %f %n", squareRoot);

//        Question 5
        double distance;
        byte x1 = 5;
        byte x2 = 85;
        byte y1 = 10;
        byte y2 = 50;
        double xExpression;
        double yExpression;
        xExpression = Math.pow((x2 - x1), 2);
        yExpression = Math.pow((y2 - y1), 2);
        distance = Math.sqrt((xExpression + yExpression));
        System.out.printf("Question 5: The distance between (5, 10) and (85, 50) is %f %n", distance);

//        Question 6
        double abValue

        abValue = Math.abs(-3.8);
        System.out.printf("Question 6: The absolute value is %f %n", abValue);

//        Question 7:
        double randomNum;
        Random random = new Random ();
        randomNum = random.nextDouble(0, 1);
        System.out.printf("Question 7: Random Number is %f", randomNum);
        
    }
}
