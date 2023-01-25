package classe;

public class DesafioJantar {
	
	public static void main(String[] args) {
		
		DesafioPessoa p1 = new DesafioPessoa("João", 75.5);
		
		DesafioComida c1 = new DesafioComida("feijão", 0.5);
		DesafioComida c2 = new DesafioComida("arroz", 0.3);
		
		System.out.println(p1.apresentar());
			
		p1.comer(c1);
		System.out.println(p1.apresentar());
		
		p1.comer(c2);
		System.out.println(p1.apresentar());
		
	}

}
