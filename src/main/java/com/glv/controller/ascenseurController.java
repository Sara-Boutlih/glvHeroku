package com.glv.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/asc")

public class ascenseurController {
	
	
	
	@GetMapping("/provenance")
private ArrayList<String> Provenance() {
		
		ArrayList<String> col = new ArrayList<String>();

			col.add("Espagne");
			col.add("Italie");
			col.add("Europe");
		
		return col;
	}
	
	
	@GetMapping("/modeEntrainement")
	private ArrayList<String> ModeEntrainement() {
		
		ArrayList<String> col = new ArrayList<String>();

			col.add("Electrique 2V");
			col.add("Electrique 3VF");
			col.add("Machine Room Less");
			col.add("Hydraulique");
		
		return col;
	}
	

	@GetMapping("/nbrArret")
	private ArrayList<String> NbArrets() {
		
		ArrayList<String> col = new ArrayList<String>();
		 
			col.add("02 arrêts");
			col.add("03 arrêts");
			col.add("04 arrêts");
			col.add("05 arrêts");
			col.add("06 arrêts");
			col.add("07 arrêts");
			col.add("08 arrêts");
			col.add("09 arrêts");
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
	
	@GetMapping("/vitesse")
	private ArrayList<String> Vitesse() {
		
		ArrayList<String> col = new ArrayList<String>();
		
		
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
			
			return col;
			
			}


	

	@GetMapping("/localMachinerie2v")
	private ArrayList<String> LocalMachinerie2v() {
		
		ArrayList<String> col = new ArrayList<String>();
		
		col.add("En Térasse");
		return col;
		
	}
	
	@GetMapping("/localMachinerie3v")
	private ArrayList<String> LocalMachinerie3v() {
		
		ArrayList<String> col = new ArrayList<String>();
		
		col.add("En Térasse");
		return col;
		
	}
		
	@GetMapping("/mrl")
	private ArrayList<String> mrl() {
			
			ArrayList<String> col = new ArrayList<String>();
	
		col.add("En tête de gaine");
		return col;
		
		}
		
	@GetMapping("/localMachinerieHydr")
	private ArrayList<String> LocalMachinerieHydr() {
			
			ArrayList<String> col = new ArrayList<String>();	

		col.add("En bas adjacente de la gaine");
		
		return col;
	    }
	
	@GetMapping("/acces")
	private ArrayList<String> Acces() {
		
		ArrayList<String> col = new ArrayList<String>();

			col.add("Un seul");
			col.add("Double a 90°");
			col.add("Double a 180°");

		return col;
	}
	
	@GetMapping("/chargeUtile")
	private ArrayList<String> ChargeUtile() {
		ArrayList<String> col = new ArrayList<String>();
	
		
		col.add("320 Kg 4 Personnes");
		col.add("375 Kg 5 Personnes");
		col.add("450 Kg 6 Personnes ");
		col.add("630 Kg 8 Personnes");
		col.add("800 Kg 10 Personnes");
		col.add("1000 Kg 13 Personnes");
		col.add("1275 Kg 17 Personnes");
		col.add("1600 Kg 21 Personnes");
		col.add("2000 Kg 26 Personnes");
		col.add("2500 Kg 33 Personnes");
		 return col;

}
	@GetMapping("/modeleEspagne")
	private ArrayList<String> Modele() {
		
		ArrayList<String> col = new ArrayList<String>();
	
		
		
			col.add("CAMBRIAN");
			col.add("CAMBRIAN INOX");
			col.add("CHAMONIX");
			col.add("CHAMONIX INOX");
			col.add("NEO - M1");
			col.add("NEO - M2");
			col.add("NEO - CP");
			return col;
	}
	@GetMapping("/modeleItalie")
	private ArrayList<String> ModeleItalie() {
		
		ArrayList<String> col = new ArrayList<String>();
	
			col.add("DOMUS 2015");
			return col;
	}
	@GetMapping("/modeleEurope")
	private ArrayList<String> ModeleEurope() {
		
		ArrayList<String> col = new ArrayList<String>();
		
			col.add("Modern Life L310");
			col.add("Modern Life L510");
			col.add("Athena A310 Stratifié");
			col.add("Athena A310 Mélamine");
			col.add("Athena Α510");
			col.add("L 530 | 1");
			col.add("L 530 | 2");
			
		return col;
	}
	
	@GetMapping("/typePorte4")
	private String TypePortes4() {
		// 4 et 5		
		return "700 mm";
	}
				
	@GetMapping("/typePorte6")
	private String TypePortes6() {
     	//6et 8	
		return "800 mm";
		}
		
	@GetMapping("/typePorte10")
	private String TypePortes10() {
			
		// 10
	
		return "900 mm";
		}
		
	@GetMapping("/typePorte13")
	private String TypePortes13() {
		
		//13 et 17
		return "1000 mm";
		}
		
	@GetMapping("/typePorte21")
	private String TypePortes21() {
		
		// 21 et 26
		
		return "1300 mm";
		}
		
		
	@GetMapping("/typePorte33")
	private String TypePortes33() {			
		//33 pers	
			
		return "1400 mm";
	}
		
		
	
	@GetMapping("/finition")
	private ArrayList<String> Finition() {
		
		ArrayList<String> col = new ArrayList<String>();
		
		col.add("Vitrée");
		col.add("Epoxy");
		col.add("Inox satiné");
		col.add("Inox brossé");
		col.add("Inox mirroir");
		col.add("Inox linen");
		col.add("Inox leather skin");
		return col;
	}
	// Dimension cabine de la charge utile 4 pers	
	@GetMapping("/dimensionCabine4")
	private String dimensionCabine4() {		
		return "1.000x900x2.070";
	}
	
	
	// Dimension cabine de la charge utile 6 pers
	@GetMapping("/dimensionCabine6")
	private String dimensionCabine6() {	
		return "1.000x1.200x2.170";
	}
	
	// Dimension cabine de la charge utile 8 pers	
	@GetMapping("/dimensionCabine8")
	private String dimensionCabine8() {		
		return "1.100x1.400x2.170";
	}
	
	// Dimension cabine de la charge utile 10 pers	
	@GetMapping("/dimensionCabine10")
	private String dimensionCabine10() {		
		return "1.350x1.450x2.170";
	}
	
	
	// Dimension cabine de la charge utile 13 pers	
	@GetMapping("/dimensionCabine13")
		private ArrayList<String> DimensionCabine13() {
			
			ArrayList<String> col = new ArrayList<String>();

				col.add("1.100x2.100x2.170");
				col.add("1.400x1.600x2.170");
				return col;
	}
	
	// Dimension cabine de la charge utile 17 pers	
	@GetMapping("/dimensionCabine17")
	private String dimensionCabine17() {	
		return "1.200x2.300x2.170";
	}
	
	
	// Dimension cabine de la charge utile 21 pers	
	@GetMapping("/dimensionCabine21")
	private String dimensionCabine21() {	
		return "1.400x2.400x2.170";
	}
	
	// Dimension cabine de la charge utile 26 pers	
	@GetMapping("/dimensionCabine26")
	private String dimensionCabine26() {
		return "1.500x2.700x2.170";
	}
	
	// Dimension cabine de la charge utile 33 pers	
	@GetMapping("/dimensionCabine33")
	private String dimensionCabine33() {	
		return "1.800x2.700x2.170";
	}
	
	}
