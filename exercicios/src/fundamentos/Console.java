package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.printf("Megasena: %d %d %d %d %d %d \n ", 1, 2, 3, 4, 5, 6); //print formatado \n ou %n= quebra de linha
		
		System.out.printf("Salário: %.1f \n ", 1234.5678);
		
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome:");
		String nome = entrada.nextLine();
		System.out.println("Nome = " + nome);
		
		entrada.close();
	}

}
