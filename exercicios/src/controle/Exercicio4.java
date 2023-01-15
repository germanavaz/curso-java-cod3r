package controle;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		/*
		 * Criar um programa que receba um número e diga se ele é um número primo.
		 * 
		 * Como saber se um número é primo? 
		 * Um número NÃO é primo se for divisivel por 2, 3, 5, ou 7
		 */
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número:");
		double numero = entrada.nextDouble();
		
		if (numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0 || numero % 7 == 0) {
			System.out.printf("O número %.1f não é primo!", numero);
		} else {
			System.out.printf("O número %.1f é primo!", numero);
		}
		

		entrada.close();
	}

}
