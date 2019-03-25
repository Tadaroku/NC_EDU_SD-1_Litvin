package com.netcraker.edu.backend.service.interfaces;


import com.netcraker.edu.backend.entities.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {

    Set<Role> usersRole(long id);

    List<Role> findAll();

    Role save(Role role);

    void delete(long id);
}
