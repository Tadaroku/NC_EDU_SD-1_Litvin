package com.netcraker.edu.backend.service.interfaces;

import com.netcraker.edu.backend.entities.Rent;

import java.util.List;
import java.util.Optional;

public interface RentService {

    List<Rent> findAll();

    Rent save(Rent rent);

    void delete(Long id);

    List<Rent> findRentsByPriceBetween(double startingPrice, double finalPrice);

    Optional<Rent> findById(Long id);
}
