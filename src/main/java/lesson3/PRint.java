package lesson3;

public class PRint {
    public static void printName(){
        System.out.println("Vasiliy");
    }
    public static void printName(String name){
        System.out.println("========== super "+name+" ========");
    }
    public static String printName(String name,String family){
        return "========== super "+name+" "+family+" ========";
    }
}
