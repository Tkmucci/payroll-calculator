package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {


        //Scanner to ask for userName
        Scanner theScanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = theScanner.nextLine();

        //Ask for hours worked
        System.out.print("Enter the number of hours worked: ");
        int hoursWorked = theScanner.nextInt();

        //Ask for rate per hour
        System.out.print("Enter the rate per hour: $");
        double ratePerHour = theScanner.nextDouble();

        //Calculate pay
        double pay = hoursWorked * ratePerHour;

        //overtime pay calculation
        double overtimePay = (hoursWorked - 40) * (ratePerHour * 1.5);

        //Display username and pay
        //If statement for overtime
        if (hoursWorked > 40) {
            pay = 40 * ratePerHour;
            System.out.println("You worked overtime!");
            System.out.println("You get paid time and a half for the extra hours.");
            System.out.printf("Hello %s your pay is $%.2f",
                    userName,
                    pay + overtimePay
            );
        }
        else {

            System.out.printf("Hello %s your pay is $%.2f .",
                    userName,
                    pay
            );

        }


    }

}
