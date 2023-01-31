package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Fusca;

public class Teste {
	
	public static void main(String[] args) {
		
		Carro fusca = new Fusca();
		
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.freiar();
		fusca.freiar();
		
		System.out.println(fusca.velocidadeAtual);
		
		Ferrari ferrari = new Ferrari();
		
		ferrari.ligarTurbo();
		ferrari.acelerar();
		ferrari.freiar();
		
		System.out.println(ferrari.velocidadeAtual);
	}

}
