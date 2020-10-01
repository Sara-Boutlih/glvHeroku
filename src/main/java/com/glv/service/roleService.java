package com.glv.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.glv.entities.Role;

@Component
public interface roleService {

	public Role addRole(Role role);

	public List<Role> allRoles();

	public void deleteByID(long id);

	public Role saveOrUpdate(Role role);

	public Role getRoleById(Long id);


}
