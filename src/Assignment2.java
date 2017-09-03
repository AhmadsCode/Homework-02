/*
 * @author Ahmad Wahedi
 * CSC 201-004N
 * Assignment 2
 * Problem 2.4
 * (Convert pounds into kilograms)Write a program that converts pounds into kilograms.
 *  The program prompts the user to enter a number in pounds, converts it to kilograms,
 *  and displays the result. One pound is 0.454 kilograms.
 */

import java.util.Scanner;

public class AssignmentTwo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);   //Create new Scanner object
        final double Kilos_Per_Pound = 0.454;     //Constant value

        System.out.println("Enter a number in pounds: ");    //Prompts User

        double pounds = input.nextDouble();       //User input assigned to Pounds
        double kilograms = pounds * Kilos_Per_Pound;

        System.out.println(pounds + " pounds is " + kilograms + " Kilograms");  //Displays the result
    }
}
