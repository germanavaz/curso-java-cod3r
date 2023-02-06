package lambdas;

import java.util.function.*;

public class Desafio {
	
	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		/*
		 * 1. A partir do produto, calcular o preço real - com desconto; okk
		 * 2. Imposto Municipal: >= 2500 (8,5%) | < 2500 (Isento);
		 * 3. Frete: >= 3000 (100) | < 3000 (50);
		 * 4. Arredondar: Deixar em duas casas decimais;
		 * 5. Formatar: R$1234,56
		 * 
		 * https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
		 */
		
		BinaryOperator<Double> precoComDesconto = (preco, desconto) -> preco * (1 - desconto);
		//System.out.println("O preço real do " + p.nome + " com desconto é " + precoComDesconto.apply(p.preco, p.desconto));
		
		UnaryOperator<Double> impostoMunicipal = valor -> valor >= 2500 ? valor * (1 + 0.085) : valor; 
		
		//double pComImposto = precoComDesconto.andThen(impostoMunicipal).apply(p.preco, p.desconto);
		//System.out.println("O preço do " + p.nome + " com o imposto municipal é " + pComImposto);
		
		UnaryOperator<Double> precoComFrete = valor2 -> valor2 >= 3000 ? valor2 + 100 : valor2 + 50;
		
		double pComImpostoEFrete = precoComDesconto.andThen(impostoMunicipal).andThen(precoComFrete).apply(p.preco, p.desconto);
		//System.out.println("O preço do " + p.nome + " com o imposto municipal e o frete é " + pComImpostoEFrete);
		
		System.out.printf("O preço formatado é R$%.2f", pComImpostoEFrete);
		
		
		
		
		
		
	}

}
