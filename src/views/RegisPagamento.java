package views;


	import javax.swing.*;
	import java.awt.*;

	public class RegisPagamento extends JDialog {

	    public RegisPagamento() {

	        this.setTitle("Registro de Pagamento");
	        this.setModal(true);
	        this.setSize(700, 750);
	        this.setResizable(false);
	        this.setLocationRelativeTo(null);
	        setLayout(null);


	        
	        JLabel titulo = new JLabel("Registro de Pagamento");
	        titulo.setBounds(30, 20, 600, 40);
	        titulo.setFont(new Font("Arial", Font.BOLD, 28));
	        titulo.setForeground(Color.BLUE);
	        add(titulo);


	        
	        JLabel subtitulo = new JLabel("Registre o pagamento realizado pelo aluno");
	        subtitulo.setBounds(32, 60, 500, 25);
	        subtitulo.setFont(new Font("Arial", Font.PLAIN, 15));
	        subtitulo.setForeground(Color.GRAY);
	        add(subtitulo);


	        
	        JLabel aluno = new JLabel("Nome do aluno:");
	        aluno.setBounds(30, 110, 200, 30);
	        aluno.setFont(new Font("Arial", Font.BOLD, 16));
	        add(aluno);

	        JTextField inpAluno = new JTextField();
	        inpAluno.setBounds(30, 140, 620, 35);
	        inpAluno.setFont(new Font("Arial", Font.PLAIN, 15));
	        add(inpAluno);


	        
	        JLabel cpf = new JLabel("CPF:");
	        cpf.setBounds(30, 190, 150, 30);
	        cpf.setFont(new Font("Arial", Font.BOLD, 16));
	        add(cpf);

	        JTextField inpCpf = new JTextField();
	        inpCpf.setBounds(30, 220, 280, 35);
	        inpCpf.setFont(new Font("Arial", Font.PLAIN, 15));
	        add(inpCpf);


	        
	        JLabel valor = new JLabel("Valor:");
	        valor.setBounds(340, 190, 150, 30);
	        valor.setFont(new Font("Arial", Font.BOLD, 16));
	        add(valor);

	        JTextField inpValor = new JTextField();
	        inpValor.setBounds(340, 220, 310, 35);
	        inpValor.setFont(new Font("Arial", Font.PLAIN, 15));
	        add(inpValor);


	        
	        JLabel data = new JLabel("Data do pagamento:");
	        data.setBounds(30, 270, 200, 30);
	        data.setFont(new Font("Arial", Font.BOLD, 16));
	        add(data);

	        JTextField inpData = new JTextField();
	        inpData.setBounds(30, 300, 280, 35);
	        inpData.setFont(new Font("Arial", Font.PLAIN, 15));
	        add(inpData);


	        
	        JLabel forma = new JLabel("Forma de pagamento:");
	        forma.setBounds(340, 270, 200, 30);
	        forma.setFont(new Font("Arial", Font.BOLD, 16));
	        add(forma);

	        JTextField inpForma = new JTextField();
	        inpForma.setBounds(340, 300, 310, 35);
	        inpForma.setFont(new Font("Arial", Font.PLAIN, 15));
	        add(inpForma);


	        
	        JLabel plano = new JLabel("Plano:");
	        plano.setBounds(30, 350, 150, 30);
	        plano.setFont(new Font("Arial", Font.BOLD, 16));
	        add(plano);

	        JTextField inpPlano = new JTextField();
	        inpPlano.setBounds(30, 380, 620, 35);
	        inpPlano.setFont(new Font("Arial", Font.PLAIN, 15));
	        add(inpPlano);


	        
	        JLabel observacao = new JLabel("Observação:");
	        observacao.setBounds(30, 430, 150, 30);
	        observacao.setFont(new Font("Arial", Font.BOLD, 16));
	        add(observacao);

	        JTextField inpObservacao = new JTextField();
	        inpObservacao.setBounds(30, 460, 620, 35);
	        inpObservacao.setFont(new Font("Arial", Font.PLAIN, 15));
	        add(inpObservacao);


	        
	        JButton registrar = new JButton("Registrar Pagamento");
	        registrar.setBounds(30, 520, 620, 45);
	        registrar.setFont(new Font("Arial", Font.BOLD, 16));
	        registrar.setBackground(Color.BLUE);
	        registrar.setForeground(Color.WHITE);
	        add(registrar);


	        
	        JButton limpar = new JButton("Limpar");
	        limpar.setBounds(30, 580, 300, 40);
	        limpar.setFont(new Font("Arial", Font.BOLD, 15));
	        add(limpar);


	        
	        JButton cancelar = new JButton("Cancelar");
	        cancelar.setBounds(350, 580, 300, 40);
	        cancelar.setFont(new Font("Arial", Font.BOLD, 15));
	        add(cancelar);


	        
	        limpar.addActionListener(e -> {

	            inpAluno.setText("");
	            inpCpf.setText("");
	            inpValor.setText("");
	            inpData.setText("");
	            inpForma.setText("");
	            inpPlano.setText("");
	            inpObservacao.setText("");

	        });


	        
	        cancelar.addActionListener(e -> {

	            dispose();

	        });


	        
	        registrar.addActionListener(e -> {

	            JOptionPane.showMessageDialog(
	                this,
	                "Pagamento registrado com sucesso!",
	                "Pagamento",
	                JOptionPane.INFORMATION_MESSAGE
	            );

	        });


	        setVisible(true);
	    
	}



}

