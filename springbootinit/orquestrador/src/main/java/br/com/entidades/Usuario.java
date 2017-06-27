package br.com.entidades;

import javax.persistence.*;


@Entity(name= "TB_USUARIO")
public class Usuario {

	@Id
	@GeneratedValue
	private Long id;

	@OneToOne
	@JoinColumn(name = "FK_PLANO")
	private Plano plano;

	@OneToOne
	@JoinColumn(name = "FK_PERFIL")
	private Perfil perfil;
	
	private String nome;
	
	private String email;
	
	private String telefone;

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

	public Plano getPlano() {return plano;}

	public void setPlano(Plano plano) {this.plano = plano;}

	public Perfil getPerfil() {return perfil;}

	public void setPerfil(Perfil perfil) {this.perfil = perfil;}




}
