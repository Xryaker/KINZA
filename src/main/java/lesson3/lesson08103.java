package lesson3;

import java.util.Scanner;

public class lesson08103 {
    public static void main(String[] args) {
        int size;
        Scanner scanner=new Scanner(System.in);
        System.out.println("vvedote razmer massiva");
        size=scanner.nextInt();
        int mass[]=new int[size];
        for(int i=0;i<mass.length;i++){
            System.out.println("veddite "+(i+1)+" chislo");
            mass[i]=scanner.nextInt();
        }
        MasiveUtils.sumMassive(mass);

    }

}
