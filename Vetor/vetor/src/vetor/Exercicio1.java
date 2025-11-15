package vetor;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 20;
		int[] A = new int[TAM];
		int[] B = new int[TAM];
		int numeiro = 0;
		
		System.out.println("Escreva 20 números:");
		for (int i = 0; i < TAM; i++) {
			A[i] = in.nextInt();
			}
		
		for (int i = 0; i < TAM; i++) {
			if (A[i] % 2 == 0) {
				B[numeiro] = A[i];
				numeiro++;
				}
			}
		for (int i = 0; i < TAM; i++) {
			if (A[i] % 2 != 0) {
				B[numeiro] = A[i];
				numeiro++;
				}
			}
		
		System.out.println("\nVetor B (primeiro os numeros pares depois os impares):");
		for (int i = 0; i < 20; i++) {
			System.out.print(B[i] + " ");
			}
		in.close();

	}

}
