package com.glv.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.glv.entities.Devis;

@Component
public interface devisService {

	public List<Devis> allDevis();
	public Devis getDevisByID(long id);
	public Devis addDevis(Devis devis);
	public void deleteByID(long id);
	public Devis saveOrUpdate(Devis devis);

}
