package views;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing. *;
import javax.swing.border.TitledBorder;

import views.CadAluno;
import views.CadFuncionario;

public class Menu extends JFrame {
	
	public Menu() {
		
		this.setSize(800,600);
		this.setTitle("Titanium GYM - Sistema de Gerenciamento");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setExtendedState(MAXIMIZED_BOTH);
		
		JMenu arq = new  JMenu("Arquivo");
		JMenu cad = new JMenu ("Cadastrar");
		JMenu cons = new JMenu ("Consultar");
		JMenu help = new JMenu ("Ajuda");
		
		
		JMenuItem sobre = new JMenuItem ("Sobre");
		JMenuItem sair = new JMenuItem ("Sair");
		JMenuItem alu = new JMenuItem("Aluno");
		JMenuItem fun = new JMenuItem("Funcionário");
		JMenuItem consAluno = new JMenuItem ("Aluno");
		JMenuItem consFuncionario = new JMenuItem ("Funcionário");
		
		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);
		bar.add(arq);
		bar.add(cad);
		bar.add(cons);
		bar.add(help);
		
		arq.add(sobre);
		arq.add(sair);
		
		cad.add(alu);
		cad.add(fun);
		
		cons.add(consAluno);
		cons.add(consFuncionario);
		
		JPanel principal = new JPanel(new BorderLayout());
		principal.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		add(principal);
		
		
		// CABEÇALHO
		JPanel cabecalho = new JPanel(new BorderLayout());
		
		JLabel titulo = new JLabel("Bem vindo, Administrador");
		JLabel data = new JLabel("Terça-feira, 15 de agosto de 2026");
		
		JPanel apresentacao = new JPanel();
		apresentacao.add(titulo);
		apresentacao.add(data);
		apresentacao.setLayout(new BoxLayout(apresentacao, BoxLayout.Y_AXIS));
		
		JButton status = new JButton ("Academia ativa");
		
		cabecalho.add(apresentacao, BorderLayout.WEST);
		cabecalho.add(status, BorderLayout.EAST);
		cabecalho.setBorder(BorderFactory.createEmptyBorder(0, 0, 30, 0)); 
		
		// ESTILIZAÇÃO
		titulo.setFont(new Font("Arial", Font.BOLD, 17));
		data.setFont(new Font("Arial", Font.BOLD, 12));
		
		status.setFont(new Font("Arial", Font.BOLD, 15));
		Color azulTexto = new Color(59, 110, 165);
		Color azulFundo = new Color(234, 241, 250);

		status.setForeground(azulTexto);
		status.setBackground(azulFundo);
		status.setBorder(BorderFactory.createLineBorder(azulTexto));
		status.setFocusPainted(false);
	
		// CABEÇALHO
		
		//CARDS
		// Alunos
		JPanel cardAluno = new JPanel();
		JLabel nomeCardAluno = new JLabel("Alunos ativos");
		JLabel valorCardAluno = new JLabel("184");
		cardAluno.add(nomeCardAluno);
		cardAluno.add(valorCardAluno);
		cardAluno.setLayout(new BoxLayout(cardAluno, BoxLayout.Y_AXIS));
		
		// Planos
		JPanel cardPlano = new JPanel();
		JLabel nomeCardPlano = new JLabel("Planos ativos");
		JLabel valorCardPlano = new JLabel("6");
		cardPlano.add(nomeCardPlano);
		cardPlano.add(valorCardPlano);
		cardPlano.setLayout(new BoxLayout(cardPlano, BoxLayout.Y_AXIS));
		
		// Matricula
		JPanel cardMatricula = new JPanel();
		JLabel nomeCardMatricula= new JLabel("Matrículas no mês");
		JLabel valorCardMatricula = new JLabel("27");
		cardMatricula.add(nomeCardMatricula);
		cardMatricula.add(valorCardMatricula);
		cardMatricula.setLayout(new BoxLayout(cardMatricula, BoxLayout.Y_AXIS));
		
