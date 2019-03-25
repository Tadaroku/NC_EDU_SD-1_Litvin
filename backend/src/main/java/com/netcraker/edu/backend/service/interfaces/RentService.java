package com.netcraker.edu.backend.service.interfaces;

import com.netcraker.edu.backend.entities.Rent;

import java.util.List;

public interface RentService {

    List<Rent> findAll();

    Rent save(Rent rent);

    Rent findByCarId(long id);

    void delete(long id);

}
