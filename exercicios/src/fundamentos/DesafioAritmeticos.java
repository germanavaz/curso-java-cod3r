package fundamentos;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		/*
		 * para elevar potencia, utilizar a classe Math.pow(valor da variavel, valor do "elevado")
		 * ex: int b = (int) Math.pow(a, 3) -> variavel "a" elevado a 3
		 * ex: double b = Math.pow(a, 3)
		 * 
		 * Desafio - expressão 
		 */
		
		double a = 6 * (3 + 2);
		double b = Math.pow(a, 2);
		double c = 3 * 2;
		
		double x = b / c;
		
		double d = (1 - 5) * (2 - 7);
		double e = d / 2;
		
		double y = Math.pow(e, 2);
		
		double cima = x - y;
		double fim1 = Math.pow(cima, 3);
		
		double fim2 = Math.pow(10, 3);
		
		int resultado = (int) (fim1 / fim2);
		
		System.out.println("O resultado é " + resultado);
		
	}

}
