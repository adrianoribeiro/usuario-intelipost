package com.intelipost.usuario.model;

import java.time.LocalDate;

public class User {
	
	private Long id;
	private LocalDate dataNascimento;
	private String nome;
	private PerfilEnum perfil;
	
	public User(long id, String nome, PerfilEnum perfil, LocalDate dataNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.perfil = perfil;
		this.dataNascimento = dataNascimento;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public PerfilEnum getPerfil() {
		return perfil;
	}
	public void setPerfil(PerfilEnum perfil) {
		this.perfil = perfil;
	}
}
