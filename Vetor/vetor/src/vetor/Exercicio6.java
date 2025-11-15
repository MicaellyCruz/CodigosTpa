package vetor;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM = 11;
        int A[] = new int[TAM];
        
        A[0] = 1; 

        
        for (int i = 1; i < TAM; i++) {
            A[i] = A[i - 1] * 2;
        }

        
        for (int i = 0; i < TAM; i++) {
            System.out.println("A[" + i + "] = " + A[i]);

	}

	}

}
