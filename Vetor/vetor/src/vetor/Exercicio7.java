package vetor;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 15;
		
		int[] A = new int[TAM];
		int[] B = new int[TAM];
		        
		        
		System.out.println("Escreva 15 numeros");
		for (int i = 0; i < TAM; i++) {
			A[i] = in.nextInt();
			}
		
		for (int i = 0; i < TAM; i++) {
			int fat = 1;
		    for (int j = 1; j <= A[i]; j++) {
		    	fat *= j;
		    }
		    B[i] = fat;
		    }
		
		
		System.out.println("\nVetor B (fatoriais de A):");
		for (int i = 0; i < TAM; i++) {
			System.out.println("O fatorial de " + A[i] + " é" + " = " + B[i]);
			}

		        in.close();

	}

}
