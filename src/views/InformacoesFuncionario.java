package views;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;

public class InformacoesFuncionario extends JDialog {

	public InformacoesFuncionario(String id, String nome, String cargo, String status) {

        setTitle("Informações do Funcionário");
        setSize(500, 400);
        setModal(true);
        setLocationRelativeTo(null);
        setResizable(false);
        
        JLabel txtNome = new JLabel("Nome: "+ nome);
        JLabel txtId = new JLabel("ID: "+ id);
        JLabel txtCargo = new JLabel("cargo: "+ cargo);
        JLabel txtStatus = new JLabel("Status: "+ status);
        
        JPanel painelInfo = new JPanel();
        
        painelInfo.setLayout(
                new BoxLayout(painelInfo, BoxLayout.Y_AXIS)
            );
     
        painelInfo.add(txtNome);
        painelInfo.add(txtId);
        painelInfo.add(txtCargo);
        painelInfo.add(txtStatus);
        
        JButton Botao = new JButton("Editar");
        
        painelInfo.add(Botao, BorderLayout.SOUTH);
        
        
        add(painelInfo);
        
        Botao.setBorder(
        		BorderFactory.createEmptyBorder(10, 10, 10, 10)
        );
        
        painelInfo.setBorder(	
    	    	        BorderFactory.createEmptyBorder(10, 10, 10, 10)
        
        	);
        
        
        txtNome.setFont(
        	    new Font("Arial", Font.BOLD, 20)
        	);
        
        Font fonteInfo = new Font(
        	    "Arial",
        	    Font.PLAIN,
        	    14
        	);
        
        txtId.setFont(fonteInfo);
        txtCargo.setFont(fonteInfo);
        txtStatus.setFont(fonteInfo);
        
       
    }
}

