package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		/*
		 * Calcular a média das notas de um aluno.
		 * O usuário passará as notas.
		 * Sistema pergunta quantas notas o usuário quer informar.
		 * Dois laços for - armazenar notas num array e percorrer o array com foreach somando
		 */
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantas notas deseja informar?");
		int quantidadeNotas = entrada.nextInt();
		
		double notasAluno[] = new double[quantidadeNotas];
		
		for (int i = 0; i < quantidadeNotas; i++) {
			System.out.println("Digite uma nota " + (i + 1) + ":");
			notasAluno[i] = entrada.nextDouble();
		}
		
		System.out.println("Notas informadas: " + Arrays.toString(notasAluno));
		
		double totalNotas = 0;
		for(double nota: notasAluno) {
			totalNotas += nota;
		}
		
		double media = totalNotas / notasAluno.length;
		
		System.out.println("Média das notas informadas: " + media);
		
		entrada.close();
	}

}
