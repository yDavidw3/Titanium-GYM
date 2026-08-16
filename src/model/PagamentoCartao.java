package model;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class PagamentoCartao extends Pagamento {
	
	private String numeroCartao;
	private String cvv;

	public PagamentoCartao(LocalDate dataPagamento, String status, String numeroCartao, String cvv) {
		super(dataPagamento, status);
		this.numeroCartao = numeroCartao;
		this.cvv = cvv;
		
	}
	
	public void mostrarDadosCartao() {
		JOptionPane.showMessageDialog(null, "Data do Pagamento: " + getDataPagamento() + " \nStatus: " + getStatus(), "Dados do pagamento", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

}
