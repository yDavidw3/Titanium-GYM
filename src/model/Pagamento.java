package model;

import java.time.LocalDate;

public abstract class Pagamento {
	


	private LocalDate dataPagamento;
	private String status;
	
	public Pagamento(LocalDate dataPagamento, String status) {
		this.dataPagamento = dataPagamento;
		this.status = status;
	}


	public LocalDate getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	
	


}
