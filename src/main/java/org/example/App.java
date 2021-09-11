package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */
public class App 
{
    public static void main( String[] args )
    {
        final int NUMITEMS = 3;
        final double TAXRATE = 0.055;
        Scanner sc = new Scanner(System.in);
        double price[] = new double[NUMITEMS];
        double qty[] = new double[NUMITEMS];
        double Tax, Total, subTotal = 0;

        for(int i = 0; i < NUMITEMS; i++)
        {
            System.out.print(String.format("Enter price of item %d: ", i + 1));
            price[i] = sc.nextDouble();

            System.out.print(String.format("Enter the quantity of item %d: ", i + 1));
            qty[i] = sc.nextDouble();
        }

        for(int i = 0; i < NUMITEMS; i++)
        {
            subTotal += price[i] * qty[i];
        }
        Tax = (subTotal * TAXRATE);
        Total = subTotal +  Tax;

        System.out.println(String.format(
                "Subtotal: $%.02f\n" +
                "Tax: $%.02f\n" +
                "Total: $%.02f\n", subTotal, Tax, Total));

    }
}
