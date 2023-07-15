package org.example;

import java.util.Arrays;

public class lesson21 {
    public static void main(String[] args) {
        int[] numbers=new int[]{10,15,47,63,78,-15,45662,555,77,666,555,777,888};
        System.out.println(numbers[0]);
        numbers[0]=15;
        System.out.println(numbers[0]);
        numbers[7]=34;
        numbers[7]=25;
        if(numbers[5]>=0){
            numbers[5]=123654789;
        }else {
            numbers[5]=0;
        }
        System.out.println(Arrays.toString(numbers));

    }
}
