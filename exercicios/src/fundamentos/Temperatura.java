package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		/*
		 * Desafio transformar °C para °F, armazenando todos os valores da formula em variáveis ou constantes.
		 * 
		 * Formula: (F - 32) * 5 / 9 = C
		 */
		
		double f = 86;
		
		final int AJUSTE = 32;
		final double FATOR = 5.0/9.0; //divisão com número inteiro, da número inteiro. Por isso precisa botar o .0
		
		double c = (f - AJUSTE) * FATOR; 
		
		System.out.println(f + "°F equivale à " + c + "°C.");
				
		 
	}

}
