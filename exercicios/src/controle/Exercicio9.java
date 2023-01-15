package controle;

import java.util.Scanner;

public class Exercicio9 {
	
	public static void main(String[] args) {
		
		/*
		 *  Crie um programa que recebe 10 valores 
		 *  e ao final imprima o maior número.
		 */
		
		Scanner entrada = new Scanner(System.in);

		int contador = 1;
		int controle = 0;
		
		while (contador <= 10) {
			
			System.out.println("Digite um número");
			int numero = entrada.nextInt();
			if (numero > controle) {
				controle = numero;
				contador++;
			} 
		}
		
		System.out.println("O maior número inserido foi " + controle);

		entrada.close();
	}

}
