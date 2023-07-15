package org.example;

import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        /*
         *
         *
         *
         *
         *
         * */
        Scanner scanner = new Scanner(System.in);
        double dodanok1, dodanok2;
        double result = 0;
        System.out.print("Vedite dodanok1 : ");
        dodanok1 = scanner.nextDouble();
        System.out.print("Vedite dodanok2 : ");
        dodanok2 = scanner.nextDouble();
        System.out.print("Vedite simbol : ");
        boolean lampochka = true;
        String simbol;
        simbol = scanner.next();
        switch (simbol) {//start switch
            case "+":
                result = dodanok1 + dodanok2;
                break;
            case "-":
                result = dodanok1 - dodanok2;
                break;
            case "/":
                if (dodanok2 == 0) {
                    System.out.println("ERROR");
                    lampochka = false;
                } else {
                    result = (double) dodanok1 / dodanok2;
                }
                break;
            default:
                System.out.println("Error simbol not found");
                lampochka=false;
        }// end switch
        if (lampochka) {
            System.out.println(dodanok1 + " " + simbol + " " + dodanok2 + " = " + result);
        }
    }
}
