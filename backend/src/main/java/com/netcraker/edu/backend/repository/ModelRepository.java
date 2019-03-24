package com.netcraker.edu.backend.repository;

import com.netcraker.edu.backend.entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {
    Model findAllByBrand(String brand);
}
