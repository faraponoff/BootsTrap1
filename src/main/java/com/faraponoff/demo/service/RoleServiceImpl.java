package com.faraponoff.demo.service;

import com.faraponoff.demo.dao.RoleDAO;
import com.faraponoff.demo.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class RoleServiceImpl implements RoleService {

    private RoleDAO roleDAO;

    @Autowired
    public RoleServiceImpl(RoleDAO roleDAO) {
        this.roleDAO = roleDAO;
    }

    @Override
    public Role getRoleById(int id) {
        return roleDAO.getRoleById(id);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleDAO.getAllRoles();
    }

    @Override
    public void deleteRole(int id) {
        roleDAO.deleteRole(id);
    }

    @Override
    public Role saveRole(Role role) {
        return roleDAO.saveRole(role);
    }

    @Override
    public Role updateRole(Role role) {
        return roleDAO.updateRole(role);
    }

    @Override
    public Role getRoleByName(String roleName) {
        return roleDAO.getRoleByName(roleName);
    }
}
