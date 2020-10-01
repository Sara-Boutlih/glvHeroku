package com.glv.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="role")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4641081204933074839L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String role;
	
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(Long id, String role) {
		super();
		this.id = id;
		this.role = role;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	

}
