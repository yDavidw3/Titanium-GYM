package views;
import java.awt.*;
import javax.swing.*;
import javax.swing.*;

public class ConsultarAluno extends JDialog {
	
	public ConsultarAluno() {		
		this.setTitle("Consultar aluno");
	    this.setModal(true);
	    this.setSize(700,600);  
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);	
	    
	    
JPanel painelPesquisa = new JPanel(new BorderLayout());
	    
	    JLabel lblPesquisa = new JLabel("Pesquisar: ");
	    JTextField txtPesquisa = new JTextField();
	    JButton ButPesquisar = new JButton("Pesquisar: ");
	    
	    painelPesquisa.add(lblPesquisa, BorderLayout.WEST);
	    painelPesquisa.add(txtPesquisa, BorderLayout.CENTER);
	    painelPesquisa.add(ButPesquisar, BorderLayout.EAST);
	    
	    //Estilização
	    painelPesquisa.setBorder(
	    		BorderFactory.createEmptyBorder(10, 10, 10, 10)
	    		);
	    
	    //Lista de Funcionarios
	    
	    JPanel listaAluno = new JPanel();
	    
	    listaAluno.setLayout(
	    	    new BoxLayout(listaAluno, BoxLayout.Y_AXIS)
	    	);
	    
	    listaAluno.setBorder(
	    	    BorderFactory.createEmptyBorder(10, 10, 10, 10)
	    	);
	    
	    ////////////////////////////////////////
	    listaAluno.add(
            criarCardAluno(
                "01",
                "David Paiva",
                "Analista de Resenha",
                "Ativo"
            )
        );
	    
	    listaAluno.add(
	            criarCardAluno(
	                "02",
	                "Mestre Kaique",
	                "Analista de Resenha",
	                "Ativo"
	            )
	        );
	    
	    listaAluno.add(
	            criarCardAluno(
	                "03",
	                "Gente fina",
	                "Analista de Resenha",
	                "Ativo"
	            )
	        );
	    
	    
	    //Rolagem
	    JScrollPane scrollAluno = new JScrollPane(listaAluno);
	    scrollAluno.setHorizontalScrollBarPolicy(
	    	    JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
	    	);
	    
	    this.add(scrollAluno, BorderLayout.CENTER);
	    this.add(painelPesquisa, BorderLayout.NORTH);
	    
	    
	}
	
	public JPanel criarCardAluno(String id, String nome, String cargo, String status) {

	    
	    JPanel cardAluno = new JPanel();
	    
	    JPanel panelNome = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    JPanel panelInfo = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    
	    JLabel idAluno = new JLabel("ID:" + id);
	    JLabel nomeAluno = new JLabel(nome);
	    JLabel cargoAluno = new JLabel(cargo);
	    JLabel statusAluno = new JLabel(status);
	    
	    panelNome.add(nomeAluno);
	    
	    panelInfo.add(idAluno);
	    panelInfo.add(cargoAluno);
	    panelInfo.add(statusAluno);

	    cardAluno.add(panelNome);
	    cardAluno.add(panelInfo);
	    
	   ////////////////////////////////////////////////
	    cardAluno.setLayout(new BorderLayout());
	    
	    cardAluno.add(panelNome, BorderLayout.NORTH);
	    cardAluno.add(panelInfo, BorderLayout.CENTER);
	    
	    //Estilização
	    nomeAluno.setFont(new Font("Arial", Font.BOLD, 18));
	    
	    
	    cardAluno.setBorder(
	    	    BorderFactory.createCompoundBorder(
	    	        BorderFactory.createEmptyBorder(0, 0, 10, 0),
	    	        BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1)
		    )
	    	);
	    
	    cardAluno.setPreferredSize(
	    	    new Dimension(655, 70)
	    	);

	    	cardAluno.setMaximumSize(
	    	    new Dimension(655, 70)
	    	);

	    	cardAluno.setAlignmentX(Component.LEFT_ALIGNMENT);
	    
	    
        panelNome.setOpaque(false);
        panelInfo.setOpaque(false);
		
		return cardAluno;
	}
