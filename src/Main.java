package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double weight;
        double height;
        System.out.print("Your height:");
        height = num.nextInt();
        System.out.print("Your weight:");
        weight = num.nextInt();
        double total = weight / ((height / 100) * (height / 100));
        System.out.println(total);
        System.out.print("Underweight = <18.5\n");
        System.out.print("Normal weight = 18.5–24.9\n");
        System.out.print("Overweight = 25–29.9\n");
        System.out.print("Obesity = BMI of 30 or greate");
    }
}