package com.sci.bv.tema9Ianuarie;

import java.util.Scanner;

public class Main {
    static int maximum;
    static int getMax(int a, int b)
    { if(a<b)
    maximum = b;
    return maximum;
    }

    public static void main(String[] args) {
        System.out.println("Write three numbers to compare and find the biggest ");
        Scanner n = new Scanner(System.in);
        maximum = n.nextInt();
        Scanner x = new Scanner(System.in);
        int b = x.nextInt();
        Scanner z = new Scanner(System.in);
        int c = z.nextInt();
        getMax(maximum,b);
        getMax(maximum,c);
        System.out.println("Biggest number is:"+ maximum);

    }
}
