
package views;

import javax.swing.*;
import java.awt.*;

public class Sobre extends JDialog {

    public Sobre() {

        this.setTitle("Sobre Nós - Academia Titanium");
        this.setModal(true);
        this.setSize(700, 650);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setLayout(null);


        // TÍTULO
        JLabel titulo = new JLabel("Sobre Nós");
        titulo.setBounds(30, 20, 600, 40);
        titulo.setFont(new Font("Arial", Font.BOLD, 28));
        titulo.setForeground(Color.BLUE);
        add(titulo);


        // NOME DA ACADEMIA
        JLabel academia = new JLabel("Academia Titanium");
        academia.setBounds(30, 75, 600, 35);
        academia.setFont(new Font("Arial", Font.BOLD, 22));
        academia.setForeground(Color.DARK_GRAY);
        add(academia);


        // INTUITO DO PROJETO
        JLabel intuito = new JLabel("Intuito do projeto");
        intuito.setBounds(30, 125, 300, 30);
        intuito.setFont(new Font("Arial", Font.BOLD, 18));
        intuito.setForeground(Color.BLUE);
        add(intuito);


        JLabel texto1 = new JLabel("A Academia Titanium tem como objetivo oferecer uma solução");
        texto1.setBounds(30, 160, 620, 30);
        texto1.setFont(new Font("Arial", Font.PLAIN, 15));
        add(texto1);


        JLabel texto2 = new JLabel("simples e organizada para o gerenciamento da academia,");
        texto2.setBounds(30, 185, 620, 30);
        texto2.setFont(new Font("Arial", Font.PLAIN, 15));
        add(texto2);


        JLabel texto3 = new JLabel("<html>facilitando o cadastro de alunos e funcionários e a organização");
        texto3.setBounds(30, 210, 620, 30);
        texto3.setFont(new Font("Arial", Font.PLAIN, 15));
        add(texto3);


        JLabel texto4 = new JLabel("das informações do estabelecimento.");
        texto4.setBounds(30, 235, 620, 30);
        texto4.setFont(new Font("Arial", Font.PLAIN, 15));
        add(texto4);


        // DESENVOLVEDORES
        JLabel desenvolvedores = new JLabel("Desenvolvedores");
        desenvolvedores.setBounds(30, 290, 300, 30);
        desenvolvedores.setFont(new Font("Arial", Font.BOLD, 18));
        desenvolvedores.setForeground(Color.BLUE);
        add(desenvolvedores);


        
        JLabel kaique = new JLabel("Kaique Santos");
        kaique.setBounds(30, 335, 300, 30);
        kaique.setFont(new Font("Arial", Font.BOLD, 16));
        add(kaique);

        JLabel cargoKaique = new JLabel("Full-Stack");
        cargoKaique.setBounds(30, 365, 300, 25);
        cargoKaique.setFont(new Font("Arial", Font.PLAIN, 14));
        cargoKaique.setForeground(Color.GRAY);
        add(cargoKaique);


        
        JLabel david = new JLabel("David Paiva");
        david.setBounds(350, 335, 300, 30);
        david.setFont(new Font("Arial", Font.BOLD, 16));
        add(david);

        JLabel cargoDavid = new JLabel("Full-Stack");
        cargoDavid.setBounds(350, 365, 300, 25);
        cargoDavid.setFont(new Font("Arial", Font.PLAIN, 14));
        cargoDavid.setForeground(Color.GRAY);
        add(cargoDavid);


        
        JLabel breno = new JLabel("Breno Dourado");
        breno.setBounds(30, 415, 300, 30);
        breno.setFont(new Font("Arial", Font.BOLD, 16));
        add(breno);

        JLabel cargoBreno = new JLabel("Full-Stack");
        cargoBreno.setBounds(30, 445, 300, 25);
        cargoBreno.setFont(new Font("Arial", Font.PLAIN, 14));
        cargoBreno.setForeground(Color.GRAY);
        add(cargoBreno);


        
        JLabel isaac = new JLabel("Isaac Duwe");
        isaac.setBounds(350, 415, 300, 30);
        isaac.setFont(new Font("Arial", Font.BOLD, 16));
        add(isaac);

        JLabel cargoIsaac = new JLabel("Design");
        cargoIsaac.setBounds(350, 445, 300, 25);
        cargoIsaac.setFont(new Font("Arial", Font.PLAIN, 14));
        cargoIsaac.setForeground(Color.GRAY);
        add(cargoIsaac);


        
        JButton fechar = new JButton("Fechar");
        fechar.setBounds(30, 510, 620, 40);
        fechar.setFont(new Font("Arial", Font.BOLD, 15));
        add(fechar);


        
        fechar.addActionListener(e -> {
            dispose();
        });


        setVisible(true);
    }
}
