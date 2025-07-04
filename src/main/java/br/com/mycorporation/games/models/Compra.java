package br.com.mycorporation.games.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="compras")
public class Compra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate dataDaCompra = LocalDate.now();
	private String status;
	@ManyToOne
	private Cliente cliente;
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Jogos> bibliotecaDeJogos = new ArrayList<>();
	
	
	public Compra(LocalDate dataDaCompra, String status, Cliente cliente, List<Jogos> bibliotecaDeJogos) {
		this.dataDaCompra = dataDaCompra;
		this.status = status;
		this.cliente = cliente;
		this.bibliotecaDeJogos = bibliotecaDeJogos;
	}


	public Compra() {
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public LocalDate getDataDaCompra() {
		return dataDaCompra;
	}


	public void setDataDaCompra(LocalDate dataDaCompra) {
		this.dataDaCompra = dataDaCompra;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public List<Jogos> getBibliotecaDeJogos() {
		return bibliotecaDeJogos;
	}


	public void setBibliotecaDeJogos(List<Jogos> bibliotecaDeJogos) {
		this.bibliotecaDeJogos = bibliotecaDeJogos;
	}

}
