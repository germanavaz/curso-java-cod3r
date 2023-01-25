package classe;

public class DesafioPessoa {
	
	String nomePessoa;
	double pesoPessoa;
	
	DesafioPessoa(String nomePessoa, double pesoPessoa) {
		this.nomePessoa =  nomePessoa;
		this.pesoPessoa = pesoPessoa;
	}
	
	void comer(DesafioComida comida) {
		if (comida != null) {
			this.pesoPessoa += comida.pesoComida;
		}
		
	}
	
	String apresentar() {
		return "Olá, eu sou " + nomePessoa +" e tenho " + pesoPessoa + "kgs";
	}

}
