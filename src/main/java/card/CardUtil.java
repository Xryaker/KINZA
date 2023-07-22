package card;

import java.util.Scanner;

public class CardUtil {
    private static int[] parseStringToIntegerMassive(String str){
       int[] ints=new int[16];
        for(int i=0;i<16;i++){
            char simvol=str.charAt(i);
     //       System.out.println(simvol);
            String temp=String.valueOf(simvol);
            int t=Integer.parseInt(temp);
            ints[i]=t;
            // numbers[i]=Integer.parseInt(String.valueOf(cleanCardNumber.charAt(i)));
        }
        return ints;
    }
    private static String enterCardNum(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter card number: ");
        String cardnumber=scanner.nextLine();
        return cardnumber.replace(" ","");
    }
    private static String getSystemName(int firstNumber){
        //n.kdskasdnlk
        return "VIZA";
    }
    private static int[] firstStep(int[] mass){
        for(int i=0;i<mass.length;i++){
            if(i%2==0) {
                mass[i] = mass[i] * 2;
            }
        }
        return mass;

    }
    private static int[] secondStep(int[] resStep1){

        for (int t=0;t<resStep1.length;t++) {
            if (resStep1[t]>9){
               resStep1[t]=resStep1[t]-9;
            }
        }
        return resStep1;
    }
    private static void chek(int[] resStep2,int control){
        int sum=0;
        for(int i=0;i<resStep2.length;i++){
            sum=sum+resStep2[i];
        }
        if (sum%10!=0){
            if((sum/10)+1==control){
                System.out.println("Card number is checked true");
            }else {
                System.out.println("ERROR OPlease destroy this card");
            }
        }else{
            if(sum/10==control){
                System.out.println("Card number is checked true ");
            } else {
                System.out.println("ERROR OPlease destroy this card "+sum);
            }
        }
    }
    public static void cardCheck(){
        int[] numbers = CardUtil.parseStringToIntegerMassive(CardUtil.enterCardNum());
        System.out.println(CardUtil.getSystemName(numbers[0]));
        int[] resStep1 = CardUtil.firstStep(numbers);
        int[] resStep2 = CardUtil.secondStep(resStep1);
        CardUtil.chek(resStep2, numbers[numbers.length - 1]);
    }
    public static void cardCheck(String number){
        int[] numbers = CardUtil.parseStringToIntegerMassive(number.replace(" ",""));
        System.out.println(CardUtil.getSystemName(numbers[0]));
        int[] resStep1 = CardUtil.firstStep(numbers);
        int[] resStep2 = CardUtil.secondStep(resStep1);
        CardUtil.chek(resStep2, numbers[numbers.length - 1]);
    }
}
