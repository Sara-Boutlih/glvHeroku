package com.glv.serviceImp;


import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glv.entities.Devis;
import com.glv.repository.devisRepository;
import com.glv.service.devisService;
@Service("devisServiceImpl")
public class devisServiceImp implements devisService {
	
	@Autowired
	private devisRepository devisRepository;

	@Transactional
	public Devis addDevis(Devis devis/*,Date dated*/) {
		devis.setDateDevis(LocalDate.now());
		return devisRepository.save(devis);
	}

	@Transactional(readOnly = true)
	public List<Devis> allDevis() {
		
		return devisRepository.findAll();
	}

	@Transactional(readOnly = true)
	public Devis getDevisByID(long id) {
		
		return devisRepository.findById(id).get();
	}

	@Transactional
	public void deleteByID(long id) {
		devisRepository.deleteById(id);
		
	}

	@Transactional
	public Devis saveOrUpdate(Devis devis) {
		
		return devisRepository.save(devis);
	}
	
	

}
