package views;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing. *;
import javax.swing.border.TitledBorder;
import javax.swing.JOptionPane;

public class Login extends JDialog {
	
	public Login() {
		this.setTitle("Login");
	    this.setModal(true);
	    this.setSize(800,500);  
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);	
	    
	    this.setLayout(null);
	    
	    JLabel titulo1 = new JLabel("Seja Bem-Vindo!", SwingConstants.CENTER);
	    titulo1.setFont(new Font("Arial", Font.BOLD, 18));
	    titulo1.setBounds(250, 40, 300, 40);
	    this.add(titulo1);
	    
	    JLabel titulo2 = new JLabel("Faça login para recursos", SwingConstants.CENTER);
	    titulo2.setFont(new Font("Arial", Font.BOLD, 18));
	    titulo2.setBounds(250, 70, 300, 40);
	    this.add(titulo2);
	    
		JLabel email= new JLabel("E-mail");
		email.setBounds(250, 110, 300, 40);
		this.add(email);
		
	    JTextField campo1 = new JTextField();
	    campo1.setBounds(250, 140, 300, 40);
		this.add(campo1);
		
		JLabel senha= new JLabel("Senha");
		senha.setBounds(250, 180, 300, 40);
		this.add(senha);
		
		JPasswordField campo2 = new JPasswordField();
	    campo2.setBounds(250, 210, 300, 40);
		this.add(campo2);
		
		JButton botaoLogin = new JButton("Entrar");
		botaoLogin.setBounds(250, 270, 300, 40);
		this.add(botaoLogin);
		
		String adminEmail = "admin@email.com";
		String adminSenha = "senhaforte";
		
		
		botaoLogin.addActionListener(
				new ActionListener () {
					@Override
					public void actionPerformed(ActionEvent e) {
						String senha = new String(campo2.getPassword());
						String usuario = campo1.getText();
						
						if(usuario.equals(adminEmail) && senha.equals(adminSenha)) {
							dispose();
							new Dashboard();
						}else {
							JOptionPane.showMessageDialog(null, "Email e/ou senha inválidos", "Erro", JOptionPane.INFORMATION_MESSAGE);
						}
						
						
					}
				}
		);
			
		this.setVisible(true);

	}

}

