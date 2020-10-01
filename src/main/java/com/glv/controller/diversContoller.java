package com.glv.controller;

import java.util.TreeSet;
import java.util.Set;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
@RequestMapping(value="/form")
public class diversContoller {

// Premiere partie du formulaire (Caracteristique technique)	
	
	/*1 acsenseur
	 * 0 autre type installation
	 * 11 e-BASICLIFT P
	 * 12 e-LITE P
	 * 13 e-LIFT P
	 * 14 e-LIFT M
	 * 15 h-LIFT M
	 *2 monte charge
	 *3 monte plats
	 *4 mini monte charge
	 *5 monte malades
	 *6 platefome hydraulique
	 *7 homelif EPMR
	 *8 monte voiture
	 * */
	@GetMapping("/ChargeUtile/{id}")
	public Set<String> ChargeUtile(@PathVariable int id) {
		
		Set<String> col = new TreeSet<String>();
		
		switch(id) {
		
		case 11:
		case 12:
		case 14:
			col.add("320 Kg 4 Personnes");
			col.add("450 Kg 6 Personnes");
			col.add("630 Kg 8 Personnes");
			col.add("750 Kg 10 Personnes");
			break;
		case 13:
			col.add("450 Kg 6 Personnes");
			col.add("630 Kg 8 Personnes");
			col.add("800 Kg 10 Personnes");
			col.add("1000 Kg 13 Personnes");
			col.add("1000 Kg 13 Personnes");
			col.add("1275 Kg 17 Personnes");
			col.add("1600 Kg 21 Personnes");
			col.add("2000 Kg 26 Personnes");
			col.add("2500 Kg 33 Personnes");
			break;
		case 15:
			col.add("320 Kg 4 Personnes");
			col.add("450 Kg 6 Personnes");
			col.add("630 Kg 8 Personnes");
			col.add("800 Kg 10 Personnes");
			col.add("1000 Kg 13 Personnes");
			col.add("1000 Kg 13 Personnes");
			col.add("1275 Kg 17 Personnes");
			col.add("1600 Kg 20 Personnes");
			break;
		case 1:
		case 2:
			col.add("320 Kg 4 Personnes");
			col.add("375 Kg 5 Personnes");
			col.add("450 Kg 6 Personnes");
			col.add("630 Kg 8 Personnes");
			col.add("800 Kg 10 Personnes");
			col.add("1000 Kg 13 Personnes");
			col.add("1275 Kg 17 Personnes");
			col.add("1600 Kg 21 Personnes");
			col.add("2000 Kg 26 Personnes");
			col.add("2500 Kg 33 Personnes");
			break;
		case 3:
			col.add("50 Kg");
			col.add("100 Kg");
			break;
		case 4:
			col.add("50 Kg");
			col.add("100 Kg");
			col.add("200 Kg");
			col.add("300 Kg");
			break;
		case 5:
		case 6:
			col.add("1000 Kg 13 Personnes");
			col.add("1275 Kg 17 Personnes");
			col.add("1600 Kg 21 Personnes");
			break;
		case 7:
			col.add("200 Kg 2 Personnes");
			col.add("250 Kg 3 Personnes");
			col.add("340 Kg 4 Personnes");
			break;
		case 8:
			col.add("2500 Kg");
			col.add("4500 Kg");
			break;	
		}
		
		return col;
	}
	
