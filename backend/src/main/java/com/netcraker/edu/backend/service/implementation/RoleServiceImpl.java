package com.netcraker.edu.backend.service.implementation;

import com.netcraker.edu.backend.entities.Role;
import com.netcraker.edu.backend.repository.RoleRepository;
import com.netcraker.edu.backend.service.interfaces.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;


    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void delete(long id) {
        roleRepository.deleteById(id);

    }
}
