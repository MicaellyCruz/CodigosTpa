package exercicios;
import java.util.*;
public class calcularImc {

	public static void main(String[] args) {
		
		double peso, altura, quadradoAltura, imc;
		
		altura = 1.50;
		peso = 100;
		
		quadradoAltura = (altura*altura);
		imc = (peso/quadradoAltura);
		
		System.out.println ("O IMC é " + imc);

	}

}
