package com.glv.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.glv.entities.Utilisateur;

@Component
public interface utilisateurService {

	public Utilisateur addUtilisateur(Utilisateur utilisateur);

	public List<Utilisateur> allUsers();

	public void deleteById(Long id);

	public Utilisateur saveOrUpdate(Utilisateur user);

	public Utilisateur getUserById(Long id);

}
