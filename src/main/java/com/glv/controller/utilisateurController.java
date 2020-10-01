package com.glv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.glv.entities.Utilisateur;
import com.glv.service.utilisateurService;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/utilisateurs")
public class utilisateurController {
	@Autowired
	private utilisateurService utilisateurService;
	/* API qui ajoute un utilisateur	
	@PostMapping("/addUtilisateur")
	public Utilisateur addUtilisateur(
			@RequestParam("nom") String nom, 
			@RequestParam("prenom") String prenom,
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			@RequestParam("idRole") long idRole) {
		Role roleuser = new Role();
		Utilisateur user = new Utilisateur();
		roleuser = roleService.getRoleById(idRole);
		user.setEmail(email);
		user.setNom(nom);
		user.setPrenom(prenom);
		user.setPassword(password);
		user.setRole(roleuser);
		return utilisateurService.addUtilisateur(user);
	}*/
	
	@PostMapping("/addUtilisateur")
	public Utilisateur addUtilisateur(
			@RequestBody Utilisateur user) {
		return utilisateurService.addUtilisateur(user);
	}
	

	// API qui retourne la liste des Utilisateurs 
	@GetMapping("/allUsers")
    public List<Utilisateur> allUsers() {		
		return utilisateurService.allUsers();
			}
	
	
	
	// API pour supprimer un utilisateur spécifique	
	@DeleteMapping("/deleteUser/{id}")  
	public void deleteUser(@PathVariable("id") long id){
		utilisateurService.deleteById(id); 
		
	}  
	
	// API pour modifier un utilisateur
	@PutMapping("/updateUser")  
	public Utilisateur update(@RequestBody Utilisateur user)   
	{  
		utilisateurService.saveOrUpdate(user);  
	return user;  
	}  
	
	
	// API pour chercher un utilisateur
	@GetMapping("/searchUser/{id}")  
	public Utilisateur getUser(@PathVariable("id") Long id){  
	return utilisateurService.getUserById(id);  
	}
}
