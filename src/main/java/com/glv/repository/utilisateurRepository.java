package com.glv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glv.entities.Utilisateur;
@Repository
public interface utilisateurRepository extends JpaRepository<Utilisateur, Long>{

}
