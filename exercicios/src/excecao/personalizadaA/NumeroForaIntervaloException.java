package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException {
	
	private String nomeDoAtributo;
	
	public NumeroForaIntervaloException (String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O nome do atributo %s está negativo", nomeDoAtributo);
	}

}
