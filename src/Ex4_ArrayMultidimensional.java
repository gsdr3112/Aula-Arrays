import java.util.Arrays;
import java.util.Random;

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];

        for (int row = 0; row < matriz.length; row++) {
            for (int col = 0; col < matriz[row].length; col++) {
                matriz[row][col] = random.nextInt(9);
            }
        }
        for (int[] i:
             matriz) {
            System.out.println(Arrays.toString(i));
        }


    }

}
