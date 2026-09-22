
package views;

import javax.swing.*;
import java.awt.*;

public class Plano extends JDialog {

    public Plano() {

        this.setTitle("Planos - Academia Titanium");
        this.setModal(true);
        this.setSize(900, 700);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setLayout(null);


        
        JLabel titulo = new JLabel("Planos da Academia Titanium");
        titulo.setBounds(30, 20, 800, 40);
        titulo.setFont(new Font("Arial", Font.BOLD, 28));
        titulo.setForeground(Color.BLUE);
        add(titulo);


        
        JLabel subtitulo = new JLabel("Escolha o plano que mais combina com você");
        subtitulo.setBounds(32, 60, 600, 25);
        subtitulo.setFont(new Font("Arial", Font.PLAIN, 15));
        subtitulo.setForeground(Color.GRAY);
        add(subtitulo);


       

        JLabel standard = new JLabel("STANDARD");
        standard.setBounds(40, 110, 250, 35);
        standard.setFont(new Font("Arial", Font.BOLD, 20));
        standard.setForeground(Color.BLUE);
        add(standard);


        JLabel standardInfo = new JLabel(
            "<html>• Acesso à musculação<br>" +
            "• Acesso aos equipamentos<br>" +
            "• Avaliação física mensal<br>" +
            "• Horário de funcionamento normal</html>"
        );
        standardInfo.setBounds(40, 155, 250, 120);
        standardInfo.setFont(new Font("Arial", Font.PLAIN, 14));
        add(standardInfo);


        JLabel standardPreco = new JLabel(
            "<html>Mensal: R$ 79,90<br>" +
            "Trimestral: R$ 219,90<br>" +
            "Anual: R$ 749,90</html>"
        );
        standardPreco.setBounds(40, 285, 250, 80);
        standardPreco.setFont(new Font("Arial", Font.BOLD, 14));
        add(standardPreco);


        

        JLabel premium = new JLabel("PREMIUM");
        premium.setBounds(320, 110, 250, 35);
        premium.setFont(new Font("Arial", Font.BOLD, 20));
        premium.setForeground(Color.BLUE);
        add(premium);


        JLabel premiumInfo = new JLabel(
            "<html>• Tudo do plano Standard<br>" +
            "• Avaliação física completa<br>" +
            "• Acompanhamento profissional<br>" +
            "• Aulas coletivas</html>"
        );
        premiumInfo.setBounds(320, 155, 250, 120);
        premiumInfo.setFont(new Font("Arial", Font.PLAIN, 14));
        add(premiumInfo);


        JLabel premiumPreco = new JLabel(
            "<html>Mensal: R$ 109,90<br>" +
            "Trimestral: R$ 299,90<br>" +
            "Anual: R$ 999,90</html>"
        );
        premiumPreco.setBounds(320, 285, 250, 80);
        premiumPreco.setFont(new Font("Arial", Font.BOLD, 14));
        add(premiumPreco);


        

        JLabel black = new JLabel("BLACK");
        black.setBounds(600, 110, 250, 35);
        black.setFont(new Font("Arial", Font.BOLD, 20));
        black.setForeground(Color.BLUE);
        add(black);


        JLabel blackInfo = new JLabel(
            "<html>• Tudo do plano Premium<br>" +
            "• Personal trainer<br>" +
            "• Acesso exclusivo<br>" +
            "• Acesso em qualquer horário</html>"
        );
        blackInfo.setBounds(600, 155, 250, 120);
        blackInfo.setFont(new Font("Arial", Font.PLAIN, 14));
        add(blackInfo);


        JLabel blackPreco = new JLabel(
            "<html>Mensal: R$ 149,90<br>" +
            "Trimestral: R$ 399,90<br>" +
            "Anual: R$ 1.399,90</html>"
        );
        blackPreco.setBounds(600, 285, 250, 80);
        blackPreco.setFont(new Font("Arial", Font.BOLD, 14));
        add(blackPreco);


        
        JLabel linha = new JLabel(
            "____________________________________________________________"
        );
        linha.setBounds(40, 380, 800, 30);
        linha.setForeground(Color.GRAY);
        add(linha);


        
        JLabel periodo = new JLabel("Períodos disponíveis");
        periodo.setBounds(40, 420, 300, 30);
        periodo.setFont(new Font("Arial", Font.BOLD, 18));
        periodo.setForeground(Color.BLUE);
        add(periodo);


        
        JLabel periodos = new JLabel(
            "<html>Mensal - pagamento realizado todos os meses<br>" +
            "Trimestral - pagamento a cada 3 meses<br>" +
            "Anual - pagamento realizado uma vez por ano</html>"
        );
        periodos.setBounds(40, 460, 600, 80);
        periodos.setFont(new Font("Arial", Font.PLAIN, 15));
        add(periodos);


        
        JButton fechar = new JButton("Fechar");
        fechar.setBounds(40, 570, 800, 45);
        fechar.setFont(new Font("Arial", Font.BOLD, 16));
        fechar.setBackground(Color.BLUE);
        fechar.setForeground(Color.WHITE);
        add(fechar);


        
        fechar.addActionListener(e -> {

            dispose();

        });


        setVisible(true);
    }
}

