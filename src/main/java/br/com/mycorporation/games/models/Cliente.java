package br.com.mycorporation.games.models;

import java.time.LocalDate;


import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String CPF;
	private String email;
	private String telefone;
	private LocalDate data = LocalDate.now();
	@Embedded
	private LoginDeAcesso loginDeAcesso;
	@ManyToOne
	private Compra compra;
	
	public Cliente() {
	}

	public Cliente(String nome, String cPF, String email, String telefone, LocalDate data, String usuario, String senha, 
			LoginDeAcesso loginDeAcesso) {
		this.nome = nome;
		CPF = cPF;
		this.email = email;
		this.telefone = telefone;
		this.data = data;
		this.loginDeAcesso = new LoginDeAcesso(usuario, senha);
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
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public LoginDeAcesso getLoginDeAcesso() {
		return loginDeAcesso;
	}
	public void setLoginDeAcesso(LoginDeAcesso loginDeAcesso) {
		this.loginDeAcesso = loginDeAcesso;
	}
	
}
