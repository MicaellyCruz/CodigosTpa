package vetor;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM = 10;
        int[] A = new int[TAM];
        
        System.out.println("Escreva 10 números inteiros");
        for (int i = 0; i < 10; i++) {
            A[i] = in.nextInt();
        }

        System.out.println("\nVetor A (numeros primos) ");
        for (int i = 0; i < 10; i++) {
            int num = A[i];
            boolean primo = true;

            if (num <= 1) {
                primo = false;
            } else {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                System.out.println(num + " é primo");
            } else {
                System.out.println(num + " não é primo");
            }
        }

        in.close();

	}

}
