/*
 *  UCF COP3330 Fall 2021 Calendar Class file
 *  Copyright 2021 Celina Alzenor
 */

package org.example;

import java.util.Scanner;

public class Calendar {
    private final int month;

    //asks user for the number of the month they
    public Calendar()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of the month: ");
        this.month = input.nextInt();

    }

    public void findMonth()
    {
        String month = null;

        //prints the corresponding month using a switch case
        switch (this.month) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
        }

        System.out.print("The name of the month is " +month+".");
    }
}
