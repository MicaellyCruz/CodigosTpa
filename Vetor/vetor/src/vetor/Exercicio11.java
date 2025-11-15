package vetor;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    final int TAM=10;
	    int [] A = new int[TAM];
	    
	    for(int i=0; i<TAM; i++) {
	    	System.out.println("Digitem o " +(i+1)+" valor do vetor A");
	    	A[i] = in.nextInt();
	    	
	    }
	    
	    System.out.print("\nA = ");
	    for(int i=0; i<TAM; i++) {
	    	System.out.print(A[i]+ " ");
	    }
	    
        System.out.println("\nVetor A \nDigite o valor X que deseja buscar:");
        int x = in.nextInt();
 
        int cont = 0;
 
        for(int i = 0; i < TAM; i++) {
            if(A[i] == x) {
                cont = cont + 1;
            }
        }
 
        if(cont > 0) {
            System.out.println("O valor " + x + " contém no vetor");
        } else {
            System.out.println("O valor " + x + " não contém no vetor");
        }

	}

}
