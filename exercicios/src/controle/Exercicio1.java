package controle;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		/*
		 * Criar um programa que receba um número e 
		 * verifique se ele está entre 0 e 10 e é par;
		 */
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número:");
		double numero = entrada.nextDouble();
		
		if (numero >= 0 && numero <= 10 && numero % 2 == 0) {
			System.out.printf("O número %.1f está entre 0 e 10 e é par!", numero);
		} else {
			System.out.printf("O número %.1f não está entre 0 e 10 ou não é par.", numero);
		}

		entrada.close();
	}

}