	@GetMapping("/ModeEntrainement")
	public Set<String> ModeEntrainement() {
		
		Set<String> col = new TreeSet<String>();

			col.add("Hydraulique");
			col.add("Electrique 2V");
			col.add("Electrique 3VF");
			col.add("Gearless");
		
		return col;
	}
	@GetMapping("/Vitesse/{id}")
	public Set<String> Vitesse(@PathVariable int id) {
		
		Set<String> col = new TreeSet<String>();
		
		switch(id) {
		case 0:
			col.add("0,15 m/s");
			col.add("0,20 m/s");
			col.add("0,40 m/s");
			col.add("0,50 m/s");
			col.add("0,60 m/s");
			col.add("0,80 m/s");
			col.add("1 m/s");
			col.add("1,20 m/s");
			col.add("1,40 m/s");
			col.add("1,50 m/s");
			col.add("1,60 m/s");
			break;
		case 1:
		case 2:
			col.add("0,15 m/s");
			col.add("0,20 m/s");
			col.add("0,40 m/s");
			col.add("0,50 m/s");
			col.add("0,60 m/s");
			col.add("0,80 m/s");
			col.add("1 m/s");
			break;
		case 3:
			col.add("1 m/s");
			col.add("1 m/s");
			col.add("1 m/s");
			col.add("1 m/s");
			col.add("1 m/s");
			col.add("1 m/s");
			col.add("1 m/s");
			col.add("1 m/s");
			col.add("1 m/s");
			break;
		case 4:
			col.add("1 m/s");
			col.add("1 m/s");
			col.add("1 m/s");
			col.add("1 m/s");
			break;
		case 5:
			col.add("0,63 m/s");
			col.add("0,63 m/s");
			col.add("0,63 m/s");
			col.add("0,63 m/s");
			col.add("0,63 m/s");
			col.add("0,63 m/s");
			col.add("0,63 m/s");
			break;
	
	
		}
			

		return col;
	}
	
	@GetMapping("/NbArrets")
	public Set<String> NbArrets() {
		
		Set<String> col = new TreeSet<String>();
		 
			col.add("2 arrêts");
			col.add("3 arrêts");
			col.add("4 arrêts");
			col.add("5 arrêts");
			col.add("6 arrêts");
			col.add("7 arrêts");
			col.add("8 arrêts");
			col.add("9 arrêts");
			col.add("10 arrêts");
			col.add("11 arrêts");
			col.add("12 arrêts");
			col.add("13 arrêts");
			col.add("14 arrêts");
			col.add("15 arrêts");
			col.add("16 arrêts");
			col.add("17 arrêts");
			col.add("18 arrêts");
			col.add("19 arrêts");
			col.add("20 arrêts");

		
		return col;
	}
	
	@GetMapping("/Acces")
	public Set<String> Acces() {
		
		Set<String> col = new TreeSet<String>();

			col.add("Un seul");
			col.add("Double a 90°");
			col.add("Double a 180°");

		return col;
	}
	
	@GetMapping("/TypeGaine")
	public Set<String> TypeGaine() {
		
		Set<String> col = new TreeSet<String>();
		

			col.add("Béton");
			col.add("Brique");
			col.add("Structure Métallique");

		return col;
	}
	
	@GetMapping("/LocalMachinerie")
	public Set<String> LocalMachinerie() {
		
		Set<String> col = new TreeSet<String>();

			col.add("En Térasse");
			col.add("En tête de gaine");
			col.add("En Bas Adjacente de la gaine");

		return col;
	}
	
	@GetMapping("/AlimentationMoteur")
	public Set<String> AlimentationMoteur( ) {
		
		Set<String> col = new TreeSet<String>();
		
			col.add("220 V monophasé");
			col.add("380 V triphasé");

		return col;
	}
	
	@GetMapping("/TypeManoeuvre")
	public Set<String> TypeManoeuvre() {
		
		Set<String> col = new TreeSet<String>();
		
			col.add("A pression maintenue");
			col.add("A blocage");
			col.add("Collective descente");
			col.add("Collective montée descente");
		return col;
	}

	// Dexieme partie du formulaire (Caracteristque Cabine)	
	
	
	/*
	 * 1 e-BASICLIFT P
	 * 2 e-LITE P
	 * 3 e-LIFT P
	 * 4 e-LIFT M
	 * 5 h-LIFT M
	 */
	
	@GetMapping("/DimensionCabine/{id}")
	public Set<String> DimensionCabine(@PathVariable int id) {
		//largeur, profondeur, hauteur
		Set<String> col = new TreeSet<String>();
		
		switch(id) {
		case 1:
		case 2:
			col.add("1000x900x2070");
			col.add("1150x1100x2070");
			col.add("1100x1400x2070");
			col.add("1400x1350x2070");
			break;
		case 3:
			col.add("1000x1200x2170");
			col.add("1100x1400x2170");
			col.add("1350x1450x2170");
			col.add("1100x2100x2170");
			col.add("1400x1600x2170");
			col.add("1200x2300x2170");
			col.add("1400x2400x2170");
			col.add("1500x2700x2170");
			col.add("1800x2700x2170");
			break;
		case 4:
			col.add("900x1000x2170");
			col.add("1000x1200x2170");
			col.add("1100x1400x2170");
			col.add("1350x1400x2170");
			break;
		case 5:
			col.add("1000x900x2170");
			col.add("1000x1200x2170");
			col.add("1100x1400x2170");
			col.add("1100x2100x2170");
			col.add("1100x2100x2170");
			col.add("1200x2300x2170");
			col.add("1400x2400x2170");
			break;	
		}
		
		return col;
	}
	
