import java.util.Random;

public class Ex3_RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];

        for (int i =0; i<array.length; i++){
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }
        System.out.println("\nsucessores: ");
        for (int j : array) {
            System.out.println(j + 1);
        }
    }
}
