package l2110;

public class L1 {
    public static void main(String[] args) {
        int number, result;
     String fam="Shevchenko";
        number = 6;
        result = number * 56;
        System.out.println(result);
        vasiliy(10);
        result=nikolay(50);
        result=result*100;
        System.out.println(result);
        printInfo();
        System.out.println(nikolay(6));
        System.out.println(KinzaInfo.print("vasiliy","Shevchenko",5));

    }

    public static void vasiliy(int chislo) {
        System.out.println(chislo*56);
    }
    public static int nikolay(int ch){
        int result;
        result=ch*56;
        return result;
    }
    public static void printInfo(){
        System.out.println("Shevchenko Vasiliy");
    }

}
