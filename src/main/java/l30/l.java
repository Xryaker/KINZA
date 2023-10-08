package l30;

public class l {
    public static void main(String[] args) {
        int[] mass = new int[100];  // |0|1|2|
        mass[0] = 11;
        System.out.println(mass[0]);
        if (mass[0] > 9) {
            System.out.println("hello");
        }
        mass[1] = 4;
        if (mass[1] < 11) {
            System.out.println("hello");
        }
        mass[0] = 10;
        System.out.println("size = " + mass.length);

        int tv = mass.length;
        System.out.println(tv);
        System.out.println(mass[mass.length - 1]);

        for(int i=0;i<10;i++){

            System.out.println("hello "+i );

        }
        System.out.println("=============================");
        for(int t=0;t<mass.length;t++){
            mass[t]=t*2;
        }
        for(int t=0;t<mass.length;t++){
            System.out.println(mass[t]);
        }
    }
}
