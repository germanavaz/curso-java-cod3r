package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");
		
		System.out.println(valor1 + valor2); //concatenação de strings
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2); //passou de string para double
		
		double soma = numero1 + numero2;
		
		System.out.println("Soma é " + soma); // concatenação de double
		System.out.println("Média é " + soma/2);
	}

}
