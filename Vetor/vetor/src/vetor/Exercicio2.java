package vetor;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=5;
		int j;
		int [] A= new int[TAM];
		
		for(int i=0; i<TAM; i++) {
		  System.out.println("Digite o "+(i+1)+" valor do Vetor A ");
		  A[i]=in.nextInt();
		}
 
		for(int i=0; i<TAM; i++) {
			System.out.println("\nVetor A (Tabuada)");
			for(j=1; j<=10; j++) {
			 System.out.println(A[i] + "x" + j + "=" + (A[i] * j));
		}
	}
		in.close();

}
}