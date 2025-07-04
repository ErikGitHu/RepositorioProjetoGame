package br.com.mycorporation.games.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pagamentos")
public class Pagamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Enumerated(EnumType.STRING)
	private FormasDePagamento formaDePagamento;
	@Enumerated(EnumType.STRING)
	private StatusDoPagamento statusDoPagamento;
	private LocalDate dataPagamento = LocalDate.now();
	
	public Pagamento() {
	}

	public Pagamento(FormasDePagamento formaDePagamento, StatusDoPagamento statusDoPagamento, LocalDate dataPagamento) {
		this.formaDePagamento = formaDePagamento;
		this.statusDoPagamento = statusDoPagamento;
		this.dataPagamento = dataPagamento;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public FormasDePagamento getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(FormasDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	public StatusDoPagamento getStatusDoPagamento() {
		return statusDoPagamento;
	}
	public void setStatusDoPagamento(StatusDoPagamento statusDoPagamento) {
		this.statusDoPagamento = statusDoPagamento;
	}
	public LocalDate getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
}
