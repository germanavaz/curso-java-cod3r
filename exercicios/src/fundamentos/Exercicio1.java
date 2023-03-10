package fundamentos;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		/*
		 * Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
		 * 
		 * Formula: (F - 32) * 5 / 9 = C
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit:");
		int fahrenheit = entrada.nextInt();
		
		final int AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.printf("A temperatura é %.2f °C", celsius);
		entrada.close();
	}

}
