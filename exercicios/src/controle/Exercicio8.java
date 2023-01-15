package controle;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		/*
		 * Criar um programa que receba uma palavra e 
		 * imprime no console letra por letra.
		 */
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite sua palavra:");
		String palavra = entrada.next();
		int contador = 0;
		
		while (palavra.length() != contador) {
			System.out.println(palavra.charAt(contador));
			contador++;
		}

		entrada.close();
	}

}
