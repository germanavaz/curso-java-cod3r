package oo.polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz ingrediente1 = new Arroz(0.250);
		Feijao ingrediente2 = new Feijao(0.150);
		
		convidado.comer(ingrediente1);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente2);
		
		System.out.println(convidado.getPeso());
	}

}
