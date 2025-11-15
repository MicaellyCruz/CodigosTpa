package exercicios;
import java.util.*;
public class oleo {

	public static void main(String[] args) {
		
		double raio, quadrado, volume, altura, multiplicacao;
		
		raio = 24;
		altura = 40;
		
		quadrado = (raio*raio);
		multiplicacao = (3.14*quadrado);
		volume = (multiplicacao*altura);

		System.out.println ("O volume da lata de oléo é " + volume);

	}

}
