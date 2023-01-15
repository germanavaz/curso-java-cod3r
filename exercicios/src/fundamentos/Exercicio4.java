package fundamentos;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		 /*
		  * Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
		  */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número:");
		double numero = entrada.nextDouble();
		
		double quadrado = Math.pow(numero, 2);
		double cubo = Math.pow(numero, 3);
		
		System.out.printf(" O número %.1f ao quadrado é %.1f e ao cubo é %.1f.", numero, quadrado, cubo);
		
		
		entrada.close();
	}

}
