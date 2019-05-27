package com.sci.bv.tema9Ianuarie;

/**
 * Returns the biggest number of three numbers.
 * Is created the method getMax() which calculates the biggest number from two numbers.
 * Three numbers are read from the keyboard, then the method is implemented on these numbers and the
 * biggest number is displayed on the screen.
 *
 * @param maximum,a,b are the given numbers which will be testedassertThrows(IllegalArgumentException.class, () -> timp.Minute(69));
 * @return the biggest number
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static int maximum;

    static int getMax(int a, int b) {
        if (a < b)
            maximum = b;
        return maximum;
    }

    public static void main(String[] args) {
        System.out.println("Write three numbers to compare and find the biggest ");
        try {
            Scanner n = new Scanner(System.in);
            maximum = n.nextInt();
            int b = n.nextInt();
            int c = n.nextInt();
            getMax(maximum, b);
            getMax(maximum, c);
            if ((b != c && b != maximum) || (c != b && c != maximum) || (maximum != c && b != maximum)) {
                System.out.println("Biggest number is:" + maximum);
            }
            if (maximum == b && maximum == c) {
                throw new NumberFormatException("The inputed numbers are equals !");
            }
        } catch (InputMismatchException e) {
            System.out.println("The input must be an int!");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }
}
