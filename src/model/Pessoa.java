package model;

public class Pessoa {

	private String nome;
	private String idade;
	//endereço: bairro, cidade, rua, numero, complemento
	private String endereco;
	private String genero;
	private String cpf;
	
	//Construtor de uma pessoa
	public Pessoa(String nome, String idade, String genero, String endereco, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.genero = genero;
		this.cpf = cpf;
	}

	//getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
	
	
}
