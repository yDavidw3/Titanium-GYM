package views;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.*;

public class ConsultarFuncionario extends JDialog {
	
	public ConsultarFuncionario() {		
		this.setTitle("Consultar funcionario");
	    this.setModal(true);
	    this.setTitle("Consultar funcionario");
	    this.setModal(true);
	    this.setSize(700,600);  
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);	
	    
	    //Barra de pesquisa
	    
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
	    
	    JPanel listaFuncionario = new JPanel();
	    
	    listaFuncionario.setLayout(
	    	    new BoxLayout(listaFuncionario, BoxLayout.Y_AXIS)
	    	);
	    
	    listaFuncionario.setBorder(
	    	    BorderFactory.createEmptyBorder(10, 10, 10, 10)
	    	);
	    
	    ////////////////////////////////////////
	    listaFuncionario.add(
            criarCardFuncionario(
                "01",
                "David Paiva",
                "Peida leite ninho",
                "Inativo"
            )
        );
	    
	    listaFuncionario.add(
	            criarCardFuncionario(
	                "02",
	                "Mestre Kaique",
	                "Subsecretário sacana",
	                "Passivo"
	            )
        );
	    
	    listaFuncionario.add(
	            criarCardFuncionario(
	                "03",
	                "Isaac Duwe",
	                "Consultor de travestis",
	                "Ativo"
	            )
        );
	    
	    listaFuncionario.add(
	    		criarCardFuncionario(
	    				"04",
					"Breno Dourado",
					"Repositor de Chads",
					"Repondo..."
					)
	    		);
	    
	    
	    
	    //Rolagem
	    JScrollPane scrollFuncionarios = new JScrollPane(listaFuncionario);
	    scrollFuncionarios.setHorizontalScrollBarPolicy(
	    	    JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
	    	);
	    
	    this.add(scrollFuncionarios, BorderLayout.CENTER);
	    this.add(painelPesquisa, BorderLayout.NORTH);
	    
	    
	}
	
	public JPanel criarCardFuncionario(String id, String nome, String cargo, String status) {

	    
	    JPanel cardFuncionario = new JPanel();
	    
	    JPanel panelNome = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    JPanel panelInfo = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    
	    JLabel idFuncionario = new JLabel("ID:" + id);
	    JLabel nomeFuncionario = new JLabel(nome);
	    JLabel cargoFuncionario = new JLabel(cargo);
	    JLabel statusFuncionario = new JLabel(status);
	    
	    panelNome.add(nomeFuncionario);
	    
	    panelInfo.add(idFuncionario);
	    panelInfo.add(cargoFuncionario);
	    panelInfo.add(statusFuncionario);

	    cardFuncionario.add(panelNome);
	    cardFuncionario.add(panelInfo);
	    
	   ////////////////////////////////////////////////
	    cardFuncionario.setLayout(new BorderLayout());
	    
	    cardFuncionario.add(panelNome, BorderLayout.NORTH);
	    cardFuncionario.add(panelInfo, BorderLayout.CENTER);
	    
	    //Estilização
	    nomeFuncionario.setFont(new Font("Arial", Font.BOLD, 18));
	    
	    
	    cardFuncionario.setBorder(
	    	    BorderFactory.createCompoundBorder(
	    	        BorderFactory.createEmptyBorder(0, 0, 10, 0),
	    	        BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1)
		    )
	    	);
	    
	    cardFuncionario.setPreferredSize(
	    	    new Dimension(655, 70)
	    	);

	    	cardFuncionario.setMaximumSize(
	    	    new Dimension(655, 70)
	    	);

	    	cardFuncionario.setAlignmentX(Component.LEFT_ALIGNMENT);
	    
	    
        //panelNome.setOpaque(false);
        //panelInfo.setOpaque(false);
        
        cardFuncionario.addMouseListener(
        		new MouseAdapter() {
        			
        			@Override
        			public void mouseClicked(MouseEvent e) {
        				
        				InformacoesFuncionario janela = new InformacoesFuncionario( id, nome, cargo, status);
      
        					janela.setVisible(true);
        			}
        		}
        		);
		
		return cardFuncionario;
	}

}
