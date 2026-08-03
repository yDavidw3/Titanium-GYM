package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Matricula implements Plano{
	
	private ArrayList<Aluno> bancoDeDadosAlunos = new ArrayList<Aluno>();
	
	
	public void criarAluno() {
		boolean continuar = true;
		
		while(continuar) {
			JTextField campoNome = new JTextField();
			JTextField campoIdade = new JTextField();
			JTextField campoGenero = new JTextField();
			JTextField campoCpf = new JTextField();
			JTextField campoEndereco = new JTextField();

			Object[] CadastroAluno = {
				"Nome do Aluno: ", campoNome,
				"Idade do Aluno: ", campoIdade,
				"Gênero do Aluno : ", campoGenero,
				"CPF do Aluno: ", campoCpf,
				"Endereço do Aluno: ", campoEndereco,
			};
			
			int opcao = JOptionPane.showConfirmDialog(null, CadastroAluno, "Cadastrar novo aluno", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(opcao == JOptionPane.OK_OPTION) {
				String nomeAluno = campoNome.getText();
				String idadeAluno = campoIdade.getText();
				String generoAluno = campoGenero.getText();
				String cpfAluno = campoCpf.getText();
				String enderecoAluno = campoEndereco.getText();
				
				Aluno aluno = new Aluno(nomeAluno, idadeAluno, generoAluno, enderecoAluno, cpfAluno);
				
				String planoEscolhido = this.plano();
				aluno.setPlano(planoEscolhido);
				
				bancoDeDadosAlunos.add(aluno);
				aluno.mostrarDados();
			}
	
			int resposta = JOptionPane.showConfirmDialog(null, "Aluno cadastrado! Deseja continuar?\n", "Continuar?", JOptionPane.YES_NO_OPTION);
			if(resposta == JOptionPane.NO_OPTION) {
				continuar = false;
			}else {
				continuar = true;
			}
		}
	}
	
	public void verAlunosCadastrados() {
		String lista = "Alunos cadastrados";
		for (Aluno aluno : bancoDeDadosAlunos) {
			lista += "Nome: " + aluno.getNome() + "Idade: " + aluno.getIdade() + "Gênero: " + aluno.getGenero() + "Endereço: " + aluno.getEndereco() + "CPF: " + aluno.getCpf();
		}
	}
	

	@Override
	public String plano() {
			String input = JOptionPane.showInputDialog(null, "Escolha o seu plano de academia:\n1 - Plano Standard\n2 - Plano Premium\n3 - Plano Premuim Black", "Seleção de Planos", JOptionPane.QUESTION_MESSAGE);
			int opcaoPlano = Integer.parseInt(input);
			String plano = "";
			String mensagem = "";
			
			if(opcaoPlano == 1) {
				plano = "Standard";
				mensagem = "Seu plano é o " + plano;
			}else if(opcaoPlano == 2) {
				plano = "Premium";
				mensagem = "Seu plano é o " + plano;
			}else if(opcaoPlano == 3) {
				plano = "Premium Black";
				mensagem = "Seu plano é o " + plano;
			}else {
			}	
			
			//JOptionPane.showMessageDialog(null, mensagem, "Confirmação de plano", JOptionPane.INFORMATION_MESSAGE);
			
			return plano;
	}
}
