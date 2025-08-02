package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt(); //Usuário escolhe a quantidade de números a serem adicionados.
        int[] vect = new int[n]; //Criar uma lista para armazenar os números

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: "); // Usuário digita os números de acordo com a quantidade escolhida.
            vect[i] = sc.nextInt(); // Os números são armazenados no vetor.
        }

        System.out.println("\nNÚMEROS NEGATIVOS: ");
        for (int i = 0; i < n; i++) {
            if (vect[i] < 0.0) {
                System.out.println(vect[i]); // O for percorre o vetor e se o número for menor que zero ele imprime.
            }
        }

        sc.close();
    }
}
