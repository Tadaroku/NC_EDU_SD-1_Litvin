package com.netcraker.edu.backend.repository;

import com.netcraker.edu.backend.entities.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentRepository extends JpaRepository<Rent, Long> {
    List<Rent> findRentsByPriceBetween(double startingPrice, double finalPrice);
}
