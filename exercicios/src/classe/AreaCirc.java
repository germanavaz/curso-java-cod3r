package classe;

public class AreaCirc {
	
	double raio;
	static final double PI = 3.14;
	
	// static indica que o atributo não pertence mais a instância, e sim a classe 
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
