package oo.heranca.desafio;

public abstract class Carro {
	
	protected final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual;
	private int delta = 5;

	public Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			this.velocidadeAtual += delta;
		}
	}
	
	public void freiar() {
		if (velocidadeAtual >= delta) {
			this.velocidadeAtual -= delta;
		} else {
			velocidadeAtual = 0;
		}
		
	}
	
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}


}
