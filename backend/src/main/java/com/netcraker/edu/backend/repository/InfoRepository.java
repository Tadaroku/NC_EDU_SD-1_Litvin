package com.netcraker.edu.backend.repository;

import com.netcraker.edu.backend.entities.Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends JpaRepository<Info, Long> {
    Info findByAddress(String address);
}
