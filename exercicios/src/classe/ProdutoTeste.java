package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89);
		
		var p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 12.56;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoDescontoEspecial(0.29);
		double mediaPrecos = (precoFinal1 + precoFinal2) / 2;
		System.out.println(mediaPrecos);
		
		System.out.println(p1.precoComDesconto());
		
		double precoFinalComMetodo2 = p2.precoComDesconto();
		
		System.out.println(precoFinalComMetodo2);
	}

}