	@GetMapping("/DimensionGaine/{id}")
	public Set<String> DimensionGaine(@PathVariable int id) {
		//largeur, profondeur
		Set<String> col = new TreeSet<String>();
		
		switch(id) {
		case 1:
		case 2:
			col.add("1400x1400");
			col.add("1500x1600");
			col.add("1500x1900");
			col.add("1800x1900");
			break;
		case 3:
			col.add("1650x1550");
			col.add("1750x1750");
			col.add("2000x1800");
			col.add("1850x2450");
			col.add("2050x2000");
			col.add("1950x2650");
			col.add("2350x2750");
			col.add("2450x3050");
			col.add("2750x3050");
			break;
		case 4:
			col.add("1400x1450");
			col.add("1500x1650");
			col.add("1600x1750");
			col.add("1900x1750");
			break;
		case 5:
			col.add("1450x1300");
			col.add("1500x1600");
			col.add("1600x1800");
			col.add("1750x2500");
			col.add("1850x2500");
			col.add("1950x2650");
			col.add("2200x2750");
			break;	
		}
		
		return col;
	}
	

	@GetMapping("/Portes/{id}")
	public Set<String> Portes(@PathVariable int id) {
		//type, largeur, profondeur
		Set<String> col = new TreeSet<String>();
		
		switch(id) {
		case 1:
		case 2:
			col.add("T2H-700x2000");
			col.add("T2H-800x2000");
			col.add("T2H-800x2000");
			col.add("T2H-900x2000");
			break;
		case 3:
			col.add("T2H-800x2000");
			col.add("T2H-900x2000");
			col.add("T2H-900x2000");
			col.add("T2H-1000x2000");
			col.add("T2H-1000x2000");
			col.add("T2H-1000x2000");
			col.add("T2H-1300x2000");
			col.add("T2H-1300x2000");
			col.add("T2H-1400x2000");
			break;
		case 4:
			col.add("T2H-700x2000");
			col.add("T2H-800x2000");
			col.add("T2H-900x2000");
			col.add("T2H-900x2000");
			break;
		case 5:
			col.add("T2H-700x2000");
			col.add("T2H-800x2000");
			col.add("T2H-900x2000");
			col.add("T2H-900x2000");
			col.add("T2H-1000x2000");
			col.add("T2H-1000x2000");
			col.add("T2H-1300x2000");
			break;	
		}
		
		return col;
	}
	
	@GetMapping("/Fosse/{id}")
	public Set<String> Fosse(@PathVariable int id) {
		//mm
		Set<String> col = new TreeSet<String>();
		
		switch(id) {
		case 1:
			col.add("1200");
			col.add("1200");
			col.add("1200");
			col.add("1200");
			break;
		case 2:
			col.add("800");
			col.add("800");
			col.add("800");
			col.add("800");
			break;
		case 3:
			col.add("1200");
			col.add("1200");
			col.add("1200");
			col.add("1200");
			col.add("1200");
			col.add("1200");
			col.add("1300");
			col.add("1300");
			col.add("1650");
			break;
		case 4:
			col.add("1200");
			col.add("1200");
			col.add("1200");
			col.add("1300");
			break;
		case 5:
			col.add("1200");
			col.add("1200");
			col.add("1200");
			col.add("1300");
			col.add("1300");
			col.add("1300");
			col.add("1300");
		
			break;	
		}
		
		return col;
	}
	