		// Pagamento
		JPanel cardPagamento = new JPanel();
		JLabel nomeCardPagamento = new JLabel("Pagamentos pendentes");
		JLabel valorCardPagamento= new JLabel("9");
		cardPagamento.add(nomeCardPagamento);
		cardPagamento.add(valorCardPagamento);
		cardPagamento.setLayout(new BoxLayout(cardPagamento, BoxLayout.Y_AXIS));
		
		
		JPanel cards = new JPanel ( new GridLayout(1,4, 10, 0) );
		cards.add(cardAluno);
		cards.add(cardPlano);
		cards.add(cardMatricula);
		cards.add(cardPagamento);
		
		//ESTILIZAÇÃO DOS CARDS
		nomeCardAluno.setFont(new Font("Arial", Font.PLAIN, 17));
		nomeCardPagamento.setFont(new Font("Arial", Font.PLAIN, 17));
		nomeCardMatricula.setFont(new Font("Arial", Font.PLAIN, 17));
		nomeCardPlano.setFont(new Font("Arial", Font.PLAIN, 17));
		
		valorCardAluno.setFont(new Font("Arial", Font.BOLD, 20));
		valorCardPagamento.setFont(new Font("Arial", Font.BOLD, 20));
		valorCardMatricula.setFont(new Font("Arial", Font.BOLD, 20));
		valorCardPlano.setFont(new Font("Arial", Font.BOLD, 20));
		
		Color cinza = new Color(120, 120, 120);
		nomeCardAluno.setForeground(cinza);
		nomeCardPagamento.setForeground(cinza);
		nomeCardMatricula.setForeground(cinza);
		nomeCardPlano.setForeground(cinza);
		
