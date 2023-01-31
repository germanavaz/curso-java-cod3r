package oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa (String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade >= 0 && idade <= 100) {
		this.idade = idade;
		} else {
			System.out.println("Idade inválida.");
		}
	}
	
	@Override
	public String toString() {
		return "Olá, eu sou " + getNome() + " e tenho " + getIdade() + " anos.";
	}

}