	@GetMapping("/HorsCourse/{id}")
	public Set<String> HorsCourse(@PathVariable int id) {
		//en mm
		Set<String> col = new TreeSet<String>();
		
		switch(id) {
		case 1:
		case 2:
			col.add("3600");
			col.add("3600");
			col.add("3600");
			col.add("3600");
			break;
		case 3:
			col.add("3600");
			col.add("3600");
			col.add("3600");
			col.add("3700");
			col.add("3700");
			col.add("3700");
			col.add("3950");
			col.add("3950");
			col.add("4250");
			break;
		case 4:
			col.add("3400");
			col.add("3400");
			col.add("3500");
			col.add("3500");
			break;
		case 5:
			col.add("3400");
			col.add("3400");
			col.add("3400");
			col.add("3400");
			col.add("3400");
			col.add("3400");
			col.add("3400");
		
			break;	
		}
		
		return col;
	}
	
	
	@GetMapping("/Modele")
	public Set<String> Modele() {
		
		Set<String> col = new TreeSet<String>();
		
			col.add("CAMBRIAN");
			col.add("CAMBRIAN INOX");
			col.add("CHAMONIX");
			col.add("CHAMONIX INOX");
			col.add("NEO - M1");
			col.add("NEO - M2");
			col.add("NEO - CP");
		return col;
	}
	
	/*@GetMapping("/ModeleNeo")
	public Set<String> ModeleNeo() {
		
		Set<String> col = new TreeSet<String>();
		
			col.add("Néo F1 Formica");
			col.add("Néo M1 Mélamine");
			col.add("Néo CP Tôle peinte");
			col.add("Néo S Skinplate");
			col.add("Néo I Inox");
		return col;
	}*/
	
	@GetMapping("/revetementSol")
	public Set<String> revetementSol() {
		
		Set<String> col = new TreeSet<String>();
		
			col.add("PVC antartica anthracite");
			col.add("Caoutchouc");
			col.add("Granit naturel");
			col.add("Granit artificiel");
			col.add("Tôle striée");
		return col;
	}
	
	@GetMapping("/Mirroir")
	public Set<String> Mirroir() {
		
		Set<String> col = new TreeSet<String>();
		
			col.add("Sans");
			col.add("Mi-hauteur au fond");
			col.add("Toute hauteur au fond");
			
		return col;
	}
	
	// Troisieme partie du formulaire (Caracteristque portes paliers)

	@GetMapping("/TypePortes")
	public Set<String> Type() {
		
		Set<String> col = new TreeSet<String>();
		
			col.add("Automatique");
			col.add("Battante");
			col.add("Toute hauteur au fond");
			
		return col;
	}
	
	@GetMapping("/Ouverture")
	public Set<String> Ouverture() {
		
		Set<String> col = new TreeSet<String>();
		
			col.add("Manuelle");
			col.add("Téléscopique latérale 2V");
			col.add("Centrale 2V");
			col.add("Téléscopique latérale 3V");
			col.add("Centrale 4V");
			
		return col;
	}
	
	@GetMapping("/Finition")
	public Set<String> Finition() {
		
		Set<String> col = new TreeSet<String>();
		
			col.add("Vitrée");
			col.add("Epoxy");
			col.add("Inox satiné");
			col.add("Inox brossé");
			col.add("Inox mirroir");
			col.add("Inox linen");
			col.add("Inox leather skin");
	
		return col;
	}
	
	@GetMapping("/Passagelibre")
	public Set<String> Passagelibre() {
		
		Set<String> col = new TreeSet<String>();
		
			col.add("700 L x 2000H");
			col.add("750 L x 2000H");
			col.add("800 L x 2000H");
			col.add("900 L x 2000H");
			col.add("1000 L x 2000H");
			col.add("1100 L x 2000H");
			col.add("1200 L x 2000H");
			col.add("1400 L x 2000H");
			col.add("1600 L x 2000H");
			col.add("1800 L x 2000H");
			
		return col;
	}
	
	@GetMapping("/Destinataire")
	public Set<String> destinataire() {
		
		Set<String> col = new TreeSet<String>();
		
			col.add("Particulier");
			col.add("Société");
			col.add("Commerçant");			
			col.add("Industriel");
			
		return col;
	}
	
	@GetMapping("/Disponibilité")
	public Set<String> disponibilite() {
		
		Set<String> col = new TreeSet<String>();
		
			col.add("8H-12H");
			col.add("12H-14H");
			col.add("14H-18H");			
			col.add("18H-20H");
			col.add("Peu importe");

		return col;
	}
}
