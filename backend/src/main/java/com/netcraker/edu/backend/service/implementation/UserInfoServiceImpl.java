package com.netcraker.edu.backend.service.implementation;

import com.netcraker.edu.backend.entities.UserInfo;
import com.netcraker.edu.backend.repository.UserInfoRepository;
import com.netcraker.edu.backend.service.interfaces.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public List<UserInfo> findAll() {
        return userInfoRepository.findAll();
    }

    @Override
    public UserInfo findByPhoneNumber(String phoneNumber) {
       return userInfoRepository.findByPhoneNumber(phoneNumber);
    }

    @Override
    public UserInfo save(UserInfo userInfo) {
        return userInfoRepository.save(userInfo);
    }

    @Override
    public void delete(Long id) {
        userInfoRepository.deleteById(id);

    }

    @Override
    public Optional<UserInfo> findById(Long id) {
        return userInfoRepository.findById(id);
    }
}
