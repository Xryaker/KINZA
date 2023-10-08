package lesson3;

import java.util.Scanner;

public class lesson0810 {
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
        for (int i=0;i<mass.length;i++){
            System.out.print(" "+mass[i]);
        }
        System.out.println("");
        for(int i= mass.length-1;i>=0;i--){
            System.out.print(" "+mass[i]);
        }
        int t=10;
        while (t>100){
            System.out.println(t);
            t=t+1;
        }
        do{
            System.out.println("hello");
        }while (t>100);
    }
}
