package lesson3;

public class Calc {
    public static void printResult(double dodanok1, double dodanok2,String simbol){
        boolean lampochka = true;
        double result=0.0;
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
