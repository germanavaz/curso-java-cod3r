package fundamentos;

public class Exercicio6 {
	public static void main(String[] args) {
		/*
		 * Criar um programa que resolve equações do segundo grau 
		 * (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. 
		 * Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
		 */
		
		int a = 1; 
		int b = 12; 
		int c = -13;
		
		double delta = Math.pow(b, 2) - (4 * a * c);
		
		System.out.println("O delta é " + delta);

		
		
	}

}
