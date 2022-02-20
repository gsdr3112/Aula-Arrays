import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] vetor = new String[6];
//        String[] vogais = {"a", "e", "i", "o", "u"};
        int quantidadeConsoantes = 0;
        String letra;

        for (int count = 0; count <= 5; count++) {
            System.out.println("Vetor de 6 caracteres, digite o " + (count + 1) + "º caracter:");
            letra = scan.next();
            if (letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")
            ) continue;

            else {
                vetor[count] = letra;
                quantidadeConsoantes++;

            }
        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        for (String i :
                vetor) {
            if (i != null) System.out.println(i);
        }


    }
}
