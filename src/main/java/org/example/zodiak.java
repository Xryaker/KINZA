package org.example;

import java.util.Scanner;

public class zodiak {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int d=0,m,y;
        String znak;
        System.out.println("vvedite mounth");
        m=scanner.nextInt();
        if(m<1&&m>12){
            System.out.println("Eroor ");
            System.exit(0);
        }
        switch (m){
            case 1: if (d<1&&d>31){
                System.out.println("Error");
                System.exit(0);
            }
        }
            switch (m){
                case 1: if(d>=20){
                    System.out.println("scorpion");
                }else{
                    System.out.println("vodoley");
                }
            }

    }
}
