package vetor;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        final int TAM = 10;

        int [] A = new int[TAM];
        int [] B = new int[TAM];
        int [] C = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + " valor do vetor A:");
            A[i] = in.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + " valor do vetor B:");
            B[i] = in.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            if (A[i] > B[i]) {
                C[i] = 1;
            } else if (A[i] == B[i]) {
                C[i] = 0;
            } else {
                C[i] = -1;
            }
        }

        for (int i = 0; i < TAM; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }

	}

}
