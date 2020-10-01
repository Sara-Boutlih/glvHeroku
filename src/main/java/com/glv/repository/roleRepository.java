package com.glv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glv.entities.Role;
@Repository 
public interface roleRepository extends JpaRepository<Role, Long> {

}
