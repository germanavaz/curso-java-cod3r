package controle;

import java.util.Scanner;

public class While {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String resposta = "";
		
		while (!resposta.equalsIgnoreCase("sair")) {
			System.out.println("Digite sair para sair.");
			resposta = entrada.nextLine();
		}
		System.out.println("Ok, você conseguiu sair. ");
		
		entrada.close();
	}

}
