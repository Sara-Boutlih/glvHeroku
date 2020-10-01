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

import com.glv.entities.Devis;
import com.glv.service.devisService;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/devis")
public class devisController {
	@Autowired
	private devisService devisService;
	
	//API Ajouter un devis
	@PostMapping("/addDevis")
   public Devis addDevis(@RequestBody Devis devis) {
		
		return devisService.addDevis(devis);
	}
	//API pour retourner tous les devis
	@GetMapping("/allDevis")
	   public List<Devis> allDevis() {
			
			return devisService.allDevis();
		}
	
	//API qui prend ID Devis et retourne ses infos
	@GetMapping("/getDevis/{devisid}")  
	private Devis getDevis(@PathVariable("devisid") int id)   
	{  
		return devisService.getDevisByID(id);
	 
	}
	
	// API pour supprimer un role spécifique	
		@DeleteMapping("/deleteDevis/{id}")
		public void deleteDevis(@PathVariable("id")long id){
			devisService.deleteByID(id);
			}
		
		// API pour modifier un devis
		@PutMapping("/updateDevis")  
		public Devis updateDevis(@RequestBody Devis devis){  
			devisService.saveOrUpdate(devis);  
			return devis;  
			} 

	

	
	
	
	
}
