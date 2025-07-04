package br.com.mycorporation.games.models;

import javax.persistence.Embeddable;

@Embeddable
public class LoginDeAcesso {
	
	private String usuario;
	private String senha;
	
	
	public LoginDeAcesso(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	public LoginDeAcesso() {
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
}
