package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		
		do {
			System.out.println("Você quer sair?");
			texto = entrada.nextLine();
			
		} while (!texto.equalsIgnoreCase("sim"));

		System.out.println("Você conseguiu sair!");
		entrada.close();
	}

}
