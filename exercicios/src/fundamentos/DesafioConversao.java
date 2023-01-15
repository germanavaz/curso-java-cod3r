package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		/*
		 * A partir do scanner, pegar 3 strings usando o nextline e essas strings receberão salários.
		 * Terá que calcular a média dos 3 salários informados. 
		 * Esse salário poderá ser escrito/separado por . ou ,. Ex: 1280.54 ou 1280,54
		 * 
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salário:");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o segundo salário:");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o terceiro salário:");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		double media = (valor1 + valor2 + valor3)/3;
		
		System.out.println("A média dos salários é RS" + media);
		
		entrada.close();
	}

}
