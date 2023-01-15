package fundamentos;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		/*
		 * Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC
		 * 
		 * Formula IMC - peso / altura²
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu peso:");
		int peso = entrada.nextInt();
		System.out.println("Digite a sua altura:");
		Double altura = entrada.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.println("O IMC é " + imc);
		
		entrada.close();
	}

}
