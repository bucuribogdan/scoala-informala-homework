package com.sci.bv.tema9Ianuarie;

/**
 * Returns the validt time or it will print the error "Incorrect time!".
 * This program requires from the user two numbers, hour (hh) and minutes (mm).
 * If these are valid, the following message "The time is hh: mm now." will be displayed.
 * If the entered data is not valid, the following error will be displayed "Incorrect time!".
 *
 *
 * @param  h,hh  the given number (hour)
 * @param  m,mm  the given number (minutes)
 * @return    the message "The time is hh:mm now." if is a valid time
 * @return    error "Incorrect time!" if is an incorrect time
 */

import java.util.Scanner;

public class Problema3 {
    static int Hour(int h)
    { if(h>=0 && h<=23)
            return h;
        else return -1;
    }
    static int Minute(int m)
    {if(m>=0 && m<=59)
    return m;
    else return -1;}

    public static void main(String[] args) {
        System.out.println( "What time is it?");
        Scanner n = new Scanner(System.in);
        int hh = n.nextInt();
        Scanner v = new Scanner(System.in);
        int mm = v.nextInt();
        Hour(hh);
        Minute(mm);
        if(Hour(hh)>-1 && Minute(mm)>-1 && Minute(mm)<10)
            System.out.println( "The time is "+Hour(hh)+":0"+Minute(mm)+" now.");
        else if (Hour(hh)>-1 && Minute(mm)>-1 && Minute(mm)>=10)
            System.out.println( "The time is "+Hour(hh)+":"+Minute(mm)+" now.");
        else System.out.println(" Incorrect time!");
    }

}

