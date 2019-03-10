package com.sci.bv.tema9Ianuarie;

/**
 * Returns the validt time or it will print the error "Incorrect time!".
 * This program requires from the user two numbers, hour (hh) and minutes (mm).
 * If these are valid, the following message "The time is hh: mm now." will be displayed.
 * If the entered data is not valid, the following error will be displayed "Incorrect time!".
 *
 * @param h,hh  the given number (hour)
 * @param m,mm  the given number (minutes)
 * @return the message "The time is hh:mm now." if is a valid time
 * @return error "Incorrect time!" if is an incorrect time
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problema3 {
    static int Hour(int h) throws IllegalArgumentException {
        if (h < 0 || h > 23) {
            throw new IllegalArgumentException("Incorrect hour!");
        } else return h;
    }

    static int Minute(int m) {
        if (m < 0 || m > 59) {
            throw new IllegalArgumentException("Incorrect minute!");
        } else return m;
    }

    public static void main(String[] args) {
        try {
            System.out.println("What time is it? Input first the hour and after minutes:");
            Scanner n = new Scanner(System.in);
            int hh = n.nextInt();
            int mm = n.nextInt();
            if (Minute(mm) < 10 && Hour(hh) < 10) {
                System.out.println("The time is 0" + Hour(hh) + ":0" + Minute(mm) + " now.");
            } else if (Minute(mm) >= 10 && Hour(hh) > 9) {
                System.out.println("The time is " + Hour(hh) + ":" + Minute(mm) + " now.");
            } else if (Minute(mm) < 10 && Hour(hh) > 9) {
                System.out.println("The time is " + Hour(hh) + ":0" + Minute(mm) + " now.");
            } else if (Minute(mm) > 9 && Hour(hh) < 10) {
                System.out.println("The time is 0" + Hour(hh) + ":" + Minute(mm) + " now.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("The input must be an int!");
        }
    }

}

