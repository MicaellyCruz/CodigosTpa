package vetor;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		
		final int TAM = 10;

        int[] A = new int[TAM];
        int[] B = new int[TAM];
        int[] C = new int[TAM]; 
        int contC = 0;
        
        for (int i = 0; i < TAM; i++) {
            System.out.print("Escreva o " + (i + 1) + " valor do vetor A: ");
            A[i] = in.nextInt();

            System.out.print("Escreva o " + (i + 1) + " valor do vetor B: ");
            B[i] = in.nextInt();
            System.out.println();
        }

        for (int i = 0; i < TAM; i++) {
            for (int bo = 0; bo < TAM; bo++) { 
                if (A[i] == B[bo]) {
                    boolean jaExiste = false;
                    for (int k = 0; k < contC; k++) {
                        if (C[k] == A[i]) {
                            jaExiste = true;
                            break;
                        }
                    }
                    if (!jaExiste) {
                        C[contC] = A[i];
                        contC++;
                    }
                    break; 
                }
            }
        }

       
        System.out.println("\nVetor C (Interseção) ");
        if (contC == 0) {
            System.out.println("Não existe valores em comum");
        } else {
            for (int i = 0; i < contC; i++) {
                System.out.println("C[" + i + "] = " + C[i]);
            }
        }

        in.close();

	}

}
