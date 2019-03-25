package com.netcraker.edu.backend.repository;

import com.netcraker.edu.backend.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {


}
