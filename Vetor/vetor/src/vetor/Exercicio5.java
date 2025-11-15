package vetor;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM = 10;

        int A[] = new int[TAM];
        int B[] = new int[100]; 

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite A[" + i + "]: ");
            A[i] = in.nextInt();
        }

        for (int i = 0; i < TAM; i++) {

            System.out.println("\nVetor A[" + i + "] = " + A[i]);
            System.out.print("Divisores: ");

            int cont = 0; 

            for (int j = 1; j <= A[i]; j++) {
                if (A[i] % j == 0) {
                    B[cont] = j;
                    cont++;
                }
            }

            for (int k = 0; k < cont; k++) {
                System.out.print(B[k] + " ");
            }

            System.out.println();
        }

        in.close();

	}

}
