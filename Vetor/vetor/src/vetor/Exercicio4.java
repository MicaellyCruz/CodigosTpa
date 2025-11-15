package vetor;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM = 10;
				int A[] = new int[TAM];
		int B[] = new int[100];

		
        for(int i = 0; i < TAM; i++) {
            System.out.print("Digite o " + i + " valor ");
            A[i] = in.nextInt();
        }

       
        for(int i = 0; i < 10; i++) {

            System.out.println("\nVetor A[" + i + "] = " + A[i]);
            System.out.print("Pares até " + A[i] + ": ");

            int cont = 0; 

            
            for(int j = 0; j <= A[i]; j++) {
                if(j % 2 == 0) {
                    B[cont] = j; 
                    cont++;
                }
            }

         
            for(int k = 0; k < cont; k++) {
                System.out.print(B[k] + " ");
            }

            System.out.println();
        }

        in.close();

	}

}
