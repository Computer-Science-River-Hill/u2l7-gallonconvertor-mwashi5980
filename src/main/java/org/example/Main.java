package org.example; //DO NOT DELETE
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of gallons: ");
        double gallons = input.nextInt();
        System.out.print("In "+gallons+" gallons there are:");
        input.close();
        double quarts = gallons*4;
        double pints = gallons*8;
        double cups = gallons*16;
        double tablespoons = gallons*256;
        System.out.println(quarts+" quarts");
        System.out.println(pints+" pints");
        System.out.println(cups+" cups");
        System.out.println(tablespoons+ " tablespoons");
    }
}