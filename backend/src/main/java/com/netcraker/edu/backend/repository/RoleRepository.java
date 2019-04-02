package com.netcraker.edu.backend.repository;

import com.netcraker.edu.backend.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

//    @Query("update Role r set r.role_name = :name WHERE r.id = :role_id")
//    void setRoleName(@Param("role_id")Long id);
}
