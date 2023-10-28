package l2810;

public class MassiveUtils {
    public static void sumMass(int[] m){
        int sum=0;
        System.out.println("razmer massiva = "+m.length);
        for (int i=0;i<m.length;i++){
            sum=sum+m[i];
        }
        System.out.println(sum);
    }
    public static void sumMass(int[] m,int k){
        int sum=0;
        System.out.println("razmer massiva = "+m.length);
        for (int i=0;i<m.length;i++){
            sum=sum+m[i];
        }
        System.out.println(sum*k);
    }
}
