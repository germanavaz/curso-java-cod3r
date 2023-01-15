package fundamentos;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		/*
		 * Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual valor da base:");
		int base = entrada.nextInt();
		System.out.println("Qual valor da altura:");
		int altura = entrada.nextInt();
		
		double cima = base * altura;
		double triangulo = cima / 2;
		
		System.out.println("A área do triângulo é " + triangulo);
		
		
		entrada.close();
	}

}
