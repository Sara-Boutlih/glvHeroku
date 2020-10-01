package com.glv.entities;



import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="utilisateur")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Utilisateur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1854379550796503541L;
	@Id
	@GeneratedValue
	
	private Long id;	
	private String nom;	
	private String prenom;	
	private String email;
	private String password;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_role")
	private Role role;



	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Utilisateur(Long id, String nom, String prenom, String email, String password, Role role) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.role = role;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}

	
	

}
