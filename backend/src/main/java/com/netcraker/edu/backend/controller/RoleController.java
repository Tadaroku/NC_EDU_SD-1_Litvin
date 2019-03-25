package com.netcraker.edu.backend.controller;

import com.netcraker.edu.backend.entities.Role;
import com.netcraker.edu.backend.service.interfaces.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/role")
public class RoleController {

    private RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Role> getAllRoles() {
        return roleService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Role saveRole(@RequestBody Role role) {
        return roleService.save(role);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteRole(@PathVariable(name = "id") Long id) {
        roleService.delete(id);
    }

}