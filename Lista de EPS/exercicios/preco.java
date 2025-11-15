package exercicios;

public class preco {

	public static void main(String[] args) {

		double produto, venda, lucro;
		int quantidade;
		
		venda = 79.90;
		quantidade = 131;
		produto = 150.00;
		
		lucro = (produto - venda) * quantidade;
		
		System.out.println ("O lucro é " + lucro);
	}

}
