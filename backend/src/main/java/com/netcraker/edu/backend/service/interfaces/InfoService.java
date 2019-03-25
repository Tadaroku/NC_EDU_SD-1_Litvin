package com.netcraker.edu.backend.service.interfaces;

import com.netcraker.edu.backend.entities.Info;

import java.util.List;

public interface InfoService {

    Info save(Info info);

    void delete(long id);

    List<Info> findAll();

}