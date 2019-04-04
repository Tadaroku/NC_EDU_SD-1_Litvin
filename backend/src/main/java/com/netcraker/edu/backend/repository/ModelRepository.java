package com.netcraker.edu.backend.repository;

import com.netcraker.edu.backend.entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {
    List<Model> findByBrand(String brand);
}
