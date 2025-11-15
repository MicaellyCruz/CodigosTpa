package vetor;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        final int TAM = 10;
        int[] A = new int[TAM];

        System.out.println("Escreva 10 numeros");
        for (int i = 0; i < TAM; i++) {
            A[i] = in.nextInt();
        }

        boolean palindromo = true; 

        for (int i = 0; i < TAM / 2; i++) {
            if (A[i] != A[TAM - 1 - i]) {
                palindromo = false; 
                break;
            }
        }

        System.out.println("\nVetorA (Resultado)");
        if (palindromo) {
            System.out.println("O vetor é um palíndromo.");
        } else {
            System.out.println("O vetor não é um palíndromo.");
        }

        in.close();

	}

}
