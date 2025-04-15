package com.pluralsight;

public class Methods {
    public static void main(String[] args) {
        brushYourTeeth();
        String favShow = favoriteShow();


        int num1 = 12;
        int num2 = 25;
        int sum = add(num1, num2);
        System.out.printf("My favorite show is %n", favShow);
        System.out.printf("%d + %d = %d", num1, num2, sum);

    }

    public static void brushYourTeeth () {
        System.out.println("Step 1: Put your tooth brush under the water.");
        System.out.println("Step 2: Put toothpaste on your toothbrush");
        System.out.println("Step 3: Brush your teeth for about 1-2 minutes and rinse");
    }

    public static String favoriteShow() {
        String favShow = "The Office";
        return favShow;
    }

    public static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
