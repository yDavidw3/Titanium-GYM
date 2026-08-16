package model;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class PagamentoBoleto extends Pagamento {
	
	private String codBarras;
	private String dataVencimento;

	public PagamentoBoleto(LocalDate dataPagamento, String status, String codBarras, String dataVencimento) {
		super(dataPagamento, status);
		this.codBarras = codBarras;
		this.dataVencimento = dataVencimento;
	}
	
	public void mostrarDadosBoleto() {
		JOptionPane.showMessageDialog(null, "Data do Pagamento: " + getDataPagamento() + "\nStatus: " + getStatus() + "\nData do Vencimento: " +getDataVencimento(), "Dados do pagamento", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	
	
	

}
