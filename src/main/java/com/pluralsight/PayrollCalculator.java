package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    static String userName;
    static double hoursWorked;
    static double ratePerHour;
    static double pay;
    static double overtimePay;
    static Scanner userInput = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("===Welcome to the Payroll Calculator!===");
        printPayrollDetails();
        hours();

    }

    public static void printPayrollDetails() {

        //Scanner to ask for userName
        System.out.print("Enter your name: ");
        userName = userInput.nextLine();

        //Ask for hours worked
        System.out.print("\nEnter the number of hours worked: ");
        hoursWorked = userInput.nextInt();

        //Ask for rate per hour
        System.out.print("Enter the rate per hour: $");
        ratePerHour = userInput.nextDouble();

        System.out.printf("Hello %s .\n",
                userName
        );
    }
    public static void printOvertimePay() {

        //overtime pay calculation
        overtimePay = (hoursWorked - 40) * (ratePerHour * 1.5);
        pay = 40 * ratePerHour;
        System.out.println("You worked overtime!");
        System.out.println("You get paid time and a half for the extra hours.");
        System.out.printf("Your pay is $%.2f\n",
                pay + overtimePay
        );

    }

    public static void regularPay() {

        pay = hoursWorked * ratePerHour;
        System.out.printf("Your pay is $%.2f\n",
                pay
        );

    }
    public static void hours() {
        if (hoursWorked > 40) {
            printOvertimePay();
        }
        else {
            regularPay();
        }
    }
}
