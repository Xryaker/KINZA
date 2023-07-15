package org.example;

import java.util.Scanner;

public class Lesson01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dodanok1, dodanok2;
        double result = 0;
        System.out.print("Vedite dodanok1 : ");
        dodanok1 = scanner.nextInt();
        System.out.print("Vedite dodanok2 : ");
        dodanok2 = scanner.nextInt();
        System.out.print("Vedite simbol : ");
        boolean lampochka = true;
        String simbol;
        simbol = scanner.next();
        if (simbol.equals("+")) {
            result = dodanok1 + dodanok2;
        }
        if (simbol.equals("-")) {
            result = dodanok1 - dodanok2;
        }
        if (simbol.equals("*")) {
            result = dodanok1 * dodanok2;
        }
        if (simbol.equals("/")) {
            if (dodanok2 == 0) {
                System.out.println("ERROR");
                lampochka=false;
            } else {
                result = (double) dodanok1 / dodanok2;
            }
        }
        if (lampochka) {
            System.out.println(dodanok1 + " " + simbol + " " + dodanok2 + " = " + result);
        }
    }
}
