package org.example;

public class lesson23 {
    public static void main(String[] args) {
        int[] numbers = new int[]{10, 15, 47, 63, 78, -15, 45662, 555, 77, 666, 555, 777, 888};
//        for (int i = 2; i <= 10; i = i + 2) {
//            System.out.println(i + " = " + numbers[i]);
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println("");
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > 10 && numbers[i] < 100){
//                System.out.println(numbers[i]);
//            }
//        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2==0){
                System.out.println(numbers[i]);
            }
        }
    }
}
