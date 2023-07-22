package lesson3;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
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
        Calc.printResult(dodanok1,dodanok2,simbol);
    }
}
