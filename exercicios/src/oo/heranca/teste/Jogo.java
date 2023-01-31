package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo {
	
	public static void main(String[] args) {
		
		Jogador monstro = new Monstro(10, 10);
		
		Jogador heroi = new Heroi(10, 11);
		
		System.out.println(monstro.atacar(heroi));
		System.out.println("Vida heroi: " + heroi.vida);
		
		System.out.println(heroi.atacar(monstro));
		System.out.println("Vida monstro: " + monstro.vida);
		
	}

}
