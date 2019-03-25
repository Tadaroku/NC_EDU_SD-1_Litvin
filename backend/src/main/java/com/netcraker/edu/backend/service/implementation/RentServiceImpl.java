package com.netcraker.edu.backend.service.implementation;

import com.netcraker.edu.backend.entities.Rent;
import com.netcraker.edu.backend.repository.RentRepository;
import com.netcraker.edu.backend.service.interfaces.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentServiceImpl implements RentService {

    @Autowired
    private RentRepository rentRepository;

    @Override
    public List<Rent> findAll() {
        return rentRepository.findAll();
    }

    @Override
    public Rent save(Rent rent) {
        return rentRepository.save(rent);
    }

    @Override
    public void delete(long id) {
        rentRepository.deleteById(id);
    }
}
