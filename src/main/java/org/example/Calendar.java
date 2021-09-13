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
        //prints the corresponding month using a switch case
        switch(this.month)
        {
            case 1:
                System.out.println("The name of the month is January.");
                break;
            case 2:
                System.out.println("The name of the month is February.");
                break;
            case 3:
                System.out.println("The name of the month is March.");
                break;
            case 4:
                System.out.println("The name of the month is April.");
                break;
            case 5:
                System.out.println("The name of the month is May.");
                break;
            case 6:
                System.out.println("The name of the month is June.");
                break;
            case 7:
                System.out.println("The name of the month is July.");
                break;
            case 8:
                System.out.println("The name of the month is August.");
                break;
            case 9:
                System.out.println("The name of the month is September.");
                break;
            case 10:
                System.out.println("The name of the month is October.");
                break;
            case 11:
                System.out.println("The name of the month is November.");
                break;
            case 12:
                System.out.println("The name of the month is December.");
                break;
        }
    }
}
