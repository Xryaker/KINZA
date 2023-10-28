package l2110;

public class KinzaInfo {
    public static String print(String name, String family,int age){
        return "Family * "+family+"\n"+"Name : "+name+"\n"+"My age : "+age+"\n\tYear : "+printBirthYear(age);
    }
    private static int printBirthYear(int age){
        return 2023-age;
    }
}
