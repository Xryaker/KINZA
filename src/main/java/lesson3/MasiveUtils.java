package lesson3;

public class MasiveUtils {
    public static void sumMassive(int[] massive){
        int result=0;
        for (int i=0;i<massive.length;i++){
            result=result+massive[i];
        }
        System.out.println("res "+result);
    }
}
