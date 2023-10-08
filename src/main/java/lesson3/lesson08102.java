package lesson3;

public class lesson08102 {
    public static void main(String[] args) {
        int t=205,n=16;
        method1(t,20);
        System.out.println(method2(20));
    }
    public static void method1(int vasiliy,int nikolay){
        System.out.println(vasiliy*nikolay);
    }
    public static int method2(int v){
        int res=v*250;
        return res;
    }
}
