package com.sci.bv.tema9Ianuarie;

/**
 *Returns converted degrees from Fahrenheit to Celsius.
 *This program returns body degrees from Fahrenheit degrees in Celsius degrees.
 *The program read the Fahrenheit degrees from the keyboard, then convert them to
 *Celsius degrees and it will be displayed on the screen.
 *If the body temperature is higher than 37 degrees, the computer will indicate the following error "You are ill!".
 *
 * @param  x  given the number of Fahrenheit degrees
 * @return    body degrees from Fahrenheit degrees in degrees Celsius if the body temperature is lower than 37 degrees
 * @return    error "You are ill!" if body temperature is higher than 37 degrees
 */

import java.util.Scanner;

public class Problema2 {

        static double x ;
        public static void main(String[] args)
        {
        System.out.println("Write down the body temperature, measured in Fahrenheit degrees");
        Scanner n = new Scanner(System.in);
        double x = n.nextInt();
        getCelsius(x);
        if (getCelsius(x)>37)
            System.out.println("You are ill!");
        else System.out.println("Your body temperature in Celsius degrees is "+ getCelsius(x));
    }
        static double getCelsius(double x) {
        x = ((x-32)/1.8);
            return x;
        }
    }
