package application;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.Aluno;
import model.Matricula;

public class Main {
	public static void main(String[] args) {

		//Matricula matricula = new Matricula();
		//matricula.plano();
		
		//Aluno aluno = new Aluno("Fernanda", 17, "Lésbica");
		//aluno.mostrarDados();
		
		Matricula gerenciador = new Matricula();
		gerenciador.criarAluno();
		
		//gerenciador.verAlunosCadastrados();
		
		
	}
}
