package views;

	import java.awt.BorderLayout;
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing. *;
	import javax.swing.border.TitledBorder;
	import javax.swing.JOptionPane;
	
	public class Cadastro extends JDialog{	

		public Cadastro() {
			this.setTitle("Cadastro");
		    this.setModal(true);
		    this.setSize(800,500);  
		    this.setResizable(false);
		    this.setLocationRelativeTo(null);	
		    
		    this.setLayout(null);
		    
		    JLabel titulo1 = new JLabel("Seja parte da família", SwingConstants.CENTER);
		    titulo1.setFont(new Font("Arial", Font.BOLD, 18));
		    titulo1.setBounds(250, 60, 300, 40);
		    this.add(titulo1);
		    
		    JLabel titulo2 = new JLabel("Faça login para recursos", SwingConstants.CENTER);
		    titulo2.setFont(new Font("Arial", Font.BOLD, 18));
		    titulo2.setBounds(250, 90, 300, 40);
		    this.add(titulo2);
		    
		    
		    JTextField campo1 = new JTextField();
		    campo1.setBounds(250, 140, 300, 40);
			this.add(campo1);
			
			JPasswordField campo2 = new JPasswordField();
		    campo2.setBounds(250, 200, 300, 40);
			this.add(campo2);
			
			JButton botaoLogin = new JButton("Entrar");
			botaoLogin.setBounds(250, 270, 300, 40);
			this.add(botaoLogin);
			
			botaoLogin.addActionListener(
					new ActionListener () {
						@Override
						public void actionPerformed(ActionEvent e) {
							String senha = new String(campo2.getPassword());
							String usuario = campo1.getText();
							
								dispose();
								new Dashboard();
						}
					}
			);
			
			
			
			this.setVisible(true);

		}

	}