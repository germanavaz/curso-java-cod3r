package br.com.cursojava.cm;

import br.com.cursojava.cm.modelo.Tabuleiro;
import br.com.cursojava.cm.visao.TabuleiroConsole;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
		
	}

}
