package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo {
	
	public Ferrari(){
		this(315);
	}	
	
	public Ferrari (int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}

	@Override
	public void ligarTurbo() {
		setDelta(35);
		
	}

	@Override
	public void desligarTurbo() {
		setDelta(15);
		
	}

}
