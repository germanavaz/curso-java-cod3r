package controle;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		/*
		 * Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. 
		 * Armazene um numero aleatório em uma variável. 
		 * O Jogador tem 10 tentativas para adivinhar o número gerado. 
		 * Ao final de cada tentativa, imprima a quantidade de tentativas restantes, 
		 * e imprima se o número inserido é maior ou menor do que o número armazenado.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int aleatorio = 17;
		int contador = 1;
		
		System.out.println("Digite um número de 0 a 100:");
		int numero = entrada.nextInt();

		while (numero != aleatorio && contador < 10 && contador > 0) {
			
			if (numero > aleatorio) {
				System.out.println("O número inserido é maior que o armazenado.");
			} else {
				System.out.println("O número inserido é menor que o armazenado.");
			}
			int tentativasFaltam = 10 - contador;
			System.out.println("Faltam " + tentativasFaltam + " tentativas");
			numero = entrada.nextInt();
			contador++;
		}
		
		if (contador >= 10) {
			System.out.println("Suas chances acabaram!");
		} else if (numero == aleatorio){
			System.out.println("Parabéns, você acertou!");
		}

		entrada.close();
	}

}
