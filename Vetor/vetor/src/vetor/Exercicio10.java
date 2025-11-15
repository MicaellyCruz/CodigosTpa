package vetor;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
        int j, contC;
 
        int [] A = new int[TAM];
        int [] B = new int[TAM];
        int [] C = new int[TAM];
 
        for(int i = 0; i < 10; i++) {
            System.out.println("Escreva o " + (i+1) + " valor");
            A[i] = in.nextInt();
        }
 
 
        for(int i = 0; i < 10; i++) {
            System.out.println("Escreva o " + (i+1) + "° valor");
            B[i] = in.nextInt();
        }
 
        contC = 0; 
 
        for(int i = 0; i < 10; i++) {
            boolean existe = false;
 
            for(j = 0; j < 10; j++) {
                if (A[i] == B[j]) {
                    existe = true;
                    break;
                }
            }
 
            if(!existe) {
                C[contC] = A[i];
                contC++;
            }
        }
 
        System.out.println("\nVetor C (elementos de A que não estão em B):");
        if(contC == 0) {
            System.out.println("Nenhum elemento — todos estavam em B.");
        } else {
            for(int i = 0; i < contC; i++) {
                System.out.print(C[i] + " ");
            }
        }
 
        in.close();


	}

}
