package fundamentos;

public class DesafioLogicos {

	public static void main(String[] args) {

		/*
		 * Trabalho 1 e trabalho 2 Se os dois trabalhos derem certo - compra televisão
		 * de 50 polegadas Se só um trabalho der certo - compra televisão de 30
		 * polegadas Se nenhum trabalho der certo - compra um sorvete
		 * 
		 */

		boolean trabalho1 = false;
		boolean trabalho2 = true;

		if (trabalho1 && trabalho2) {
			System.out.println("Comprou televisão de 50 polegadas!");
		} else if (trabalho1 ^ trabalho2) {
			System.out.println("Comprou televisão de 30 polegadas");
		} else {
			System.out.println("Comprou um sorvete");
		}
	}

}
