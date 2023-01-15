package fundamentos;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		/*
		 * Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
		 * 
		 * Formula: 1,8C + 32 = F
		 * 
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius:");
		int celsius = entrada.nextInt();
		
		final int AJUSTE = 32;
		
		double fahrenheit = celsius * 1.8 + AJUSTE;
		
		System.out.printf("A temperatura é %.2f °F", fahrenheit);
		entrada.close();
	}

}
