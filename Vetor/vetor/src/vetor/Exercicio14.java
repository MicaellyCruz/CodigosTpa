package vetor;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
        int[] A = new int[TAM];
        int[] B = new int[TAM];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor A[" + i + "]: ");
            A[i] = in.nextInt();

            if (A[i] % 2 == 0) {
                B[i] = 1; 
            } else {
                B[i] = 0; 
            }
        }
        System.out.println("\nVetor B");
        for (int i = 0; i < 10; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }

        in.close();

	}

}
