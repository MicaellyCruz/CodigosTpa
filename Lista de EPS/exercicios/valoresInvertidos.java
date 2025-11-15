package exercicios;
import java.util.*;
public class valoresInvertidos {

	public static void main(String[] args) {
        
        double A, B, C;
        
        A = 07;
        B = 10;

        System.out.println("Valores antes da troca:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        C = A;
        A = B;
        B = C;

       
        System.out.println("Valores depois da troca:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

	}

}
