package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		/*
		 * Cálcular as médias das notas de uma turma.
		 * O usuário vai digitar uma nota de 0 a 10.
		 * Quando o usuário digitar uma nota válida, armazenar essa nota em uma variavel total.
		 * Outra variavel notasValidas contando quantas notas válidas foram digitadas.
		 * No final, total / notasValidas
		 * Para terminar de mostrar as notas, o usuário terá que digitar -1.
		 */

		Scanner entrada = new Scanner(System.in);

		int notasValidas = 0;
		double total = 0;
		double nota = 0;

		while (nota != -1) {
			System.out.println("Digite uma nota (ou -1 para sair):");
			nota = entrada.nextDouble();
			
			if (nota <= 10 && nota >= 0) {
				total = total + nota;
				notasValidas++;
			} else {
				System.out.println("Nota inválida.");
			}
		}
		
		double media = total / notasValidas; 
		System.out.println("A média da turma é " + media);
		entrada.close();
	}

}
