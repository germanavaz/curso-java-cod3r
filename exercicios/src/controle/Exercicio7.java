package controle;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		/*
		 * Criar um programa que enquanto estiver recebendo números positivos, 
		 * imprime no console a soma dos números inseridos, 
		 * caso receba um número negativo, encerre o programa. 
		 * Tente utilizar a estrutura do while.
		 */
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o número:");
		int numero = entrada.nextInt();
		int soma = 0;
		
		while (numero % 2 == 0) {
			soma += numero;
			System.out.println("A soma até agora é " + soma);
			System.out.println("Digite mais um número");
			numero = entrada.nextInt();
		}
		
		System.out.println("Fim.");

		entrada.close();
	}

}