		Color vermelho = new Color(176, 51, 31);
		valorCardPagamento.setForeground(vermelho);
		
		
		cardAluno.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(Color.LIGHT_GRAY),
				BorderFactory.createEmptyBorder(10, 10, 10, 10)
				));
		cardPlano.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(Color.LIGHT_GRAY),
				BorderFactory.createEmptyBorder(10, 10, 10, 10)
				));
		cardMatricula.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(Color.LIGHT_GRAY),
				BorderFactory.createEmptyBorder(10, 10, 10, 10)
				));;
		cardPagamento.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(Color.LIGHT_GRAY),
				BorderFactory.createEmptyBorder(10, 10, 10, 10)
				));
		cards.setBorder(BorderFactory.createEmptyBorder(0, 0, 40, 0)); 
		
		//CARDS
		
		// TABELA DE ALUNOS
		String[] colunas = {
			"Nome",
			"Plano",
			"Situação"
		};
		
		Object[][] dados = {
			{"David Paiva", "Mensal", "Em dia"},
			{"Kaique Santos", "Anual", "Em dia"},
			{"Isaac Duwe", "Trimestral", "Pendente"},
			{"João Breno", "Mensal", "Em dia"}
		};
		
		JTable tabela = new JTable(dados, colunas);
		JScrollPane scroll = new JScrollPane(tabela);
		tabela.setPreferredScrollableViewportSize( new Dimension(600, tabela.getRowHeight() * dados.length));
		TitledBorder tituloTabela = BorderFactory.createTitledBorder("Últimos alunos cadastrados");
		
		scroll.setBorder(tituloTabela);
		
		JPanel painelTabela = new JPanel( new BorderLayout());
		painelTabela.add(scroll, BorderLayout.CENTER);
		
		// ESTILIZAÇÃO
		tituloTabela.setTitleFont(new Font("Arial", Font.BOLD, 14));
		// TABELA DE ALUNOS
		
		
		// AVISOS
		JPanel avisos = new JPanel();
		avisos.setLayout( new BoxLayout(avisos, BoxLayout.Y_AXIS));
		
		TitledBorder tituloAvisos = BorderFactory.createTitledBorder("Avisos");
		avisos.setBorder(BorderFactory.createTitledBorder(tituloAvisos));
		avisos.add(new JLabel("Manutenção das esteiras - 18/08"));
		avisos.add(new JLabel("Nova turma de Boxing às 19h"));
		avisos.add(new JLabel("3 pagamentos pendentes"));
		
		// ESTILIZAÇÂO  AVISOS
		tituloAvisos.setTitleFont(new Font("Arial", Font.BOLD, 14));
		// AVISOS
		
		// PAINEL DE OCUPAÇÃO
		JPanel ocupacao = new JPanel(new BorderLayout());
		TitledBorder tituloOcupacao = BorderFactory.createTitledBorder("Ocupação da academia");
		tituloOcupacao.setTitleFont(new Font("Arial", Font.BOLD, 14));
		ocupacao.setBorder(tituloOcupacao);

		JProgressBar barraOcupacao = new JProgressBar(0, 100);
		barraOcupacao.setValue(68);
		barraOcupacao.setStringPainted(true);
		ocupacao.add(barraOcupacao, BorderLayout.CENTER);
		// PAINEL DE OCUPAÇÃO
		
		JPanel avisoOcupacao = new JPanel();
		avisoOcupacao.setLayout(new BoxLayout(avisoOcupacao, BoxLayout.Y_AXIS));
		
		
		avisoOcupacao.add(ocupacao);
		avisoOcupacao.add(Box.createVerticalStrut(10)); 
		avisoOcupacao.add(avisos);
		
		
		// BOTÕES
		JPanel botoes = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JButton btnCadastrar = new JButton("Registrar ocorrências");
		JButton btnConsultar = new JButton("Planos");
		JButton btnPagamento= new JButton("Registrar pagamento");
		
		botoes.add(btnPagamento);
		botoes.add(btnCadastrar);
		botoes.add(btnConsultar);
		// BOTÕES
		
		JPanel section = new JPanel(new GridLayout(1, 2, 10, 0 ));
		section.add(painelTabela);
		section.add(avisoOcupacao);
		
		JPanel conteudo = new JPanel( new BorderLayout());
		conteudo.add(cards, BorderLayout.NORTH);
		conteudo.add(section, BorderLayout.CENTER);
		conteudo.add(botoes, BorderLayout.SOUTH);
	
		
		
		JPanel topo = new JPanel();
		topo.setLayout(new BoxLayout(topo, BoxLayout.Y_AXIS));
		topo.add(cabecalho);
		topo.add(conteudo);

		principal.add(topo, BorderLayout.NORTH);
		
	
	
		
		
		// AÇÕES
		alu.addActionListener(
				new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						CadAluno cadastroAluno = new CadAluno();
						cadastroAluno.setVisible(true);
					}
				}
				
	);
		
		fun.addActionListener(
				new ActionListener () {
					@Override
					public void actionPerformed(ActionEvent e) {
						CadFuncionario cadastroFun = new CadFuncionario();
						cadastroFun.setVisible(true);
					}
				}		
				
	);
		
		consAluno.addActionListener(
				new ActionListener () {
					@Override
					public void actionPerformed(ActionEvent e) {
						ConsultarAluno consAluno= new ConsultarAluno();
						consAluno.setVisible(true);
					}
				}		
				
	);
		
		consFuncionario.addActionListener(
				new ActionListener () {
					@Override
					public void actionPerformed(ActionEvent e) {
						ConsultarFuncionario consFuncionario = new ConsultarFuncionario();
						consFuncionario.setVisible(true);
					}
				}		
				
	);
		
		sobre.addActionListener(
				new ActionListener () {
					@Override
					public void actionPerformed(ActionEvent e) {
						Sobre sobre = new Sobre();
						sobre.setVisible(true);
					}
				}		
				
	);
		
		help.addActionListener(
				new ActionListener () {
					@Override
					public void actionPerformed(ActionEvent e) {
						Ajuda ajuda = new Ajuda();
						ajuda.setVisible(true);
					}
				}		
				
	);
		
		
		
		sair.addActionListener(
		         new ActionListener(){
		             public void actionPerformed(ActionEvent event){
		               System.exit(0);
		             }
		         }
		       );
		
		
		
		this.setVisible(true);
		
	}


	

}
