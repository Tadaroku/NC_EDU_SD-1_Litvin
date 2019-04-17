package com.netcraker.edu.backend.service.implementation;

import com.netcraker.edu.backend.entities.Info;
import com.netcraker.edu.backend.repository.InfoRepository;
import com.netcraker.edu.backend.service.interfaces.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoServiceImpl implements InfoService {

    @Autowired
    private InfoRepository infoRepository;

    @Override
    public Info save(Info info) {
        return infoRepository.save(info);
    }

    @Override
    public void delete(Long id) {
        infoRepository.deleteById(id);
    }

    @Override
    public List<Info> findAll() {
        return infoRepository.findAll();
    }

    @Override
    public Info findByPhoneNumber(String phoneNumber) {
        return infoRepository.findByPhoneNumber(phoneNumber);
    }
}