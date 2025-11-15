package exercicios;
import java.util.*;
public class salario {

	public static void main(String[] args) {
		
		double bruto, salarioLiquido, dividido, porcentagem;
		
		bruto = 3018;
		dividido = (bruto/100);
		porcentagem = (dividido*14);
		salarioLiquido = (bruto - porcentagem );
		
		System.out.println ("O salario liquido é " + salarioLiquido);

	}

}
