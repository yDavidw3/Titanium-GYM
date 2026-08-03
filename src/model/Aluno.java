package model;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa{
	
	private String plano;
	
	public Aluno(String nome, String idade, String genero, String endereco, String cpf){
		super(nome, idade, genero, endereco, cpf);
	}
	
	public void mostrarDados() {
		JOptionPane.showMessageDialog(null, "Nome: " + getNome() + "\nIdade: " + getIdade() + " anos\nGênero: " + getGenero() + "\nPlano: " + plano, "Confirmação de plano", JOptionPane.INFORMATION_MESSAGE);
	}

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}
	
	
}
