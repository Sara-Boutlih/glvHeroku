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

import com.glv.entities.Role;
import com.glv.service.roleService;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/roles")
public class roleController {
	@Autowired
	private roleService roleService;
	
	// API qui ajoute un role	
	@PostMapping("/addRole")
	public Role addRole(@RequestBody Role role) {		
		return roleService.addRole(role);
		}	
	
	// API qui retourne la liste des roles
	@GetMapping("allRoles")
	public List<Role> allRoles(){
		return roleService.allRoles();
		}
	
	// API pour supprimer un role spécifique	
	@DeleteMapping("/deleteRole/{id}")
	public void deleteRole(@PathVariable("id")long id){
		roleService.deleteByID(id);
		}
	
	// API pour modifier un utilisateur
	@PutMapping("/updateUser")  
		public Role updateRole(@RequestBody Role role){  
		roleService.saveOrUpdate(role);  
		return role;  
		} 
	
	
	
		
	// API pour chercher un role
	@GetMapping("/searchRole/{id}")  
		public Role getRole(@PathVariable("id") Long id){  
		return roleService.getRoleById(id);  
		}
			
}
