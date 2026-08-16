package model;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa{
	
	private Plano plano;
	
	public Aluno(String nome, String idade, String genero, String endereco, String cpf){
		super(nome, idade, genero, endereco, cpf);
	}
	
	public void mostrarDadosAluno() {
		JOptionPane.showMessageDialog(null, "Nome: " + getNome() + "\nIdade: " + getIdade() + " anos\nGênero: " + getGenero() + "\nPlano: " + plano.getNomePlano() + "\nValor: R$" + plano.getValorPlano(), "Confirmação de plano", JOptionPane.INFORMATION_MESSAGE);
	}

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}

	
	
}
