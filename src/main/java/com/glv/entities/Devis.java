package com.glv.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="devis")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Devis implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 637612705314095815L;
	@Id
	@GeneratedValue
	private Long id;
	private String matricule;
	@CreatedDate
	private LocalDate dateDevis;
	private String client;
	private String adresse;
	private String provenance;
	private int course;
	private String arret;
	private String vitesse;
	private Long hauteurSousDalle;
	private Long cuvette;
	private String modeEntrainement;
	private String localMachinerie;
	private String acces;
	private String dimensionGaine;
	//
	private String chargeUtile;
	private String dimensionCabine;
	private String modele;
	private String porteCabine;
	private String passage;
	private String finition;
	private String accessoires;
	//private boolean ventilateur;
	//private boolean pompier;
	//private boolean afficheur;
	//private boolean gong;
	//private boolean secoursAutomatique;
	private String etat;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_user")
	private Utilisateur user;
	
	public Devis() {
		super();
		
	}

	public Devis(Long id, String matricule, LocalDate dateDevis, String client, String adresse, String provenance,
			int course, String arret, String vitesse, Long hauteurSousDalle, Long cuvette, String modeEntrainement,
			String localMachinerie, String acces, String dimensionGaine, String chargeUtile, String dimensionCabine,
			String modele, String porteCabine, String passage, String finition, String accessoires, String etat,
			Utilisateur user) {
		super();
		this.id = id;
		this.matricule = matricule;
		this.dateDevis = dateDevis;
		this.client = client;
		this.adresse = adresse;
		this.provenance = provenance;
		this.course = course;
		this.arret = arret;
		this.vitesse = vitesse;
		this.hauteurSousDalle = hauteurSousDalle;
		this.cuvette = cuvette;
		this.modeEntrainement = modeEntrainement;
		this.localMachinerie = localMachinerie;
		this.acces = acces;
		this.dimensionGaine = dimensionGaine;
		this.chargeUtile = chargeUtile;
		this.dimensionCabine = dimensionCabine;
		this.modele = modele;
		this.porteCabine = porteCabine;
		this.passage = passage;
		this.finition = finition;
		this.accessoires = accessoires;
		this.etat = etat;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public LocalDate getDateDevis() {
		return dateDevis;
	}

	public void setDateDevis(LocalDate dateDevis) {
		this.dateDevis = dateDevis;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getProvenance() {
		return provenance;
	}

	public void setProvenance(String provenance) {
		this.provenance = provenance;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public String getArret() {
		return arret;
	}

	public void setArret(String arret) {
		this.arret = arret;
	}

	public String getVitesse() {
		return vitesse;
	}

	public void setVitesse(String vitesse) {
		this.vitesse = vitesse;
	}

	public Long getHauteurSousDalle() {
		return hauteurSousDalle;
	}

	public void setHauteurSousDalle(Long hauteurSousDalle) {
		this.hauteurSousDalle = hauteurSousDalle;
	}

	public Long getCuvette() {
		return cuvette;
	}

	public void setCuvette(Long cuvette) {
		this.cuvette = cuvette;
	}

	public String getModeEntrainement() {
		return modeEntrainement;
	}

	public void setModeEntrainement(String modeEntrainement) {
		this.modeEntrainement = modeEntrainement;
	}

	public String getLocalMachinerie() {
		return localMachinerie;
	}

	public void setLocalMachinerie(String localMachinerie) {
		this.localMachinerie = localMachinerie;
	}

	public String getAcces() {
		return acces;
	}

	public void setAcces(String acces) {
		this.acces = acces;
	}

	public String getDimensionGaine() {
		return dimensionGaine;
	}

	public void setDimensionGaine(String dimensionGaine) {
		this.dimensionGaine = dimensionGaine;
	}

	public String getChargeUtile() {
		return chargeUtile;
	}

	public void setChargeUtile(String chargeUtile) {
		this.chargeUtile = chargeUtile;
	}

	public String getDimensionCabine() {
		return dimensionCabine;
	}

	public void setDimensionCabine(String dimensionCabine) {
		this.dimensionCabine = dimensionCabine;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getPorteCabine() {
		return porteCabine;
	}

	public void setPorteCabine(String porteCabine) {
		this.porteCabine = porteCabine;
	}

	public String getPassage() {
		return passage;
	}

	public void setPassage(String passage) {
		this.passage = passage;
	}

	public String getFinition() {
		return finition;
	}

	public void setFinition(String finition) {
		this.finition = finition;
	}

	public String getAccessoires() {
		return accessoires;
	}

	public void setAccessoires(String accessoires) {
		this.accessoires = accessoires;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Utilisateur getUser() {
		return user;
	}

	public void setUser(Utilisateur user) {
		this.user = user;
	}
	
	
	
		
	
}
	