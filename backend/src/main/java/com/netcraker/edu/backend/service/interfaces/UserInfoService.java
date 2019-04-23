package com.netcraker.edu.backend.service.interfaces;

import com.netcraker.edu.backend.entities.UserInfo;

import java.util.List;
import java.util.Optional;

public interface UserInfoService {



    List<UserInfo> findAll();

    UserInfo findByPhoneNumber(String phoneNumber);

    UserInfo save(UserInfo userInfo);

    void delete(Long id);

    Optional<UserInfo> findById(Long id);
}
