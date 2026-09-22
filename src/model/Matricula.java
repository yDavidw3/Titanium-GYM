package model;

import java.util.ArrayList;
import java.time.LocalDate;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Matricula{
	
	private ArrayList<Aluno> bancoDeDadosAlunos = new ArrayList<Aluno>();
	

	
	
	public void criarAluno() {
		boolean continuar = true;
		
		while(continuar) {
		
			JOptionPane.showMessageDialog(
					null, "Titanium GYM"
							
							+ "\n"+ "\n Olá, somos a Tinanium GYM. \n Desde já, agradecemos a preferência e \n desejamos uma experiência extraordinária \n com nossos equipamentos de última linha."
							);
			
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
			if(opcao == JOptionPane.CANCEL_OPTION) {
				continuar = false;
			}else {
				String nomeAluno = campoNome.getText();
				String idadeAluno = campoIdade.getText();
				String generoAluno = campoGenero.getText();
				String cpfAluno = campoCpf.getText();
				String enderecoAluno = campoEndereco.getText();
				
				Aluno aluno = new Aluno(nomeAluno, idadeAluno, generoAluno, enderecoAluno, cpfAluno);
				
				Plano planoEscolhido = this.plano();
				aluno.setPlano(planoEscolhido);
				
				/* PAGAMENTO */
				
				String inputPagamento = JOptionPane.showInputDialog(null, "Escolha o seu método de pagamento:\n1 - Pix (recomendado) \n2 - Cartão (débito ou crédito) \n3 - Boleto \n", "Seleção do método de pagamento", JOptionPane.QUESTION_MESSAGE);
				int opcaoEscolhidaPag = Integer.parseInt(inputPagamento);
				
				if( opcaoEscolhidaPag == 1) {
					
					String chavePix = "Tytaniumacademiafit@gmail.com";
					LocalDate dataPagamento = LocalDate.now();
					
					PagamentoPix pix = new PagamentoPix(dataPagamento, "Aprovado", chavePix);
					
					JOptionPane.showMessageDialog(
							null, "Chave Pix:  "
									+ chavePix 
									+ "\n"+ "\n Após efetuar o pagamento, mostre o comprovante para a(o) recepcionista."
									);
					pix.mostrarDadosPix();
				} else if (opcaoEscolhidaPag == 2) {
					
					String numeroCartao = JOptionPane.showInputDialog(null, "Insira o número do cartão: ", "Processando o pagamento", JOptionPane.QUESTION_MESSAGE);
					String cvv = JOptionPane.showInputDialog(null, "Insira o número CVV (3 dígitos): ", "Processando o pagamento", JOptionPane.QUESTION_MESSAGE);
					LocalDate dataPagamento = LocalDate.now();
					
					PagamentoCartao cartao = new PagamentoCartao(dataPagamento, "Aprovado", numeroCartao, cvv);
					
					cartao.mostrarDadosCartao();
				} else if (opcaoEscolhidaPag == 3) {
					
					LocalDate dataPagamento = LocalDate.now();
					String dataVencimento = "04/09/2026";
					String codBarras = JOptionPane.showInputDialog(null, "Insira os números do código de barras: ", "Processando o pagamento", JOptionPane.QUESTION_MESSAGE);
					
					PagamentoBoleto boleto = new PagamentoBoleto(dataPagamento, "Aprovado", codBarras,  dataVencimento);
					
					boleto.mostrarDadosBoleto();
				}
				
				/* PAGAMENTO */
				
				bancoDeDadosAlunos.add(aluno);
				aluno.mostrarDadosAluno();
			}
			if(opcao == JOptionPane.OK_OPTION) {
			int resposta = JOptionPane.showConfirmDialog(null, "Aluno cadastrado! Deseja continuar?\n", "Continuar?", JOptionPane.YES_NO_OPTION);
			if(resposta == JOptionPane.NO_OPTION) {
				continuar = false;
			}else {
				continuar = true;
			}
			}else {
				
			}
		}
	}
	
	public void verAlunosCadastrados() {
		String lista = "Alunos cadastrados";
		for (Aluno aluno : bancoDeDadosAlunos) {
			lista += "Nome: " + aluno.getNome() + "Idade: " + aluno.getIdade() + "Gênero: " + aluno.getGenero() + "Endereço: " + aluno.getEndereco() + "CPF: " + aluno.getCpf();
		}
	}
	

	
	public Plano plano() {
			String input = JOptionPane.showInputDialog(null, "Escolha o seu plano de academia:\n1 - Plano Standard | R$ 89.99\n2 - Plano Premium | R$ 119.99\n3 - Plano Premuim Black | R$ 149.99", "Seleção de Planos", JOptionPane.QUESTION_MESSAGE);
			int opcaoPlano = Integer.parseInt(input);
			
			
			if(opcaoPlano == 1) {
				return new Plano("Standard", 89.99);
			}else if(opcaoPlano == 2) {
				return new Plano("Premium", 119.99);
			}else if(opcaoPlano == 3) {
				return new Plano("Black", 149.99);
			}else {
				return null;
			}
			
				
			
			
			
			//JOptionPane.showMessageDialog(null, mensagem, "Confirmação de plano", JOptionPane.INFORMATION_MESSAGE);
			
			
	}
	
}
	
