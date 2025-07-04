package br.com.mycorporation.games.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="jogos")
public class Jogos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true)
	private String nome;
	private String descriçao;
	private String desenvolvedor;
	private String publicaçao;
	private LocalDate dataLançamento;
	private Double preço;
	@Enumerated(EnumType.STRING)
	private Categoria categoria;
	private String classificaçao_indicativa;
	private String LinkDownload;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Cliente cliente;

	
	public Jogos() {
	}

	public Jogos(String nome, String descriçao, String desenvolvedor, String publicaçao, LocalDate dataLançamento,
			Double preço, Categoria categoria, String classificaçao_indicativa, String linkDownload) {
		this.nome = nome;
		this.descriçao = descriçao;
		this.desenvolvedor = desenvolvedor;
		this.publicaçao = publicaçao;
		this.dataLançamento = LocalDate.now();
		this.preço = preço;
		this.categoria = categoria;
		this.classificaçao_indicativa = classificaçao_indicativa;
		LinkDownload = linkDownload;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescriçao() {
		return descriçao;
	}


	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}


	public String getDesenvolvedor() {
		return desenvolvedor;
	}


	public void setDesenvolvedor(String desenvolvedor) {
		this.desenvolvedor = desenvolvedor;
	}


	public String getPublicaçao() {
		return publicaçao;
	}


	public void setPublicaçao(String publicaçao) {
		this.publicaçao = publicaçao;
	}


	public LocalDate getDataLançamento() {
		return dataLançamento;
	}


	public void setDataLançamento(LocalDate dataLançamento) {
		this.dataLançamento = dataLançamento;
	}


	public Double getPreço() {
		return preço;
	}


	public void setPreço(Double preço) {
		this.preço = preço;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public String getClassificaçao_indicativa() {
		return classificaçao_indicativa;
	}


	public void setClassificaçao_indicativa(String classificaçao_indicativa) {
		this.classificaçao_indicativa = classificaçao_indicativa;
	}


	public String getLinkDownload() {
		return LinkDownload;
	}


	public void setLinkDownload(String linkDownload) {
		LinkDownload = linkDownload;
	}

}
