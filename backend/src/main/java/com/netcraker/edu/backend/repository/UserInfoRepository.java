package com.netcraker.edu.backend.repository;

import com.netcraker.edu.backend.entities.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,Long> {
    UserInfo findByPhoneNumber(String phoneNumber);



}
