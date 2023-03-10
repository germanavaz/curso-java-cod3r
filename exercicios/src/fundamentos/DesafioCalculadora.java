package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		/*
		 * ler num1
		 * ler num2
		 * ler a operação desejada -> + - * / % 
		 * fazer a operação utilizando os argumentos passados
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		double num1 = entrada.nextDouble();
		System.out.println("Digite o segundo número:");
		double num2 = entrada.nextDouble();
		System.out.println("Digite a operação desejada:");
		String operacao = entrada.next();
		
		double calculo = "+".equals(operacao) ? num1 + num2 : 0;
		calculo = "-".equals(operacao) ? num1 - num2 : calculo;
		calculo = "*".equals(operacao) ? num1 * num2 : calculo;
		calculo = "/".equals(operacao) ? num1 / num2 : calculo;
		calculo = "%".equals(operacao) ? num1 % num2 : calculo;
		
		
		entrada.close();
		
		System.out.println(num1 + operacao + num2 + " = " +calculo);
	}

}
