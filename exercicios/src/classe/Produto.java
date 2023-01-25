package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	
	
	//método CONSTRUTOR padrão 
	Produto() {
		
	}
	
	//Construtor com parametro 
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
 
	//método para retornar o preço com desconto
	double precoComDesconto() {
		double resultado = preco * (1 - desconto);
		return resultado;
	}
	
	double precoDescontoEspecial (double descontoEspecial) {
		return preco * (1 + descontoEspecial);
	}
	
	/* Desafio: 25% de desconto na loja toda mas em alguns momentos 
	o desconto pode variar mas é sempre para todos os produtos */
}
