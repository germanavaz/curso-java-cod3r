package controle;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		/*
		 * Criar um programa informa se o ano atual é um ano bissexto; 
		 * Ano bissexto -> qualquer ano que seja uniformimente divisivel por 4
		 */
		
		int anoAtual = 1992;
		
		if (anoAtual % 4 == 0) {
			System.out.println("O ano atual é bissexto!");
		} else {
			System.out.println("O ano atual não é bissexto.");
		}
	}

}
