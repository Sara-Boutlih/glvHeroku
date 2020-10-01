package com.glv.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glv.entities.Utilisateur;
import com.glv.repository.utilisateurRepository;
import com.glv.service.utilisateurService;
@Service("utilisateurServiceImpl")
public class utilisateurServiceImp implements utilisateurService {
	
	@Autowired
	private utilisateurRepository utilisateurRepository;

	@Transactional
	public Utilisateur addUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return utilisateurRepository.save(utilisateur);
	}

	@Transactional(readOnly = true)
	public List<Utilisateur> allUsers() {
		return utilisateurRepository.findAll();
	}

	@Transactional
	public void deleteById(Long id) {
	   utilisateurRepository.deleteById(id);
	}

	@Transactional
	public Utilisateur saveOrUpdate(Utilisateur user) {
		return utilisateurRepository.save(user);
		
	}

	@Transactional(readOnly = true)
	public Utilisateur getUserById(Long id) {
		// TODO Auto-generated method stub
		return utilisateurRepository.findById(id).get();
	}

}
