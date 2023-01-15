package controle;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		/*
		 * Refatorar o exercício 04, utilizando a estrutura switch.
		 */
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número:");
		int numero = entrada.nextInt();
		
		switch (numero) {
		case 2: case 3: case 5: case 7:
			System.out.println("Não é primo");
			break;
		default:
			System.out.println("É primo.");
		}

		entrada.close();
	}

}
