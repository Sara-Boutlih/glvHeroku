package com.glv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glv.entities.Devis;
@Repository
public interface devisRepository extends JpaRepository<Devis, Long>{

}
