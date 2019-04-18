package com.netcracker.edu.fapi.service;

import com.netcracker.edu.fapi.models.Rent;

import java.util.List;

public interface RentService {

    List<Rent> findAll();

    Rent save(Rent rent);

    void delete(Long id);

    Rent findById(Long id);
}
