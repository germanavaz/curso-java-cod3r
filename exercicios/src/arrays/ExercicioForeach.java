package arrays;

import java.util.Arrays;

public class ExercicioForeach {
	
	public static void main(String[] args) {
		
		double notasAlunoA[] = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		/* double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		} */
		
		double totalAlunoA = 0;
		for(double notaA: notasAlunoA) {
			totalAlunoA += notaA;
		}
		System.out.println("média aluno A = " + totalAlunoA / notasAlunoA.length);
		
		double notaAramazenada = 6.0;
		double[] notasAlunoB = {6.9, 8.9, notaAramazenada, 10};
		
		/* double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		} */
		
		double totalAlunoB = 0;
		for(double notaB: notasAlunoB) {
			totalAlunoB += notaB;
		}
		
		System.out.println("média aluno B = " + totalAlunoB / notasAlunoB.length);
		
	}

}