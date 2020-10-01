package com.glv.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glv.entities.Role;
import com.glv.repository.roleRepository;
import com.glv.service.roleService;
@Service("roleServiceImpl")
public class roleServiceImp implements roleService{
	
	@Autowired
	private roleRepository roleRepository;

	@Transactional
	public Role addRole(Role role) {
		
		return roleRepository.save(role);
	}

	@Transactional(readOnly = true)
	public List<Role> allRoles() {

		return roleRepository.findAll();
	}

	@Transactional
	public void deleteByID(long id) {
		roleRepository.deleteById(id);
		
	}

	@Transactional
	public Role saveOrUpdate(Role role) {
		return roleRepository.save(role);
	}

	@Transactional
	public Role getRoleById(Long id) {
		
		return roleRepository.findById(id).get();
	}
	

}
