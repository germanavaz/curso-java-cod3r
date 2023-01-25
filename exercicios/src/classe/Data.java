package classe;


public class Data {
	
	int dia;
	int mes;
	int ano;
	
	//Desafio 1 - método para obter data formatada
	
	String dataFormatada() {
		String data = String.format("%d/%d/%d", dia, mes, ano);
		return data;
	}
	
	//Desafio 2 - criar dois construtores: padrão e o com parametros dia, mes e ano.
	//Se chamar o construtor padrão o default precisa ser 01/01/1970
	
	Data() {
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970);
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

}
