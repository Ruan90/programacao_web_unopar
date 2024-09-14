package com.example.demo.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "User")
@Table(name = "tb_user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String telefone;
	private String password;
	
	public User() {}
	
	public User(Long id, String nome, String email, String telefone, String password) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.password = password;
	}
	
	public void atualizaInformacoes(User dadosUsuario) {
		if(dadosUsuario.getNome() != null) {
			this.nome = dadosUsuario.getNome();
		}
		if(dadosUsuario.getEmail() != null) {
			this.email = dadosUsuario.getEmail();
		}
		if(dadosUsuario.getTelefone() != null) {
			this.telefone = dadosUsuario.getTelefone();
		}
		if(dadosUsuario.getPassword() != null) {
			this.password = dadosUsuario.getPassword();
		}
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
