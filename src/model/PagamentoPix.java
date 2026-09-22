package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.JOptionPane;

public class PagamentoPix extends Pagamento {
	
	private String chavePix;
	
	public PagamentoPix(LocalDate dataPagamento, String status, String chavePix) {
		super(dataPagamento, status);
		this.chavePix = chavePix;
	}
	
	public void mostrarDadosPix() {
		JOptionPane.showMessageDialog(null,"Data do Pagamento: " + getDataPagamento() + " \nStatus: " + getStatus(), "Dados do pagamento", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}
}
