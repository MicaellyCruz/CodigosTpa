package vetor;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        final int TAM = 10;
        int A[] = new int[TAM];
        int B[] = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.print("Escreva A[" + i + "]: ");
            A[i] = in.nextInt();
        }
        
        for (int i = 0; i < TAM; i++) {
            int soma = 0;

            for (int j = i; j < TAM; j++) {
                soma += A[j];
            }

            B[i] = soma;
        }

        System.out.println("\nVetor B ");
        for (int i = 0; i < TAM; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }

        in.close();

	}

}
