package com.netcraker.edu.backend.service.interfaces;


import com.netcraker.edu.backend.entities.Role;

import java.util.List;


public interface RoleService {

    List<Role> findAll();

    Role save(Role role);

    void delete(Long id);
}
